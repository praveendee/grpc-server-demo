// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.google.grpc.greeting;

public final class GreetingProto {
  private GreetingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016greeting.proto\022\010greeting\"\034\n\014HelloReque" +
      "st\022\014\n\004name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007messag" +
      "e\030\001 \001(\t2E\n\007Greeter\022:\n\010SayHello\022\026.greetin" +
      "g.HelloRequest\032\024.greeting.HelloReply\"\000B1" +
      "\n\030com.google.grpc.greetingB\rGreetingProt" +
      "oP\001\242\002\003GRTb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greeting_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greeting_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_greeting_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greeting_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
