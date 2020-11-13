package device;
import java.util.*;
import com.devicedemo.grpc.Device;
import com.devicedemo.grpc.deviceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.logging.Level;

public class DeviceService extends deviceGrpc.deviceImplBase {

    HashMap<String,Integer> soccerstats = new HashMap<String, Integer>();

    public  DeviceService(){
        soccerstats.put("messi",613);
        soccerstats.put("ronaldo",678);
        soccerstats.put("pele",701);
        soccerstats.put("ronaldinho",489);
        soccerstats.put("maradona",509);
        soccerstats.put("kaka",399);
        soccerstats.put("zidane",267);
        soccerstats.put("xavi",289);
    }

    @Override
    //server-side streaming RPC, server
    public void getlistservice(Device.ListRequest request, StreamObserver<Device.Response> responseObserver) {

        boolean has=false;
        System.out.println("start streaming");
        String service = request.getService();

        Device.Response.Builder response = Device.Response.newBuilder();

        if(service.equals("all")) {
            for(Map.Entry m : soccerstats.entrySet()) {
                String res =(m.getKey()+" "+m.getValue());
                System.out.println(res);
                response.setResponsemessage(res);
                responseObserver.onNext(response.build());
            }

        }
        else{
            String res = "";
            for(Map.Entry m : soccerstats.entrySet()){
                if(m.getKey().equals(service)){
                    res =(m.getKey()+" "+m.getValue());
                    has = true;
                }
            }
            if(!has){
                res = "Can't find matching service";
            }
            System.out.println(res);
            response.setResponsemessage(res);
            responseObserver.onNext(response.build());
        }
        //responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    //Simple RPC, server
    public void getservice(Device.Request request, StreamObserver<Device.Response> responseObserver) {
        System.out.println("start simple");
        String service = request.getService();
        String res;
        boolean has = false;

        Device.Response.Builder response = Device.Response.newBuilder();
        for(Map.Entry m : soccerstats.entrySet()) {
            if (service.equals(m.getKey())) {
                res = (m.getKey()+" "+m.getValue());
                has = true;
                System.out.println(res);
                response.setResponsemessage(res);

            }
        }
        if (!has) {
            res = "Can't find matching service";
            System.out.println(res);
            response.setResponsemessage(res);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    @Override
    //Client-side streaming RPC, server
    public StreamObserver<Device.Request> getsummary(StreamObserver<Device.StreamResponse> responseObserver) {
        return new StreamObserver<Device.Request>() {
            int availablecount =0;
            String joinrequest = "|";
            String error;
            @Override
            public void onNext(Device.Request request) {
                for (Map.Entry m: soccerstats.entrySet()){
                    if(request.getService().equals(m.getKey())) {
                        availablecount++;
                        joinrequest = joinrequest + request.getService() + "|";
                    }
                }
                System.out.println("New request "+request.getService());

            }

            @Override
            public void onError(Throwable throwable) {
                error=throwable.toString();
                System.out.println("Error in recieving");

            }

            @Override
            public void onCompleted() {
                Device.StreamResponse.Builder summaryresponse = Device.StreamResponse.newBuilder();
                if(availablecount ==0){
                    joinrequest = "0 services found";
                }
                summaryresponse.setCount(availablecount).setResponse(joinrequest);
                responseObserver.onNext(summaryresponse.build());
                responseObserver.onCompleted();


            }
        };
    }

    @Override
    public StreamObserver<Device.Request> getgoals(StreamObserver<Device.Response> responseObserver) {
        return new StreamObserver<Device.Request>() {

            String res;
            String error;
            Device.Response.Builder responsemessage = Device.Response.newBuilder();
            @Override
            public void onNext(Device.Request request) {
                boolean has = false;
                for (Map.Entry m: soccerstats.entrySet()){
                    if(request.getService().equals(m.getKey())){
                        res = m.getKey()+" has "+m.getValue()+" goals.";
                        has = true;

                    }
                }
                if (!has){
                    res = "Can't find service "+request.getService();
                }
                responsemessage.setResponsemessage(res);
                responseObserver.onNext(responsemessage.build());
            }

            @Override
            public void onError(Throwable throwable) {
                error=throwable.toString();
                System.out.println("Error in recieving");

            }

            @Override
            public void onCompleted() {

                responseObserver.onCompleted();

            }
        };
    }
}
