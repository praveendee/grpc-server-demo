package com.google.grpc.service;

import com.google.grpc.greeting.GreeterGrpc;
import com.google.grpc.greeting.HelloReply;
import com.google.grpc.greeting.HelloRequest;
import io.grpc.stub.StreamObserver;

public class GreeterImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String name = request.getName();
        System.out.println("request name: "+ name);
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello "+ name+"!")
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
//        super.sayHello(request, responseObserver);
    }
}
