package com.myob.serverpush.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class PushServer {

    private static final Logger logger = LoggerFactory.getLogger(PushServer.class);

    private Server server;

    private int port = 50051;

    private void start() throws IOException {
        logger.info("Server started, listening on " + port);
        server = ServerBuilder
                .forPort(port)
                .addService(new PushServiceImp())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            PushServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final PushServer server = new PushServer();
        server.start();
        server.blockUntilShutdown();
    }
}