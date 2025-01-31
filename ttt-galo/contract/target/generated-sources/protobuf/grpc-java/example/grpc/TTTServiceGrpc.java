package example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: Grpc.proto")
public final class TTTServiceGrpc {

  private TTTServiceGrpc() {}

  public static final String SERVICE_NAME = "example.grpc.TTTService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.grpc.Grpc.playRequest,
      example.grpc.Grpc.playResponse> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "play",
      requestType = example.grpc.Grpc.playRequest.class,
      responseType = example.grpc.Grpc.playResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.Grpc.playRequest,
      example.grpc.Grpc.playResponse> getPlayMethod() {
    io.grpc.MethodDescriptor<example.grpc.Grpc.playRequest, example.grpc.Grpc.playResponse> getPlayMethod;
    if ((getPlayMethod = TTTServiceGrpc.getPlayMethod) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getPlayMethod = TTTServiceGrpc.getPlayMethod) == null) {
          TTTServiceGrpc.getPlayMethod = getPlayMethod =
              io.grpc.MethodDescriptor.<example.grpc.Grpc.playRequest, example.grpc.Grpc.playResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.playRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.playResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("play"))
              .build();
        }
      }
    }
    return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.grpc.Grpc.checkWinnerRequest,
      example.grpc.Grpc.checkWinnerResponse> getCheckWinnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkWinner",
      requestType = example.grpc.Grpc.checkWinnerRequest.class,
      responseType = example.grpc.Grpc.checkWinnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.Grpc.checkWinnerRequest,
      example.grpc.Grpc.checkWinnerResponse> getCheckWinnerMethod() {
    io.grpc.MethodDescriptor<example.grpc.Grpc.checkWinnerRequest, example.grpc.Grpc.checkWinnerResponse> getCheckWinnerMethod;
    if ((getCheckWinnerMethod = TTTServiceGrpc.getCheckWinnerMethod) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getCheckWinnerMethod = TTTServiceGrpc.getCheckWinnerMethod) == null) {
          TTTServiceGrpc.getCheckWinnerMethod = getCheckWinnerMethod =
              io.grpc.MethodDescriptor.<example.grpc.Grpc.checkWinnerRequest, example.grpc.Grpc.checkWinnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkWinner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.checkWinnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.checkWinnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("checkWinner"))
              .build();
        }
      }
    }
    return getCheckWinnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.grpc.Grpc.currentBoardRequest,
      example.grpc.Grpc.currentBoardResponse> getCurrentBoardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "currentBoard",
      requestType = example.grpc.Grpc.currentBoardRequest.class,
      responseType = example.grpc.Grpc.currentBoardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.Grpc.currentBoardRequest,
      example.grpc.Grpc.currentBoardResponse> getCurrentBoardMethod() {
    io.grpc.MethodDescriptor<example.grpc.Grpc.currentBoardRequest, example.grpc.Grpc.currentBoardResponse> getCurrentBoardMethod;
    if ((getCurrentBoardMethod = TTTServiceGrpc.getCurrentBoardMethod) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getCurrentBoardMethod = TTTServiceGrpc.getCurrentBoardMethod) == null) {
          TTTServiceGrpc.getCurrentBoardMethod = getCurrentBoardMethod =
              io.grpc.MethodDescriptor.<example.grpc.Grpc.currentBoardRequest, example.grpc.Grpc.currentBoardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "currentBoard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.currentBoardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.currentBoardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("currentBoard"))
              .build();
        }
      }
    }
    return getCurrentBoardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<example.grpc.Grpc.restartRequest,
      example.grpc.Grpc.restartResponse> getRestartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "restart",
      requestType = example.grpc.Grpc.restartRequest.class,
      responseType = example.grpc.Grpc.restartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.grpc.Grpc.restartRequest,
      example.grpc.Grpc.restartResponse> getRestartMethod() {
    io.grpc.MethodDescriptor<example.grpc.Grpc.restartRequest, example.grpc.Grpc.restartResponse> getRestartMethod;
    if ((getRestartMethod = TTTServiceGrpc.getRestartMethod) == null) {
      synchronized (TTTServiceGrpc.class) {
        if ((getRestartMethod = TTTServiceGrpc.getRestartMethod) == null) {
          TTTServiceGrpc.getRestartMethod = getRestartMethod =
              io.grpc.MethodDescriptor.<example.grpc.Grpc.restartRequest, example.grpc.Grpc.restartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "restart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.restartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.grpc.Grpc.restartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TTTServiceMethodDescriptorSupplier("restart"))
              .build();
        }
      }
    }
    return getRestartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TTTServiceStub newStub(io.grpc.Channel channel) {
    return new TTTServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TTTServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TTTServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TTTServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TTTServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TTTServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void play(example.grpc.Grpc.playRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.playResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     */
    public void checkWinner(example.grpc.Grpc.checkWinnerRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.checkWinnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckWinnerMethod(), responseObserver);
    }

    /**
     */
    public void currentBoard(example.grpc.Grpc.currentBoardRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.currentBoardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentBoardMethod(), responseObserver);
    }

    /**
     */
    public void restart(example.grpc.Grpc.restartRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.restartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRestartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.Grpc.playRequest,
                example.grpc.Grpc.playResponse>(
                  this, METHODID_PLAY)))
          .addMethod(
            getCheckWinnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.Grpc.checkWinnerRequest,
                example.grpc.Grpc.checkWinnerResponse>(
                  this, METHODID_CHECK_WINNER)))
          .addMethod(
            getCurrentBoardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.Grpc.currentBoardRequest,
                example.grpc.Grpc.currentBoardResponse>(
                  this, METHODID_CURRENT_BOARD)))
          .addMethod(
            getRestartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.grpc.Grpc.restartRequest,
                example.grpc.Grpc.restartResponse>(
                  this, METHODID_RESTART)))
          .build();
    }
  }

  /**
   */
  public static final class TTTServiceStub extends io.grpc.stub.AbstractStub<TTTServiceStub> {
    private TTTServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TTTServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TTTServiceStub(channel, callOptions);
    }

    /**
     */
    public void play(example.grpc.Grpc.playRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.playResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkWinner(example.grpc.Grpc.checkWinnerRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.checkWinnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckWinnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void currentBoard(example.grpc.Grpc.currentBoardRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.currentBoardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentBoardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restart(example.grpc.Grpc.restartRequest request,
        io.grpc.stub.StreamObserver<example.grpc.Grpc.restartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TTTServiceBlockingStub extends io.grpc.stub.AbstractStub<TTTServiceBlockingStub> {
    private TTTServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TTTServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TTTServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.grpc.Grpc.playResponse play(example.grpc.Grpc.playRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.grpc.Grpc.checkWinnerResponse checkWinner(example.grpc.Grpc.checkWinnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckWinnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.grpc.Grpc.currentBoardResponse currentBoard(example.grpc.Grpc.currentBoardRequest request) {
      return blockingUnaryCall(
          getChannel(), getCurrentBoardMethod(), getCallOptions(), request);
    }

    /**
     */
    public example.grpc.Grpc.restartResponse restart(example.grpc.Grpc.restartRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TTTServiceFutureStub extends io.grpc.stub.AbstractStub<TTTServiceFutureStub> {
    private TTTServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TTTServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TTTServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TTTServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.Grpc.playResponse> play(
        example.grpc.Grpc.playRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.Grpc.checkWinnerResponse> checkWinner(
        example.grpc.Grpc.checkWinnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckWinnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.Grpc.currentBoardResponse> currentBoard(
        example.grpc.Grpc.currentBoardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentBoardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.grpc.Grpc.restartResponse> restart(
        example.grpc.Grpc.restartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY = 0;
  private static final int METHODID_CHECK_WINNER = 1;
  private static final int METHODID_CURRENT_BOARD = 2;
  private static final int METHODID_RESTART = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TTTServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TTTServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY:
          serviceImpl.play((example.grpc.Grpc.playRequest) request,
              (io.grpc.stub.StreamObserver<example.grpc.Grpc.playResponse>) responseObserver);
          break;
        case METHODID_CHECK_WINNER:
          serviceImpl.checkWinner((example.grpc.Grpc.checkWinnerRequest) request,
              (io.grpc.stub.StreamObserver<example.grpc.Grpc.checkWinnerResponse>) responseObserver);
          break;
        case METHODID_CURRENT_BOARD:
          serviceImpl.currentBoard((example.grpc.Grpc.currentBoardRequest) request,
              (io.grpc.stub.StreamObserver<example.grpc.Grpc.currentBoardResponse>) responseObserver);
          break;
        case METHODID_RESTART:
          serviceImpl.restart((example.grpc.Grpc.restartRequest) request,
              (io.grpc.stub.StreamObserver<example.grpc.Grpc.restartResponse>) responseObserver);
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

  private static abstract class TTTServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TTTServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.grpc.Grpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TTTService");
    }
  }

  private static final class TTTServiceFileDescriptorSupplier
      extends TTTServiceBaseDescriptorSupplier {
    TTTServiceFileDescriptorSupplier() {}
  }

  private static final class TTTServiceMethodDescriptorSupplier
      extends TTTServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TTTServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TTTServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TTTServiceFileDescriptorSupplier())
              .addMethod(getPlayMethod())
              .addMethod(getCheckWinnerMethod())
              .addMethod(getCurrentBoardMethod())
              .addMethod(getRestartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
