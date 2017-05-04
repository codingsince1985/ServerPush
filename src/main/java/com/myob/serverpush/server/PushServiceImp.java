package com.myob.serverpush.server;

import com.myob.serverpush.api.PushGrpc;
import com.myob.serverpush.api.PushRequest;
import com.myob.serverpush.api.PushResponse;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushServiceImp extends PushGrpc.PushImplBase {

    private static final Logger logger = LoggerFactory.getLogger(PushServiceImp.class);

    public void sayReady(PushRequest request, StreamObserver<PushResponse> responseObserver) {
        logger.info("Server received: " + request.getText());
        PushResponse response = PushResponse.newBuilder().setMessage("hello, " + request.getText()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
