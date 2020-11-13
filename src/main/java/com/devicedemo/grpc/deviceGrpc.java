package com.devicedemo.grpc;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: device.proto")
public final class deviceGrpc {

  private deviceGrpc() {}

  public static final String SERVICE_NAME = "device";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.ListRequest,
      com.devicedemo.grpc.Device.Response> getGetlistserviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getlistservice",
      requestType = com.devicedemo.grpc.Device.ListRequest.class,
      responseType = com.devicedemo.grpc.Device.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.ListRequest,
      com.devicedemo.grpc.Device.Response> getGetlistserviceMethod() {
    io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.ListRequest, com.devicedemo.grpc.Device.Response> getGetlistserviceMethod;
    if ((getGetlistserviceMethod = deviceGrpc.getGetlistserviceMethod) == null) {
      synchronized (deviceGrpc.class) {
        if ((getGetlistserviceMethod = deviceGrpc.getGetlistserviceMethod) == null) {
          deviceGrpc.getGetlistserviceMethod = getGetlistserviceMethod = 
              io.grpc.MethodDescriptor.<com.devicedemo.grpc.Device.ListRequest, com.devicedemo.grpc.Device.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "device", "getlistservice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new deviceMethodDescriptorSupplier("getlistservice"))
                  .build();
          }
        }
     }
     return getGetlistserviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request,
      com.devicedemo.grpc.Device.Response> getGetserviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getservice",
      requestType = com.devicedemo.grpc.Device.Request.class,
      responseType = com.devicedemo.grpc.Device.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request,
      com.devicedemo.grpc.Device.Response> getGetserviceMethod() {
    io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request, com.devicedemo.grpc.Device.Response> getGetserviceMethod;
    if ((getGetserviceMethod = deviceGrpc.getGetserviceMethod) == null) {
      synchronized (deviceGrpc.class) {
        if ((getGetserviceMethod = deviceGrpc.getGetserviceMethod) == null) {
          deviceGrpc.getGetserviceMethod = getGetserviceMethod = 
              io.grpc.MethodDescriptor.<com.devicedemo.grpc.Device.Request, com.devicedemo.grpc.Device.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "device", "getservice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new deviceMethodDescriptorSupplier("getservice"))
                  .build();
          }
        }
     }
     return getGetserviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request,
      com.devicedemo.grpc.Device.StreamResponse> getGetsummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getsummary",
      requestType = com.devicedemo.grpc.Device.Request.class,
      responseType = com.devicedemo.grpc.Device.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request,
      com.devicedemo.grpc.Device.StreamResponse> getGetsummaryMethod() {
    io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request, com.devicedemo.grpc.Device.StreamResponse> getGetsummaryMethod;
    if ((getGetsummaryMethod = deviceGrpc.getGetsummaryMethod) == null) {
      synchronized (deviceGrpc.class) {
        if ((getGetsummaryMethod = deviceGrpc.getGetsummaryMethod) == null) {
          deviceGrpc.getGetsummaryMethod = getGetsummaryMethod = 
              io.grpc.MethodDescriptor.<com.devicedemo.grpc.Device.Request, com.devicedemo.grpc.Device.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "device", "getsummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new deviceMethodDescriptorSupplier("getsummary"))
                  .build();
          }
        }
     }
     return getGetsummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request,
      com.devicedemo.grpc.Device.Response> getGetgoalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getgoals",
      requestType = com.devicedemo.grpc.Device.Request.class,
      responseType = com.devicedemo.grpc.Device.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request,
      com.devicedemo.grpc.Device.Response> getGetgoalsMethod() {
    io.grpc.MethodDescriptor<com.devicedemo.grpc.Device.Request, com.devicedemo.grpc.Device.Response> getGetgoalsMethod;
    if ((getGetgoalsMethod = deviceGrpc.getGetgoalsMethod) == null) {
      synchronized (deviceGrpc.class) {
        if ((getGetgoalsMethod = deviceGrpc.getGetgoalsMethod) == null) {
          deviceGrpc.getGetgoalsMethod = getGetgoalsMethod = 
              io.grpc.MethodDescriptor.<com.devicedemo.grpc.Device.Request, com.devicedemo.grpc.Device.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "device", "getgoals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.devicedemo.grpc.Device.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new deviceMethodDescriptorSupplier("getgoals"))
                  .build();
          }
        }
     }
     return getGetgoalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static deviceStub newStub(io.grpc.Channel channel) {
    return new deviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static deviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new deviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static deviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new deviceFutureStub(channel);
  }

  /**
   */
  public static abstract class deviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getlistservice(com.devicedemo.grpc.Device.ListRequest request,
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetlistserviceMethod(), responseObserver);
    }

    /**
     */
    public void getservice(com.devicedemo.grpc.Device.Request request,
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetserviceMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Request> getsummary(
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetsummaryMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Request> getgoals(
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetgoalsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetlistserviceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.devicedemo.grpc.Device.ListRequest,
                com.devicedemo.grpc.Device.Response>(
                  this, METHODID_GETLISTSERVICE)))
          .addMethod(
            getGetserviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.devicedemo.grpc.Device.Request,
                com.devicedemo.grpc.Device.Response>(
                  this, METHODID_GETSERVICE)))
          .addMethod(
            getGetsummaryMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.devicedemo.grpc.Device.Request,
                com.devicedemo.grpc.Device.StreamResponse>(
                  this, METHODID_GETSUMMARY)))
          .addMethod(
            getGetgoalsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.devicedemo.grpc.Device.Request,
                com.devicedemo.grpc.Device.Response>(
                  this, METHODID_GETGOALS)))
          .build();
    }
  }

  /**
   */
  public static final class deviceStub extends io.grpc.stub.AbstractStub<deviceStub> {
    private deviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private deviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected deviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new deviceStub(channel, callOptions);
    }

    /**
     */
    public void getlistservice(com.devicedemo.grpc.Device.ListRequest request,
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetlistserviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getservice(com.devicedemo.grpc.Device.Request request,
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetserviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Request> getsummary(
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.StreamResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetsummaryMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Request> getgoals(
        io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetgoalsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class deviceBlockingStub extends io.grpc.stub.AbstractStub<deviceBlockingStub> {
    private deviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private deviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected deviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new deviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.devicedemo.grpc.Device.Response> getlistservice(
        com.devicedemo.grpc.Device.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetlistserviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.devicedemo.grpc.Device.Response getservice(com.devicedemo.grpc.Device.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetserviceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class deviceFutureStub extends io.grpc.stub.AbstractStub<deviceFutureStub> {
    private deviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private deviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected deviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new deviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.devicedemo.grpc.Device.Response> getservice(
        com.devicedemo.grpc.Device.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetserviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GETLISTSERVICE = 0;
  private static final int METHODID_GETSERVICE = 1;
  private static final int METHODID_GETSUMMARY = 2;
  private static final int METHODID_GETGOALS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final deviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(deviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GETLISTSERVICE:
          serviceImpl.getlistservice((com.devicedemo.grpc.Device.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response>) responseObserver);
          break;
        case METHODID_GETSERVICE:
          serviceImpl.getservice((com.devicedemo.grpc.Device.Request) request,
              (io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response>) responseObserver);
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
        case METHODID_GETSUMMARY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getsummary(
              (io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.StreamResponse>) responseObserver);
        case METHODID_GETGOALS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getgoals(
              (io.grpc.stub.StreamObserver<com.devicedemo.grpc.Device.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class deviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    deviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.devicedemo.grpc.Device.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("device");
    }
  }

  private static final class deviceFileDescriptorSupplier
      extends deviceBaseDescriptorSupplier {
    deviceFileDescriptorSupplier() {}
  }

  private static final class deviceMethodDescriptorSupplier
      extends deviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    deviceMethodDescriptorSupplier(String methodName) {
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
      synchronized (deviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new deviceFileDescriptorSupplier())
              .addMethod(getGetlistserviceMethod())
              .addMethod(getGetserviceMethod())
              .addMethod(getGetsummaryMethod())
              .addMethod(getGetgoalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
