import java.util.Scanner;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import task.TaskProto.Empty;
import task.TaskProto.OneString;
import task.TaskProto.Result;
import task.TaskProto.TwoNumbers;
import task.TaskServiceGrpc;

public class TaskClient {

    public static void main(String[] args) {

        String host = (args.length > 0) ? args[0] : "localhost";
        int port = (args.length > 1) ? Integer.parseInt(args[1]) : 50051;

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();

        TaskServiceGrpc.TaskServiceBlockingStub stub =
                TaskServiceGrpc.newBlockingStub(channel);

        Scanner scanner = new Scanner(System.in);

        System.out.println("gRPC Client Started");
        System.out.println("Commands:");
        System.out.println(" add a b");
        System.out.println(" sub a b");
        System.out.println(" mul a b");
        System.out.println(" div a b");
        System.out.println(" reverse text");
        System.out.println(" upper text");
        System.out.println(" wordcount text");
        System.out.println(" history");
        System.out.println(" exit");

        while (true) {

            System.out.print("\n> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ", 2);
            String cmd = parts[0].toLowerCase();

            try {
                switch (cmd) {

                    case "add": {
                        String[] nums = parts[1].split(" ");
                        call("ADD", stub.add(
                                TwoNumbers.newBuilder()
                                        .setA(Integer.parseInt(nums[0]))
                                        .setB(Integer.parseInt(nums[1]))
                                        .build()
                        ));
                        break;
                    }

                    case "sub": {
                        String[] nums = parts[1].split(" ");
                        call("SUB", stub.subtract(
                                TwoNumbers.newBuilder()
                                        .setA(Integer.parseInt(nums[0]))
                                        .setB(Integer.parseInt(nums[1]))
                                        .build()
                        ));
                        break;
                    }

                    case "mul": {
                        String[] nums = parts[1].split(" ");
                        call("MUL", stub.multiply(
                                TwoNumbers.newBuilder()
                                        .setA(Integer.parseInt(nums[0]))
                                        .setB(Integer.parseInt(nums[1]))
                                        .build()
                        ));
                        break;
                    }

                    case "div": {
                        String[] nums = parts[1].split(" ");
                        call("DIV", stub.divide(
                                TwoNumbers.newBuilder()
                                        .setA(Integer.parseInt(nums[0]))
                                        .setB(Integer.parseInt(nums[1]))
                                        .build()
                        ));
                        break;
                    }

                    case "reverse":
                        call("REVERSE", stub.reverse(
                                OneString.newBuilder().setText(parts[1]).build()
                        ));
                        break;

                    case "upper":
                        call("UPPER", stub.toUppercase(
                                OneString.newBuilder().setText(parts[1]).build()
                        ));
                        break;

                    case "wordcount":
                        call("WORDCOUNT", stub.wordCount(
                                OneString.newBuilder().setText(parts[1]).build()
                        ));
                        break;

                    case "history":
                        call("HISTORY", stub.getHistory(Empty.newBuilder().build()));
                        break;

                    default:
                        System.out.println("Unknown command");
                }

            } catch (StatusRuntimeException e) {
                System.out.printf("✗ [%s] %s%n",
                        e.getStatus().getCode(),
                        e.getStatus().getDescription());
            } catch (Exception e) {
                System.out.println("Invalid input format");
            }
        }

        channel.shutdown();
        scanner.close();
        System.out.println("Client closed");
    }

    private static void call(String label, Result r) {
        System.out.printf("%s = %s%n", label, r.getResult());
    }
}