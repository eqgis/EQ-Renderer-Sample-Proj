// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lull;

import com.google.ar.sceneform.flatbuffers.FlatBufferBuilder;
import com.google.ar.sceneform.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class MaterialTextureDef extends Table {
  public static MaterialTextureDef getRootAsMaterialTextureDef(ByteBuffer _bb) { return getRootAsMaterialTextureDef(_bb, new MaterialTextureDef()); }
  public static MaterialTextureDef getRootAsMaterialTextureDef(ByteBuffer _bb, MaterialTextureDef obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public MaterialTextureDef __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public int usage() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  /**
   * For textures with multiple usages, this array describes the usage of each
   * channel.
   */
  public int usagePerChannel(int j) { int o = __offset(8); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int usagePerChannelLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer usagePerChannelAsByteBuffer() { return __vector_as_bytebuffer(8, 4); }
  public ByteBuffer usagePerChannelInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 4); }

  public static int createMaterialTextureDef(FlatBufferBuilder builder,
                                             int nameOffset,
                                             int usage,
                                             int usage_per_channelOffset) {
    builder.startObject(3);
    MaterialTextureDef.addUsagePerChannel(builder, usage_per_channelOffset);
    MaterialTextureDef.addUsage(builder, usage);
    MaterialTextureDef.addName(builder, nameOffset);
    return MaterialTextureDef.endMaterialTextureDef(builder);
  }

  public static void startMaterialTextureDef(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addUsage(FlatBufferBuilder builder, int usage) { builder.addInt(1, usage, 0); }
  public static void addUsagePerChannel(FlatBufferBuilder builder, int usagePerChannelOffset) { builder.addOffset(2, usagePerChannelOffset, 0); }
  public static int createUsagePerChannelVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startUsagePerChannelVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMaterialTextureDef(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

