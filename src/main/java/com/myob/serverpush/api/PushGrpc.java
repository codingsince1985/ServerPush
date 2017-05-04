package com.myob.serverpush.api;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0-SNAPSHOT)",
    comments = "Source: main/resources/proto/serverPush.proto")
public final class PushGrpc {

  private PushGrpc() {}

  public static final String SERVICE_NAME = "serverpush.Push";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.myob.serverpush.api.PushRequest,
      com.myob.serverpush.api.PushResponse> METHOD_SAY_READY =
      io.grpc.MethodDescriptor.<com.myob.serverpush.api.PushRequest, com.myob.serverpush.api.PushResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "serverpush.Push", "SayReady"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.myob.serverpush.api.PushRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.myob.serverpush.api.PushResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PushStub newStub(io.grpc.Channel channel) {
    return new PushStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PushBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PushBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PushFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PushFutureStub(channel);
  }

  /**
   */
  public static abstract class PushImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayReady(com.myob.serverpush.api.PushRequest request,
        io.grpc.stub.StreamObserver<com.myob.serverpush.api.PushResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_READY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_READY,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.myob.serverpush.api.PushRequest,
                com.myob.serverpush.api.PushResponse>(
                  this, METHODID_SAY_READY)))
          .build();
    }
  }

  /**
   */
  public static final class PushStub extends io.grpc.stub.AbstractStub<PushStub> {
    private PushStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PushStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PushStub(channel, callOptions);
    }

    /**
     */
    public void sayReady(com.myob.serverpush.api.PushRequest request,
        io.grpc.stub.StreamObserver<com.myob.serverpush.api.PushResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SAY_READY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PushBlockingStub extends io.grpc.stub.AbstractStub<PushBlockingStub> {
    private PushBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PushBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PushBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.myob.serverpush.api.PushResponse> sayReady(
        com.myob.serverpush.api.PushRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SAY_READY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PushFutureStub extends io.grpc.stub.AbstractStub<PushFutureStub> {
    private PushFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PushFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PushFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAY_READY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PushImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PushImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_READY:
          serviceImpl.sayReady((com.myob.serverpush.api.PushRequest) request,
              (io.grpc.stub.StreamObserver<com.myob.serverpush.api.PushResponse>) responseObserver);
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

  private static final class PushDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.myob.serverpush.api.ServerPush.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PushGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PushDescriptorSupplier())
              .addMethod(METHOD_SAY_READY)
              .build();
        }
      }
    }
    return result;
  }
}
