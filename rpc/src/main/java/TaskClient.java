import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import task.TaskProto.Empty;
import task.TaskProto.OneString;
import task.TaskProto.Result;
import task.TaskProto.TwoNumbers;
import task.TaskServiceGrpc;

public class TaskClient {

    // ── Requirement 11: host and port from args, not hardcoded ───────────────
    // Usage: java TaskClient [host] [port]   (defaults to localhost:50051)
    public static void main(String[] args) {

        String host = (args.length > 0) ? args[0] : "localhost";
        int    port = (args.length > 1) ? Integer.parseInt(args[1]) : 50051;

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();

        // ── Requirement 9: invoke via generated stub — no manual socket code ─
        TaskServiceGrpc.TaskServiceBlockingStub stub =
                TaskServiceGrpc.newBlockingStub(channel);

        try {
            // Arithmetic
            call("ADD 10+4",   () -> stub.add(TwoNumbers.newBuilder().setA(10).setB(4).build()));
            call("SUB 10-4",   () -> stub.subtract(TwoNumbers.newBuilder().setA(10).setB(4).build()));
            call("MUL 6×7",    () -> stub.multiply(TwoNumbers.newBuilder().setA(6).setB(7).build()));
            call("DIV 20÷4",   () -> stub.divide(TwoNumbers.newBuilder().setA(20).setB(4).build()));

            // ── Requirement 10: client catches StatusRuntimeException ─────────
            System.out.println("\n-- Testing RPC error propagation --");
            call("DIV 5÷0",    () -> stub.divide(TwoNumbers.newBuilder().setA(5).setB(0).build()));

            // String operations
            call("REVERSE",    () -> stub.reverse(OneString.newBuilder().setText("hello").build()));
            call("UPPER",      () -> stub.toUppercase(OneString.newBuilder().setText("world").build()));
            call("WORDCOUNT",  () -> stub.wordCount(OneString.newBuilder().setText("the quick brown fox").build()));

            // History
            call("HISTORY",    () -> stub.getHistory(Empty.newBuilder().build()));

        } finally {
            channel.shutdown();
        }
    }

    // Wrapper: catches StatusRuntimeException from the framework (Requirement 10)
    interface RpcCall { Result execute(); }

    private static void call(String label, RpcCall rpc) {
        try {
            Result r = rpc.execute();
            System.out.printf("%-12s → %s%n", label, r.getResult());
        } catch (StatusRuntimeException e) {
            // The gRPC framework deserialises the server's Status and throws here
            System.out.printf("%-12s ✗ [%s] %s%n",
                label,
                e.getStatus().getCode(),        // e.g. INVALID_ARGUMENT
                e.getStatus().getDescription()); // e.g. "Division by zero"
        }
    }
}