package com.myob.serverpush.client;

import com.myob.serverpush.api.PushGrpc;
import com.myob.serverpush.api.PushRequest;
import com.myob.serverpush.api.PushResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class GRpcClient {

    private static final Logger logger = LoggerFactory.getLogger(GRpcClient.class);

    private final ManagedChannel channel;

    private final PushGrpc.PushBlockingStub blockingStub;

    public GRpcClient(String host, int port) {
        ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true);
        channel = channelBuilder.build();
        blockingStub = PushGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws Exception {
        GRpcClient client = new GRpcClient("localhost", 50051);
        try {
            PushRequest request = PushRequest.newBuilder().setText("world").build();
            Iterator<PushResponse> it = client.blockingStub.sayReady(request);
            while (it.hasNext()) {
                logger.info("Client Received: " + it.next().getMessage());
            }
        } finally {
            client.shutdown();
        }
    }

}
