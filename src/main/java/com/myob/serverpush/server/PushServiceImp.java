package com.myob.serverpush.server;

import com.myob.serverpush.api.PushGrpc;
import com.myob.serverpush.api.PushRequest;
import com.myob.serverpush.api.PushResponse;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class PushServiceImp extends PushGrpc.PushImplBase {

    private Random random = new Random();

    private static final Logger logger = LoggerFactory.getLogger(PushServiceImp.class);

    public void sayReady(PushRequest request, StreamObserver<PushResponse> responseObserver) {
        logger.info("Server received: " + request.getText());
        for (int i = 0; i < 100; i++) {
            long transactions = Math.abs(random.nextLong() % 5000);
            try {
                Thread.sleep(transactions);
            } catch (InterruptedException e) {
            }
            PushResponse response = PushResponse.newBuilder().setMessage(transactions + " new transactions returned").build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

}
