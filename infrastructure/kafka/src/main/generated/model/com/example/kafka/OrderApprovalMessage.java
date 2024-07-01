/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.kafka;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class OrderApprovalMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7284052322495479925L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderApprovalMessage\",\"namespace\":\"com.example.kafka\",\"fields\":[{\"name\":\"orderId\",\"type\":\"long\"},{\"name\":\"productId\",\"type\":\"int\"},{\"name\":\"quantity\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderApprovalMessage> ENCODER =
      new BinaryMessageEncoder<OrderApprovalMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderApprovalMessage> DECODER =
      new BinaryMessageDecoder<OrderApprovalMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderApprovalMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderApprovalMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderApprovalMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderApprovalMessage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderApprovalMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderApprovalMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderApprovalMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderApprovalMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long orderId;
  private int productId;
  private int quantity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderApprovalMessage() {}

  /**
   * All-args constructor.
   * @param orderId The new value for orderId
   * @param productId The new value for productId
   * @param quantity The new value for quantity
   */
  public OrderApprovalMessage(java.lang.Long orderId, java.lang.Integer productId, java.lang.Integer quantity) {
    this.orderId = orderId;
    this.productId = productId;
    this.quantity = quantity;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderId;
    case 1: return productId;
    case 2: return quantity;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderId = (java.lang.Long)value$; break;
    case 1: productId = (java.lang.Integer)value$; break;
    case 2: quantity = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'orderId' field.
   * @return The value of the 'orderId' field.
   */
  public long getOrderId() {
    return orderId;
  }


  /**
   * Sets the value of the 'orderId' field.
   * @param value the value to set.
   */
  public void setOrderId(long value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public int getProductId() {
    return productId;
  }


  /**
   * Sets the value of the 'productId' field.
   * @param value the value to set.
   */
  public void setProductId(int value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public int getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(int value) {
    this.quantity = value;
  }

  /**
   * Creates a new OrderApprovalMessage RecordBuilder.
   * @return A new OrderApprovalMessage RecordBuilder
   */
  public static com.example.kafka.OrderApprovalMessage.Builder newBuilder() {
    return new com.example.kafka.OrderApprovalMessage.Builder();
  }

  /**
   * Creates a new OrderApprovalMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderApprovalMessage RecordBuilder
   */
  public static com.example.kafka.OrderApprovalMessage.Builder newBuilder(com.example.kafka.OrderApprovalMessage.Builder other) {
    if (other == null) {
      return new com.example.kafka.OrderApprovalMessage.Builder();
    } else {
      return new com.example.kafka.OrderApprovalMessage.Builder(other);
    }
  }

  /**
   * Creates a new OrderApprovalMessage RecordBuilder by copying an existing OrderApprovalMessage instance.
   * @param other The existing instance to copy.
   * @return A new OrderApprovalMessage RecordBuilder
   */
  public static com.example.kafka.OrderApprovalMessage.Builder newBuilder(com.example.kafka.OrderApprovalMessage other) {
    if (other == null) {
      return new com.example.kafka.OrderApprovalMessage.Builder();
    } else {
      return new com.example.kafka.OrderApprovalMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderApprovalMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderApprovalMessage>
    implements org.apache.avro.data.RecordBuilder<OrderApprovalMessage> {

    private long orderId;
    private int productId;
    private int quantity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.kafka.OrderApprovalMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderId)) {
        this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.productId)) {
        this.productId = data().deepCopy(fields()[1].schema(), other.productId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderApprovalMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.kafka.OrderApprovalMessage other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.orderId)) {
        this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productId)) {
        this.productId = data().deepCopy(fields()[1].schema(), other.productId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'orderId' field.
      * @return The value.
      */
    public long getOrderId() {
      return orderId;
    }


    /**
      * Sets the value of the 'orderId' field.
      * @param value The value of 'orderId'.
      * @return This builder.
      */
    public com.example.kafka.OrderApprovalMessage.Builder setOrderId(long value) {
      validate(fields()[0], value);
      this.orderId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderId' field has been set.
      * @return True if the 'orderId' field has been set, false otherwise.
      */
    public boolean hasOrderId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orderId' field.
      * @return This builder.
      */
    public com.example.kafka.OrderApprovalMessage.Builder clearOrderId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public int getProductId() {
      return productId;
    }


    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public com.example.kafka.OrderApprovalMessage.Builder setProductId(int value) {
      validate(fields()[1], value);
      this.productId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public com.example.kafka.OrderApprovalMessage.Builder clearProductId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public int getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.example.kafka.OrderApprovalMessage.Builder setQuantity(int value) {
      validate(fields()[2], value);
      this.quantity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public com.example.kafka.OrderApprovalMessage.Builder clearQuantity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderApprovalMessage build() {
      try {
        OrderApprovalMessage record = new OrderApprovalMessage();
        record.orderId = fieldSetFlags()[0] ? this.orderId : (java.lang.Long) defaultValue(fields()[0]);
        record.productId = fieldSetFlags()[1] ? this.productId : (java.lang.Integer) defaultValue(fields()[1]);
        record.quantity = fieldSetFlags()[2] ? this.quantity : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderApprovalMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderApprovalMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderApprovalMessage>
    READER$ = (org.apache.avro.io.DatumReader<OrderApprovalMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.orderId);

    out.writeInt(this.productId);

    out.writeInt(this.quantity);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.orderId = in.readLong();

      this.productId = in.readInt();

      this.quantity = in.readInt();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.orderId = in.readLong();
          break;

        case 1:
          this.productId = in.readInt();
          break;

        case 2:
          this.quantity = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










