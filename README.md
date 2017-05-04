Server Push
==

This is to demo
* client sends a request to server only once
* server responds whenever it has something to return


Start Server
===
```
$ cd target
$ java -jar serverpush-1.0-SNAPSHOT.jar
```

Run Client
===
```
$ cd target
$ java -cp serverpush-1.0-SNAPSHOT.jar com.myob.serverpush.client.Client .
```

How to Build
===
Install Protocol Buffers
```
$ brew install protobuf
```

Install [gRPC Java Codegen Plugin](https://github.com/grpc/grpc-java/tree/master/compiler)

Compile invocation
```
$ git clone this repo
$ protoc --plugin=protoc-gen-grpc-java=../grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java --proto_path=src --grpc-java_out=src/main/java/ src/main/resources/proto/serverPush.proto
$ mvn clean install
```
