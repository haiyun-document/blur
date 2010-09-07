/**
 * Autogenerated by Thrift
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
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class DocumentFamily implements TBase<DocumentFamily, DocumentFamily._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("DocumentFamily");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField DOCUMENTS_FIELD_DESC = new TField("documents", TType.LIST, (short)2);

  public String name;
  public List<Document> documents;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    DOCUMENTS((short)2, "documents");

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
        case 1: // NAME
          return NAME;
        case 2: // DOCUMENTS
          return DOCUMENTS;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DOCUMENTS, new FieldMetaData("documents", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Document.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(DocumentFamily.class, metaDataMap);
  }

  public DocumentFamily() {
  }

  public DocumentFamily(
    String name,
    List<Document> documents)
  {
    this();
    this.name = name;
    this.documents = documents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DocumentFamily(DocumentFamily other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDocuments()) {
      List<Document> __this__documents = new ArrayList<Document>();
      for (Document other_element : other.documents) {
        __this__documents.add(new Document(other_element));
      }
      this.documents = __this__documents;
    }
  }

  public DocumentFamily deepCopy() {
    return new DocumentFamily(this);
  }

  @Deprecated
  public DocumentFamily clone() {
    return new DocumentFamily(this);
  }

  public String getName() {
    return this.name;
  }

  public DocumentFamily setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getDocumentsSize() {
    return (this.documents == null) ? 0 : this.documents.size();
  }

  public java.util.Iterator<Document> getDocumentsIterator() {
    return (this.documents == null) ? null : this.documents.iterator();
  }

  public void addToDocuments(Document elem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(elem);
  }

  public List<Document> getDocuments() {
    return this.documents;
  }

  public DocumentFamily setDocuments(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public void unsetDocuments() {
    this.documents = null;
  }

  /** Returns true if field documents is set (has been asigned a value) and false otherwise */
  public boolean isSetDocuments() {
    return this.documents != null;
  }

  public void setDocumentsIsSet(boolean value) {
    if (!value) {
      this.documents = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DOCUMENTS:
      if (value == null) {
        unsetDocuments();
      } else {
        setDocuments((List<Document>)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case DOCUMENTS:
      return getDocuments();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case NAME:
      return isSetName();
    case DOCUMENTS:
      return isSetDocuments();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DocumentFamily)
      return this.equals((DocumentFamily)that);
    return false;
  }

  public boolean equals(DocumentFamily that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_documents = true && this.isSetDocuments();
    boolean that_present_documents = true && that.isSetDocuments();
    if (this_present_documents || that_present_documents) {
      if (!(this_present_documents && that_present_documents))
        return false;
      if (!this.documents.equals(that.documents))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(DocumentFamily other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DocumentFamily typedOther = (DocumentFamily)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDocuments()).compareTo(typedOther.isSetDocuments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDocuments()) {      lastComparison = TBaseHelper.compareTo(this.documents, typedOther.documents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // DOCUMENTS
          if (field.type == TType.LIST) {
            {
              TList _list18 = iprot.readListBegin();
              this.documents = new ArrayList<Document>(_list18.size);
              for (int _i19 = 0; _i19 < _list18.size; ++_i19)
              {
                Document _elem20;
                _elem20 = new Document();
                _elem20.read(iprot);
                this.documents.add(_elem20);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.documents != null) {
      oprot.writeFieldBegin(DOCUMENTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.documents.size()));
        for (Document _iter21 : this.documents)
        {
          _iter21.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DocumentFamily(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("documents:");
    if (this.documents == null) {
      sb.append("null");
    } else {
      sb.append(this.documents);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

