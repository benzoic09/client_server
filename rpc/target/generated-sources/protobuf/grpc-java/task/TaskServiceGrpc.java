package task;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.1)",
    comments = "Source: task.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "task.TaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = task.TaskProto.TwoNumbers.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getAddMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers, task.TaskProto.Result> getAddMethod;
    if ((getAddMethod = TaskServiceGrpc.getAddMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getAddMethod = TaskServiceGrpc.getAddMethod) == null) {
          TaskServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.TwoNumbers, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.TwoNumbers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getSubtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subtract",
      requestType = task.TaskProto.TwoNumbers.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getSubtractMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers, task.TaskProto.Result> getSubtractMethod;
    if ((getSubtractMethod = TaskServiceGrpc.getSubtractMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getSubtractMethod = TaskServiceGrpc.getSubtractMethod) == null) {
          TaskServiceGrpc.getSubtractMethod = getSubtractMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.TwoNumbers, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subtract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.TwoNumbers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Subtract"))
              .build();
        }
      }
    }
    return getSubtractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = task.TaskProto.TwoNumbers.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getMultiplyMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers, task.TaskProto.Result> getMultiplyMethod;
    if ((getMultiplyMethod = TaskServiceGrpc.getMultiplyMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getMultiplyMethod = TaskServiceGrpc.getMultiplyMethod) == null) {
          TaskServiceGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.TwoNumbers, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.TwoNumbers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Divide",
      requestType = task.TaskProto.TwoNumbers.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers,
      task.TaskProto.Result> getDivideMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.TwoNumbers, task.TaskProto.Result> getDivideMethod;
    if ((getDivideMethod = TaskServiceGrpc.getDivideMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getDivideMethod = TaskServiceGrpc.getDivideMethod) == null) {
          TaskServiceGrpc.getDivideMethod = getDivideMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.TwoNumbers, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.TwoNumbers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Divide"))
              .build();
        }
      }
    }
    return getDivideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<task.TaskProto.OneString,
      task.TaskProto.Result> getReverseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reverse",
      requestType = task.TaskProto.OneString.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.OneString,
      task.TaskProto.Result> getReverseMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.OneString, task.TaskProto.Result> getReverseMethod;
    if ((getReverseMethod = TaskServiceGrpc.getReverseMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getReverseMethod = TaskServiceGrpc.getReverseMethod) == null) {
          TaskServiceGrpc.getReverseMethod = getReverseMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.OneString, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reverse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.OneString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("Reverse"))
              .build();
        }
      }
    }
    return getReverseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<task.TaskProto.OneString,
      task.TaskProto.Result> getToUppercaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToUppercase",
      requestType = task.TaskProto.OneString.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.OneString,
      task.TaskProto.Result> getToUppercaseMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.OneString, task.TaskProto.Result> getToUppercaseMethod;
    if ((getToUppercaseMethod = TaskServiceGrpc.getToUppercaseMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getToUppercaseMethod = TaskServiceGrpc.getToUppercaseMethod) == null) {
          TaskServiceGrpc.getToUppercaseMethod = getToUppercaseMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.OneString, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToUppercase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.OneString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("ToUppercase"))
              .build();
        }
      }
    }
    return getToUppercaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<task.TaskProto.OneString,
      task.TaskProto.Result> getWordCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WordCount",
      requestType = task.TaskProto.OneString.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.OneString,
      task.TaskProto.Result> getWordCountMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.OneString, task.TaskProto.Result> getWordCountMethod;
    if ((getWordCountMethod = TaskServiceGrpc.getWordCountMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getWordCountMethod = TaskServiceGrpc.getWordCountMethod) == null) {
          TaskServiceGrpc.getWordCountMethod = getWordCountMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.OneString, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WordCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.OneString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("WordCount"))
              .build();
        }
      }
    }
    return getWordCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<task.TaskProto.Empty,
      task.TaskProto.Result> getGetHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHistory",
      requestType = task.TaskProto.Empty.class,
      responseType = task.TaskProto.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<task.TaskProto.Empty,
      task.TaskProto.Result> getGetHistoryMethod() {
    io.grpc.MethodDescriptor<task.TaskProto.Empty, task.TaskProto.Result> getGetHistoryMethod;
    if ((getGetHistoryMethod = TaskServiceGrpc.getGetHistoryMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getGetHistoryMethod = TaskServiceGrpc.getGetHistoryMethod) == null) {
          TaskServiceGrpc.getGetHistoryMethod = getGetHistoryMethod =
              io.grpc.MethodDescriptor.<task.TaskProto.Empty, task.TaskProto.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  task.TaskProto.Result.getDefaultInstance()))
              .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetHistory"))
              .build();
        }
      }
    }
    return getGetHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceStub>() {
        @java.lang.Override
        public TaskServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceStub(channel, callOptions);
        }
      };
    return TaskServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceBlockingStub>() {
        @java.lang.Override
        public TaskServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceBlockingStub(channel, callOptions);
        }
      };
    return TaskServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TaskServiceFutureStub>() {
        @java.lang.Override
        public TaskServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TaskServiceFutureStub(channel, callOptions);
        }
      };
    return TaskServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void add(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    default void subtract(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubtractMethod(), responseObserver);
    }

    /**
     */
    default void multiply(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    default void divide(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    /**
     */
    default void reverse(task.TaskProto.OneString request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReverseMethod(), responseObserver);
    }

    /**
     */
    default void toUppercase(task.TaskProto.OneString request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToUppercaseMethod(), responseObserver);
    }

    /**
     */
    default void wordCount(task.TaskProto.OneString request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWordCountMethod(), responseObserver);
    }

    /**
     */
    default void getHistory(task.TaskProto.Empty request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TaskService.
   */
  public static abstract class TaskServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TaskServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TaskService.
   */
  public static final class TaskServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TaskServiceStub> {
    private TaskServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subtract(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiply(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(task.TaskProto.TwoNumbers request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reverse(task.TaskProto.OneString request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toUppercase(task.TaskProto.OneString request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToUppercaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void wordCount(task.TaskProto.OneString request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWordCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHistory(task.TaskProto.Empty request,
        io.grpc.stub.StreamObserver<task.TaskProto.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TaskService.
   */
  public static final class TaskServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public task.TaskProto.Result add(task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public task.TaskProto.Result subtract(task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubtractMethod(), getCallOptions(), request);
    }

    /**
     */
    public task.TaskProto.Result multiply(task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public task.TaskProto.Result divide(task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }

    /**
     */
    public task.TaskProto.Result reverse(task.TaskProto.OneString request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReverseMethod(), getCallOptions(), request);
    }

    /**
     */
    public task.TaskProto.Result toUppercase(task.TaskProto.OneString request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToUppercaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public task.TaskProto.Result wordCount(task.TaskProto.OneString request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWordCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public task.TaskProto.Result getHistory(task.TaskProto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TaskService.
   */
  public static final class TaskServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> add(
        task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> subtract(
        task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> multiply(
        task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> divide(
        task.TaskProto.TwoNumbers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> reverse(
        task.TaskProto.OneString request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> toUppercase(
        task.TaskProto.OneString request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToUppercaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> wordCount(
        task.TaskProto.OneString request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWordCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<task.TaskProto.Result> getHistory(
        task.TaskProto.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_SUBTRACT = 1;
  private static final int METHODID_MULTIPLY = 2;
  private static final int METHODID_DIVIDE = 3;
  private static final int METHODID_REVERSE = 4;
  private static final int METHODID_TO_UPPERCASE = 5;
  private static final int METHODID_WORD_COUNT = 6;
  private static final int METHODID_GET_HISTORY = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((task.TaskProto.TwoNumbers) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        case METHODID_SUBTRACT:
          serviceImpl.subtract((task.TaskProto.TwoNumbers) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((task.TaskProto.TwoNumbers) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((task.TaskProto.TwoNumbers) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        case METHODID_REVERSE:
          serviceImpl.reverse((task.TaskProto.OneString) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        case METHODID_TO_UPPERCASE:
          serviceImpl.toUppercase((task.TaskProto.OneString) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        case METHODID_WORD_COUNT:
          serviceImpl.wordCount((task.TaskProto.OneString) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        case METHODID_GET_HISTORY:
          serviceImpl.getHistory((task.TaskProto.Empty) request,
              (io.grpc.stub.StreamObserver<task.TaskProto.Result>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.TwoNumbers,
              task.TaskProto.Result>(
                service, METHODID_ADD)))
        .addMethod(
          getSubtractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.TwoNumbers,
              task.TaskProto.Result>(
                service, METHODID_SUBTRACT)))
        .addMethod(
          getMultiplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.TwoNumbers,
              task.TaskProto.Result>(
                service, METHODID_MULTIPLY)))
        .addMethod(
          getDivideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.TwoNumbers,
              task.TaskProto.Result>(
                service, METHODID_DIVIDE)))
        .addMethod(
          getReverseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.OneString,
              task.TaskProto.Result>(
                service, METHODID_REVERSE)))
        .addMethod(
          getToUppercaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.OneString,
              task.TaskProto.Result>(
                service, METHODID_TO_UPPERCASE)))
        .addMethod(
          getWordCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.OneString,
              task.TaskProto.Result>(
                service, METHODID_WORD_COUNT)))
        .addMethod(
          getGetHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              task.TaskProto.Empty,
              task.TaskProto.Result>(
                service, METHODID_GET_HISTORY)))
        .build();
  }

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return task.TaskProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TaskServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getSubtractMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivideMethod())
              .addMethod(getReverseMethod())
              .addMethod(getToUppercaseMethod())
              .addMethod(getWordCountMethod())
              .addMethod(getGetHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
