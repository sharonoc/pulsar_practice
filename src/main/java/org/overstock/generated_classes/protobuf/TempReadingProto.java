// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/temp_reading.proto

package org.overstock.generated_classes.protobuf;

public final class TempReadingProto {
  private TempReadingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TempReadingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.overstock.protos.TempReading)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional float temperature = 1;</code>
     * @return Whether the temperature field is set.
     */
    boolean hasTemperature();
    /**
     * <code>optional float temperature = 1;</code>
     * @return The temperature.
     */
    float getTemperature();
  }
  /**
   * Protobuf type {@code org.overstock.protos.TempReading}
   */
  public  static final class TempReading extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.overstock.protos.TempReading)
      TempReadingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TempReading.newBuilder() to construct.
    private TempReading(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TempReading() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TempReading();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TempReading(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13: {
              bitField0_ |= 0x00000001;
              temperature_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TempReadingProto.internal_static_org_overstock_protos_TempReading_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TempReadingProto.internal_static_org_overstock_protos_TempReading_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TempReadingProto.TempReading.class, TempReadingProto.TempReading.Builder.class);
    }

    private int bitField0_;
    public static final int TEMPERATURE_FIELD_NUMBER = 1;
    private float temperature_;
    /**
     * <code>optional float temperature = 1;</code>
     * @return Whether the temperature field is set.
     */
    public boolean hasTemperature() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional float temperature = 1;</code>
     * @return The temperature.
     */
    public float getTemperature() {
      return temperature_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeFloat(1, temperature_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, temperature_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof TempReadingProto.TempReading)) {
        return super.equals(obj);
      }
      TempReadingProto.TempReading other = (TempReadingProto.TempReading) obj;

      if (hasTemperature() != other.hasTemperature()) return false;
      if (hasTemperature()) {
        if (java.lang.Float.floatToIntBits(getTemperature())
            != java.lang.Float.floatToIntBits(
                other.getTemperature())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTemperature()) {
        hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getTemperature());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TempReadingProto.TempReading parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TempReadingProto.TempReading parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TempReadingProto.TempReading parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TempReadingProto.TempReading parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TempReadingProto.TempReading parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TempReadingProto.TempReading parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TempReadingProto.TempReading parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TempReadingProto.TempReading parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TempReadingProto.TempReading parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TempReadingProto.TempReading parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TempReadingProto.TempReading parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TempReadingProto.TempReading parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(TempReadingProto.TempReading prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.overstock.protos.TempReading}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.overstock.protos.TempReading)
        TempReadingProto.TempReadingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TempReadingProto.internal_static_org_overstock_protos_TempReading_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TempReadingProto.internal_static_org_overstock_protos_TempReading_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TempReadingProto.TempReading.class, TempReadingProto.TempReading.Builder.class);
      }

      // Construct using org.overstock.schema.proto.TempReadingProto.TempReading.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        temperature_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TempReadingProto.internal_static_org_overstock_protos_TempReading_descriptor;
      }

      @java.lang.Override
      public TempReadingProto.TempReading getDefaultInstanceForType() {
        return TempReadingProto.TempReading.getDefaultInstance();
      }

      @java.lang.Override
      public TempReadingProto.TempReading build() {
        TempReadingProto.TempReading result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public TempReadingProto.TempReading buildPartial() {
        TempReadingProto.TempReading result = new TempReadingProto.TempReading(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.temperature_ = temperature_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TempReadingProto.TempReading) {
          return mergeFrom((TempReadingProto.TempReading)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TempReadingProto.TempReading other) {
        if (other == TempReadingProto.TempReading.getDefaultInstance()) return this;
        if (other.hasTemperature()) {
          setTemperature(other.getTemperature());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        TempReadingProto.TempReading parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TempReadingProto.TempReading) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private float temperature_ ;
      /**
       * <code>optional float temperature = 1;</code>
       * @return Whether the temperature field is set.
       */
      public boolean hasTemperature() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional float temperature = 1;</code>
       * @return The temperature.
       */
      public float getTemperature() {
        return temperature_;
      }
      /**
       * <code>optional float temperature = 1;</code>
       * @param value The temperature to set.
       * @return This builder for chaining.
       */
      public Builder setTemperature(float value) {
        bitField0_ |= 0x00000001;
        temperature_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float temperature = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTemperature() {
        bitField0_ = (bitField0_ & ~0x00000001);
        temperature_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:org.overstock.protos.TempReading)
    }

    // @@protoc_insertion_point(class_scope:org.overstock.protos.TempReading)
    private static final TempReadingProto.TempReading DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TempReadingProto.TempReading();
    }

    public static TempReadingProto.TempReading getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TempReading>
        PARSER = new com.google.protobuf.AbstractParser<TempReading>() {
      @java.lang.Override
      public TempReading parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TempReading(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TempReading> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TempReading> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public TempReadingProto.TempReading getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_overstock_protos_TempReading_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_overstock_protos_TempReading_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031protos/temp_reading.proto\022\024org.oversto" +
      "ck.protos\"\"\n\013TempReading\022\023\n\013temperature\030" +
      "\001 \001(\002B\022B\020TempReadingProto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_overstock_protos_TempReading_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_overstock_protos_TempReading_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_overstock_protos_TempReading_descriptor,
        new java.lang.String[] { "Temperature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
