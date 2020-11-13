import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.devicedemo.grpc.Device;
import com.devicedemo.grpc.deviceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;
import java.util.List;

import java.util.logging.Logger;


public  class Client{

    //method for client-side streaming RPC
    public static void recordService(List<Device.Request> requests, int numrequests) throws  InterruptedException{

        System.out.println("Client-side stream responses starts----- ");

        Logger logger = Logger.getLogger(Client.class.getName());
        logger.info("Recording Starts");
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<Device.StreamResponse> responseObserver= new StreamObserver<Device.StreamResponse>() {
            @Override
            public void onNext(Device.StreamResponse streamResponse) {
                System.out.println("Available Services: "+streamResponse.getResponse());
                System.out.println("Found "+streamResponse.getCount()+" services");
            }

            @Override
            public void onError(Throwable throwable) {
                Status status = Status.fromThrowable(throwable);
                logger.info("Recording Failed");
                finishLatch.countDown();

            }

            @Override
            public void onCompleted() {
                logger.info("Finished Recording");
                finishLatch.countDown();

            }
        };
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",1010).usePlaintext().build();

        final deviceGrpc.deviceStub asyncStub = deviceGrpc.newStub(channel);

        StreamObserver<Device.Request> requestObserver = asyncStub.getsummary(responseObserver);

        try{
            for( int i = 0; i < numrequests; ++i){
                Device.Request request = requests.get(i);
                logger.info("get service info: "+request);
                requestObserver.onNext(request);
                //sleep for a bit before sending next request
                Thread.sleep(1000);
                if (finishLatch.getCount()==0){
                    return;
                }
            }

        } catch (RuntimeException e) {

            //cancel RPC
            requestObserver.onError(e);
            throw e;
        }
        //mark the end of requests
        requestObserver.onCompleted();

        //Receiving happens asynchronously
        finishLatch.await(1, TimeUnit.MINUTES);


    }

    //method for Bi-directional streaming RPC
    public static void findService(List<Device.Request> requests) throws Exception{

        System.out.println("Bi-directional stream responses starts----- ");

        Logger logger = Logger.getLogger(Client.class.getName());
        logger.info(" Finding Starts ");
        final  CountDownLatch finishLatch = new CountDownLatch(1);

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",1010).usePlaintext().build();
        final deviceGrpc.deviceStub asyncStub = deviceGrpc.newStub(channel);
        StreamObserver<Device.Request> requestObserver = asyncStub.getgoals(new StreamObserver<Device.Response>() {
            @Override
            public void onNext(Device.Response response) {
                System.out.println(response.getResponsemessage());
            }

            @Override
            public void onError(Throwable throwable) {
                Status status = Status.fromThrowable(throwable);
                logger.info("Finding Failure");
                finishLatch.getCount();

            }

            @Override
            public void onCompleted() {
                logger.info("Finished Finding");

            }
        });
        try {
            for (Device.Request request : requests){
                logger.info("sending request : "+ request.getService());
                requestObserver.onNext(request);
                Thread.sleep(1000);
                if (finishLatch.getCount()==0){
                    return;
                }

            }

        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }
        requestObserver.onCompleted();

        finishLatch.await(1, TimeUnit.MINUTES);

    }

    public static void getStream(String request){

        //configuration of the channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",1010).usePlaintext().build();

        //define the synchronus client stub
        deviceGrpc.deviceBlockingStub clientstub = deviceGrpc.newBlockingStub(channel);

        System.out.println("Server-side stream RPC starts----- ");
        //define the request for server-side streaming
        Device.ListRequest servicerequest = Device.ListRequest.newBuilder().setService(request).build();

        //define the iterator which store the recieving stream responses of the server
        Iterator<Device.Response> responses = clientstub.getlistservice(servicerequest);

        //print the stream responses
        while (responses.hasNext()) {
            System.out.println(responses.next().getResponsemessage());
        }
    }

    public static void getsimple(String request){

        //configuration of the channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",1010).usePlaintext().build();

        //define the synchronus client stub
        deviceGrpc.deviceBlockingStub clientstub = deviceGrpc.newBlockingStub(channel);

        System.out.println("Simple RPC starts----- ");
        //define the request for simple RPC
        Device.Request simplerequest = Device.Request.newBuilder().setService(request).build();

        //store and print the request for the simple request
        Device.Response simpleresponse = clientstub.getservice(simplerequest);
        System.out.println(simpleresponse.getResponsemessage());

    }

    public static void main(String[] args) throws Exception {

        //method call for simple RPC
        getsimple("ronaldo");

        Thread.sleep(1000);

        //method call for Server-side streaming RPC
        getStream("all");

        Thread.sleep(1000);

        //define and add the service requests for client-side/Bi-directional streaming
        List<Device.Request> testrequests = new ArrayList<Device.Request>();
        testrequests.add(Device.Request.newBuilder().setService("messi").build());
        testrequests.add(Device.Request.newBuilder().setService("ronaldo").build());
        testrequests.add(Device.Request.newBuilder().setService("pele").build());
        testrequests.add(Device.Request.newBuilder().setService("maradona").build());
        testrequests.add(Device.Request.newBuilder().setService("ronaldinho").build());
        testrequests.add(Device.Request.newBuilder().setService("nimal").build());
        testrequests.add(Device.Request.newBuilder().setService("kamal").build());


        //method call for Client-side streaming RPC
        recordService(testrequests,7);

        Thread.sleep(1000);

        //method call for Bi-directional streaming RPC
        findService(testrequests);





    }
}