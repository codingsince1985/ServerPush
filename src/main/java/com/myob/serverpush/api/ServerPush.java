// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/proto/serverPush.proto

package com.myob.serverpush.api;

public final class ServerPush {
  private ServerPush() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serverpush_PushRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serverpush_PushRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_serverpush_PushResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_serverpush_PushResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%main/resources/proto/serverPush.proto\022" +
      "\nserverpush\"\033\n\013PushRequest\022\014\n\004text\030\001 \001(\t" +
      "\"\037\n\014PushResponse\022\017\n\007message\030\001 \001(\t2G\n\004Pus" +
      "h\022?\n\010SayReady\022\027.serverpush.PushRequest\032\030" +
      ".serverpush.PushResponse\"\000B\'\n\027com.myob.s" +
      "erverpush.apiB\nServerPushP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_serverpush_PushRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_serverpush_PushRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serverpush_PushRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_serverpush_PushResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_serverpush_PushResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_serverpush_PushResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
