// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lull;

import com.google.ar.sceneform.flatbuffers.FlatBufferBuilder;
import com.google.ar.sceneform.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
/**
 * Information about a renderable material.
 */
public final class ModelPipelineMaterialDef extends Table {
  public static ModelPipelineMaterialDef getRootAsModelPipelineMaterialDef(ByteBuffer _bb) { return getRootAsModelPipelineMaterialDef(_bb, new ModelPipelineMaterialDef()); }
  public static ModelPipelineMaterialDef getRootAsModelPipelineMaterialDef(ByteBuffer _bb, ModelPipelineMaterialDef obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public ModelPipelineMaterialDef __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Description of the desired material.
   */
  public MaterialDef material() { return material(new MaterialDef()); }
  public MaterialDef material(MaterialDef obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * Optional replacement name to use at runtime.
   */
  public String nameOverride() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameOverrideAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer nameOverrideInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createModelPipelineMaterialDef(FlatBufferBuilder builder,
      int materialOffset,
      int name_overrideOffset) {
    builder.startObject(2);
    ModelPipelineMaterialDef.addNameOverride(builder, name_overrideOffset);
    ModelPipelineMaterialDef.addMaterial(builder, materialOffset);
    return ModelPipelineMaterialDef.endModelPipelineMaterialDef(builder);
  }

  public static void startModelPipelineMaterialDef(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addMaterial(FlatBufferBuilder builder, int materialOffset) { builder.addOffset(0, materialOffset, 0); }
  public static void addNameOverride(FlatBufferBuilder builder, int nameOverrideOffset) { builder.addOffset(1, nameOverrideOffset, 0); }
  public static int endModelPipelineMaterialDef(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

