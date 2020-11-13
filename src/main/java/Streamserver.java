import device.DeviceService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
//configuration of the server
public class Streamserver {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.
                forPort(1010).addService(new DeviceService()).build();

        server.start();

        System.out.println("Server started at "+ server.getPort());

        server.awaitTermination();
    }

}