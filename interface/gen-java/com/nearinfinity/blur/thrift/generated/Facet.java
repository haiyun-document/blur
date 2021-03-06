/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.nearinfinity.blur.thrift.generated;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Blur facet.
 */
public class Facet implements org.apache.thrift.TBase<Facet, Facet._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Facet");

  private static final org.apache.thrift.protocol.TField QUERY_STR_FIELD_DESC = new org.apache.thrift.protocol.TField("queryStr", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MINIMUM_NUMBER_OF_BLUR_RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("minimumNumberOfBlurResults", org.apache.thrift.protocol.TType.I64, (short)2);

  public String queryStr; // required
  public long minimumNumberOfBlurResults; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUERY_STR((short)1, "queryStr"),
    MINIMUM_NUMBER_OF_BLUR_RESULTS((short)2, "minimumNumberOfBlurResults");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUERY_STR
          return QUERY_STR;
        case 2: // MINIMUM_NUMBER_OF_BLUR_RESULTS
          return MINIMUM_NUMBER_OF_BLUR_RESULTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MINIMUMNUMBEROFBLURRESULTS_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY_STR, new org.apache.thrift.meta_data.FieldMetaData("queryStr", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MINIMUM_NUMBER_OF_BLUR_RESULTS, new org.apache.thrift.meta_data.FieldMetaData("minimumNumberOfBlurResults", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Facet.class, metaDataMap);
  }

  public Facet() {
    this.minimumNumberOfBlurResults = 9223372036854775807L;

  }

  public Facet(
    String queryStr,
    long minimumNumberOfBlurResults)
  {
    this();
    this.queryStr = queryStr;
    this.minimumNumberOfBlurResults = minimumNumberOfBlurResults;
    setMinimumNumberOfBlurResultsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Facet(Facet other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetQueryStr()) {
      this.queryStr = other.queryStr;
    }
    this.minimumNumberOfBlurResults = other.minimumNumberOfBlurResults;
  }

  public Facet deepCopy() {
    return new Facet(this);
  }

  @Override
  public void clear() {
    this.queryStr = null;
    this.minimumNumberOfBlurResults = 9223372036854775807L;

  }

  public String getQueryStr() {
    return this.queryStr;
  }

  public Facet setQueryStr(String queryStr) {
    this.queryStr = queryStr;
    return this;
  }

  public void unsetQueryStr() {
    this.queryStr = null;
  }

  /** Returns true if field queryStr is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryStr() {
    return this.queryStr != null;
  }

  public void setQueryStrIsSet(boolean value) {
    if (!value) {
      this.queryStr = null;
    }
  }

  public long getMinimumNumberOfBlurResults() {
    return this.minimumNumberOfBlurResults;
  }

  public Facet setMinimumNumberOfBlurResults(long minimumNumberOfBlurResults) {
    this.minimumNumberOfBlurResults = minimumNumberOfBlurResults;
    setMinimumNumberOfBlurResultsIsSet(true);
    return this;
  }

  public void unsetMinimumNumberOfBlurResults() {
    __isset_bit_vector.clear(__MINIMUMNUMBEROFBLURRESULTS_ISSET_ID);
  }

  /** Returns true if field minimumNumberOfBlurResults is set (has been assigned a value) and false otherwise */
  public boolean isSetMinimumNumberOfBlurResults() {
    return __isset_bit_vector.get(__MINIMUMNUMBEROFBLURRESULTS_ISSET_ID);
  }

  public void setMinimumNumberOfBlurResultsIsSet(boolean value) {
    __isset_bit_vector.set(__MINIMUMNUMBEROFBLURRESULTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERY_STR:
      if (value == null) {
        unsetQueryStr();
      } else {
        setQueryStr((String)value);
      }
      break;

    case MINIMUM_NUMBER_OF_BLUR_RESULTS:
      if (value == null) {
        unsetMinimumNumberOfBlurResults();
      } else {
        setMinimumNumberOfBlurResults((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERY_STR:
      return getQueryStr();

    case MINIMUM_NUMBER_OF_BLUR_RESULTS:
      return Long.valueOf(getMinimumNumberOfBlurResults());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERY_STR:
      return isSetQueryStr();
    case MINIMUM_NUMBER_OF_BLUR_RESULTS:
      return isSetMinimumNumberOfBlurResults();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Facet)
      return this.equals((Facet)that);
    return false;
  }

  public boolean equals(Facet that) {
    if (that == null)
      return false;

    boolean this_present_queryStr = true && this.isSetQueryStr();
    boolean that_present_queryStr = true && that.isSetQueryStr();
    if (this_present_queryStr || that_present_queryStr) {
      if (!(this_present_queryStr && that_present_queryStr))
        return false;
      if (!this.queryStr.equals(that.queryStr))
        return false;
    }

    boolean this_present_minimumNumberOfBlurResults = true;
    boolean that_present_minimumNumberOfBlurResults = true;
    if (this_present_minimumNumberOfBlurResults || that_present_minimumNumberOfBlurResults) {
      if (!(this_present_minimumNumberOfBlurResults && that_present_minimumNumberOfBlurResults))
        return false;
      if (this.minimumNumberOfBlurResults != that.minimumNumberOfBlurResults)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Facet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Facet typedOther = (Facet)other;

    lastComparison = Boolean.valueOf(isSetQueryStr()).compareTo(typedOther.isSetQueryStr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryStr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryStr, typedOther.queryStr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinimumNumberOfBlurResults()).compareTo(typedOther.isSetMinimumNumberOfBlurResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinimumNumberOfBlurResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minimumNumberOfBlurResults, typedOther.minimumNumberOfBlurResults);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // QUERY_STR
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.queryStr = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // MINIMUM_NUMBER_OF_BLUR_RESULTS
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.minimumNumberOfBlurResults = iprot.readI64();
            setMinimumNumberOfBlurResultsIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.queryStr != null) {
      oprot.writeFieldBegin(QUERY_STR_FIELD_DESC);
      oprot.writeString(this.queryStr);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(MINIMUM_NUMBER_OF_BLUR_RESULTS_FIELD_DESC);
    oprot.writeI64(this.minimumNumberOfBlurResults);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Facet(");
    boolean first = true;

    sb.append("queryStr:");
    if (this.queryStr == null) {
      sb.append("null");
    } else {
      sb.append(this.queryStr);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("minimumNumberOfBlurResults:");
    sb.append(this.minimumNumberOfBlurResults);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

