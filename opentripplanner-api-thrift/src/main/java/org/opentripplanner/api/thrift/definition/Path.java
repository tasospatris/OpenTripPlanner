/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.opentripplanner.api.thrift.definition;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class Path implements org.apache.thrift.TBase<Path, Path._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Path");

  private static final org.apache.thrift.protocol.TField DURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("duration", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("start_time", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("end_time", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField STATES_FIELD_DESC = new org.apache.thrift.protocol.TField("states", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField EDGES_FIELD_DESC = new org.apache.thrift.protocol.TField("edges", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PathStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PathTupleSchemeFactory());
  }

  private int duration; // required
  private long start_time; // required
  private long end_time; // required
  private List<TravelState> states; // optional
  private List<org.opentripplanner.api.thrift.definition.GraphEdge> edges; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DURATION((short)1, "duration"),
    START_TIME((short)2, "start_time"),
    END_TIME((short)3, "end_time"),
    STATES((short)4, "states"),
    EDGES((short)5, "edges");

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
        case 1: // DURATION
          return DURATION;
        case 2: // START_TIME
          return START_TIME;
        case 3: // END_TIME
          return END_TIME;
        case 4: // STATES
          return STATES;
        case 5: // EDGES
          return EDGES;
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
  private static final int __DURATION_ISSET_ID = 0;
  private static final int __START_TIME_ISSET_ID = 1;
  private static final int __END_TIME_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);
  private _Fields optionals[] = {_Fields.STATES,_Fields.EDGES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DURATION, new org.apache.thrift.meta_data.FieldMetaData("duration", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("start_time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("end_time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATES, new org.apache.thrift.meta_data.FieldMetaData("states", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TravelState.class))));
    tmpMap.put(_Fields.EDGES, new org.apache.thrift.meta_data.FieldMetaData("edges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "GraphEdge"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Path.class, metaDataMap);
  }

  public Path() {
  }

  public Path(
    int duration,
    long start_time,
    long end_time)
  {
    this();
    this.duration = duration;
    setDurationIsSet(true);
    this.start_time = start_time;
    setStart_timeIsSet(true);
    this.end_time = end_time;
    setEnd_timeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Path(Path other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.duration = other.duration;
    this.start_time = other.start_time;
    this.end_time = other.end_time;
    if (other.isSetStates()) {
      List<TravelState> __this__states = new ArrayList<TravelState>();
      for (TravelState other_element : other.states) {
        __this__states.add(new TravelState(other_element));
      }
      this.states = __this__states;
    }
    if (other.isSetEdges()) {
      List<org.opentripplanner.api.thrift.definition.GraphEdge> __this__edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>();
      for (org.opentripplanner.api.thrift.definition.GraphEdge other_element : other.edges) {
        __this__edges.add(other_element);
      }
      this.edges = __this__edges;
    }
  }

  public Path deepCopy() {
    return new Path(this);
  }

  @Override
  public void clear() {
    setDurationIsSet(false);
    this.duration = 0;
    setStart_timeIsSet(false);
    this.start_time = 0;
    setEnd_timeIsSet(false);
    this.end_time = 0;
    this.states = null;
    this.edges = null;
  }

  public int getDuration() {
    return this.duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
    setDurationIsSet(true);
  }

  public void unsetDuration() {
    __isset_bit_vector.clear(__DURATION_ISSET_ID);
  }

  /** Returns true if field duration is set (has been assigned a value) and false otherwise */
  public boolean isSetDuration() {
    return __isset_bit_vector.get(__DURATION_ISSET_ID);
  }

  public void setDurationIsSet(boolean value) {
    __isset_bit_vector.set(__DURATION_ISSET_ID, value);
  }

  public long getStart_time() {
    return this.start_time;
  }

  public void setStart_time(long start_time) {
    this.start_time = start_time;
    setStart_timeIsSet(true);
  }

  public void unsetStart_time() {
    __isset_bit_vector.clear(__START_TIME_ISSET_ID);
  }

  /** Returns true if field start_time is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_time() {
    return __isset_bit_vector.get(__START_TIME_ISSET_ID);
  }

  public void setStart_timeIsSet(boolean value) {
    __isset_bit_vector.set(__START_TIME_ISSET_ID, value);
  }

  public long getEnd_time() {
    return this.end_time;
  }

  public void setEnd_time(long end_time) {
    this.end_time = end_time;
    setEnd_timeIsSet(true);
  }

  public void unsetEnd_time() {
    __isset_bit_vector.clear(__END_TIME_ISSET_ID);
  }

  /** Returns true if field end_time is set (has been assigned a value) and false otherwise */
  public boolean isSetEnd_time() {
    return __isset_bit_vector.get(__END_TIME_ISSET_ID);
  }

  public void setEnd_timeIsSet(boolean value) {
    __isset_bit_vector.set(__END_TIME_ISSET_ID, value);
  }

  public int getStatesSize() {
    return (this.states == null) ? 0 : this.states.size();
  }

  public java.util.Iterator<TravelState> getStatesIterator() {
    return (this.states == null) ? null : this.states.iterator();
  }

  public void addToStates(TravelState elem) {
    if (this.states == null) {
      this.states = new ArrayList<TravelState>();
    }
    this.states.add(elem);
  }

  public List<TravelState> getStates() {
    return this.states;
  }

  public void setStates(List<TravelState> states) {
    this.states = states;
  }

  public void unsetStates() {
    this.states = null;
  }

  /** Returns true if field states is set (has been assigned a value) and false otherwise */
  public boolean isSetStates() {
    return this.states != null;
  }

  public void setStatesIsSet(boolean value) {
    if (!value) {
      this.states = null;
    }
  }

  public int getEdgesSize() {
    return (this.edges == null) ? 0 : this.edges.size();
  }

  public java.util.Iterator<org.opentripplanner.api.thrift.definition.GraphEdge> getEdgesIterator() {
    return (this.edges == null) ? null : this.edges.iterator();
  }

  public void addToEdges(org.opentripplanner.api.thrift.definition.GraphEdge elem) {
    if (this.edges == null) {
      this.edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>();
    }
    this.edges.add(elem);
  }

  public List<org.opentripplanner.api.thrift.definition.GraphEdge> getEdges() {
    return this.edges;
  }

  public void setEdges(List<org.opentripplanner.api.thrift.definition.GraphEdge> edges) {
    this.edges = edges;
  }

  public void unsetEdges() {
    this.edges = null;
  }

  /** Returns true if field edges is set (has been assigned a value) and false otherwise */
  public boolean isSetEdges() {
    return this.edges != null;
  }

  public void setEdgesIsSet(boolean value) {
    if (!value) {
      this.edges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DURATION:
      if (value == null) {
        unsetDuration();
      } else {
        setDuration((Integer)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStart_time();
      } else {
        setStart_time((Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEnd_time();
      } else {
        setEnd_time((Long)value);
      }
      break;

    case STATES:
      if (value == null) {
        unsetStates();
      } else {
        setStates((List<TravelState>)value);
      }
      break;

    case EDGES:
      if (value == null) {
        unsetEdges();
      } else {
        setEdges((List<org.opentripplanner.api.thrift.definition.GraphEdge>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DURATION:
      return Integer.valueOf(getDuration());

    case START_TIME:
      return Long.valueOf(getStart_time());

    case END_TIME:
      return Long.valueOf(getEnd_time());

    case STATES:
      return getStates();

    case EDGES:
      return getEdges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DURATION:
      return isSetDuration();
    case START_TIME:
      return isSetStart_time();
    case END_TIME:
      return isSetEnd_time();
    case STATES:
      return isSetStates();
    case EDGES:
      return isSetEdges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Path)
      return this.equals((Path)that);
    return false;
  }

  public boolean equals(Path that) {
    if (that == null)
      return false;

    boolean this_present_duration = true;
    boolean that_present_duration = true;
    if (this_present_duration || that_present_duration) {
      if (!(this_present_duration && that_present_duration))
        return false;
      if (this.duration != that.duration)
        return false;
    }

    boolean this_present_start_time = true;
    boolean that_present_start_time = true;
    if (this_present_start_time || that_present_start_time) {
      if (!(this_present_start_time && that_present_start_time))
        return false;
      if (this.start_time != that.start_time)
        return false;
    }

    boolean this_present_end_time = true;
    boolean that_present_end_time = true;
    if (this_present_end_time || that_present_end_time) {
      if (!(this_present_end_time && that_present_end_time))
        return false;
      if (this.end_time != that.end_time)
        return false;
    }

    boolean this_present_states = true && this.isSetStates();
    boolean that_present_states = true && that.isSetStates();
    if (this_present_states || that_present_states) {
      if (!(this_present_states && that_present_states))
        return false;
      if (!this.states.equals(that.states))
        return false;
    }

    boolean this_present_edges = true && this.isSetEdges();
    boolean that_present_edges = true && that.isSetEdges();
    if (this_present_edges || that_present_edges) {
      if (!(this_present_edges && that_present_edges))
        return false;
      if (!this.edges.equals(that.edges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Path other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Path typedOther = (Path)other;

    lastComparison = Boolean.valueOf(isSetDuration()).compareTo(typedOther.isSetDuration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDuration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.duration, typedOther.duration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart_time()).compareTo(typedOther.isSetStart_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_time, typedOther.start_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnd_time()).compareTo(typedOther.isSetEnd_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnd_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.end_time, typedOther.end_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStates()).compareTo(typedOther.isSetStates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.states, typedOther.states);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEdges()).compareTo(typedOther.isSetEdges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEdges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.edges, typedOther.edges);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Path(");
    boolean first = true;

    sb.append("duration:");
    sb.append(this.duration);
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_time:");
    sb.append(this.start_time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("end_time:");
    sb.append(this.end_time);
    first = false;
    if (isSetStates()) {
      if (!first) sb.append(", ");
      sb.append("states:");
      if (this.states == null) {
        sb.append("null");
      } else {
        sb.append(this.states);
      }
      first = false;
    }
    if (isSetEdges()) {
      if (!first) sb.append(", ");
      sb.append("edges:");
      if (this.edges == null) {
        sb.append("null");
      } else {
        sb.append(this.edges);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDuration()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'duration' is unset! Struct:" + toString());
    }

    if (!isSetStart_time()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'start_time' is unset! Struct:" + toString());
    }

    if (!isSetEnd_time()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'end_time' is unset! Struct:" + toString());
    }

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

  private static class PathStandardSchemeFactory implements SchemeFactory {
    public PathStandardScheme getScheme() {
      return new PathStandardScheme();
    }
  }

  private static class PathStandardScheme extends StandardScheme<Path> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Path struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.duration = iprot.readI32();
              struct.setDurationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start_time = iprot.readI64();
              struct.setStart_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.end_time = iprot.readI64();
              struct.setEnd_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.states = new ArrayList<TravelState>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  TravelState _elem2; // required
                  _elem2 = new TravelState();
                  _elem2.read(iprot);
                  struct.states.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setStatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // EDGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>(_list3.size);
                for (int _i4 = 0; _i4 < _list3.size; ++_i4)
                {
                  org.opentripplanner.api.thrift.definition.GraphEdge _elem5; // required
                  _elem5 = new org.opentripplanner.api.thrift.definition.GraphEdge();
                  _elem5.read(iprot);
                  struct.edges.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.setEdgesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Path struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DURATION_FIELD_DESC);
      oprot.writeI32(struct.duration);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.start_time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_TIME_FIELD_DESC);
      oprot.writeI64(struct.end_time);
      oprot.writeFieldEnd();
      if (struct.states != null) {
        if (struct.isSetStates()) {
          oprot.writeFieldBegin(STATES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.states.size()));
            for (TravelState _iter6 : struct.states)
            {
              _iter6.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.edges != null) {
        if (struct.isSetEdges()) {
          oprot.writeFieldBegin(EDGES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.edges.size()));
            for (org.opentripplanner.api.thrift.definition.GraphEdge _iter7 : struct.edges)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PathTupleSchemeFactory implements SchemeFactory {
    public PathTupleScheme getScheme() {
      return new PathTupleScheme();
    }
  }

  private static class PathTupleScheme extends TupleScheme<Path> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Path struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.duration);
      oprot.writeI64(struct.start_time);
      oprot.writeI64(struct.end_time);
      BitSet optionals = new BitSet();
      if (struct.isSetStates()) {
        optionals.set(0);
      }
      if (struct.isSetEdges()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStates()) {
        {
          oprot.writeI32(struct.states.size());
          for (TravelState _iter8 : struct.states)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetEdges()) {
        {
          oprot.writeI32(struct.edges.size());
          for (org.opentripplanner.api.thrift.definition.GraphEdge _iter9 : struct.edges)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Path struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.duration = iprot.readI32();
      struct.setDurationIsSet(true);
      struct.start_time = iprot.readI64();
      struct.setStart_timeIsSet(true);
      struct.end_time = iprot.readI64();
      struct.setEnd_timeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.states = new ArrayList<TravelState>(_list10.size);
          for (int _i11 = 0; _i11 < _list10.size; ++_i11)
          {
            TravelState _elem12; // required
            _elem12 = new TravelState();
            _elem12.read(iprot);
            struct.states.add(_elem12);
          }
        }
        struct.setStatesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.edges = new ArrayList<org.opentripplanner.api.thrift.definition.GraphEdge>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            org.opentripplanner.api.thrift.definition.GraphEdge _elem15; // required
            _elem15 = new org.opentripplanner.api.thrift.definition.GraphEdge();
            _elem15.read(iprot);
            struct.edges.add(_elem15);
          }
        }
        struct.setEdgesIsSet(true);
      }
    }
  }

}

