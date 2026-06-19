import java.io.IOException;
import java.util.LinkedList;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import task.TaskProto.Empty;
import task.TaskProto.OneString;
import task.TaskProto.Result;
import task.TaskProto.TwoNumbers;
import task.TaskServiceGrpc;

public class TaskServer {

    private static final LinkedList<String> history = new LinkedList<>();

    // ── Requirement 11: configurable address ─────────────────────────────────
    // Usage: java TaskServer [port]          (defaults to 50051)
    public static void main(String[] args) throws IOException, InterruptedException {

        int port = (args.length > 0) ? Integer.parseInt(args[0]) : 50051;

        Server server = ServerBuilder.forPort(port)
                .addService(new TaskServiceImpl())
                .build();

        System.out.println("gRPC Server started on port " + port + "...");
        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server...");
            server.shutdown();
        }));

        server.awaitTermination();
    }

    // ── Requirement 8: all operations registered via gRPC framework ──────────
    static class TaskServiceImpl extends TaskServiceGrpc.TaskServiceImplBase {

        private synchronized void addHistory(String entry) {
            history.add(entry);
            if (history.size() > 10) history.removeFirst();
        }

        // Helper: build a Result and complete the call in one step
        private void respond(StreamObserver<Result> obs, String value, String historyEntry) {
            if (historyEntry != null) addHistory(historyEntry);
            obs.onNext(Result.newBuilder().setResult(value).build());
            obs.onCompleted();
        }

        // ── Requirement 10: errors propagated via StatusRuntimeException ──────
        // The framework transmits the Status code + description to the client,
        // which receives a StatusRuntimeException — no manual socket work needed.
        private void fail(StreamObserver<?> obs, Status status, String description) {
            obs.onError(status.withDescription(description).asRuntimeException());
        }

        @Override
        public void add(TwoNumbers req, StreamObserver<Result> obs) {
            respond(obs,
                String.valueOf(req.getA() + req.getB()),
                "ADD " + req.getA() + " " + req.getB());
        }

        @Override
        public void subtract(TwoNumbers req, StreamObserver<Result> obs) {
            respond(obs,
                String.valueOf(req.getA() - req.getB()),
                "SUB " + req.getA() + " " + req.getB());
        }

        @Override
        public void multiply(TwoNumbers req, StreamObserver<Result> obs) {
            respond(obs,
                String.valueOf(req.getA() * req.getB()),
                "MUL " + req.getA() + " " + req.getB());
        }

        @Override
        public void divide(TwoNumbers req, StreamObserver<Result> obs) {
            // Requirement 10: use INVALID_ARGUMENT status, not an error string
            if (req.getB() == 0) {
                fail(obs, Status.INVALID_ARGUMENT, "Division by zero");
                return;
            }
            respond(obs,
                String.valueOf(req.getA() / req.getB()),
                "DIV " + req.getA() + " " + req.getB());
        }

        @Override
        public void reverse(OneString req, StreamObserver<Result> obs) {
            if (req.getText().isEmpty()) {
                fail(obs, Status.INVALID_ARGUMENT, "Input text must not be empty");
                return;
            }
            respond(obs,
                new StringBuilder(req.getText()).reverse().toString(),
                "REVERSE " + req.getText());
        }

        @Override
        public void toUppercase(OneString req, StreamObserver<Result> obs) {
            if (req.getText().isEmpty()) {
                fail(obs, Status.INVALID_ARGUMENT, "Input text must not be empty");
                return;
            }
            respond(obs,
                req.getText().toUpperCase(),
                "UPPER " + req.getText());
        }

        @Override
        public void wordCount(OneString req, StreamObserver<Result> obs) {
            String text = req.getText().trim();
            int count = text.isEmpty() ? 0 : text.split("\\s+").length;
            respond(obs,
                String.valueOf(count),
                "WORDCOUNT " + req.getText());
        }

        @Override
        public void getHistory(Empty req, StreamObserver<Result> obs) {
            respond(obs, history.toString(), null);
        }
    }
}