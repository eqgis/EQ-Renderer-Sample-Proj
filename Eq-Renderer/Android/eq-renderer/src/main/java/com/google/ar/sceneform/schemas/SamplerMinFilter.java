package com.google.ar.sceneform.schemas;

public final class SamplerMinFilter {
  public static final short Nearest = 0;
  
  public static final short Linear = 1;
  
  public static final short NearestMipmapNearest = 2;
  
  public static final short LinearMipmapNearest = 3;
  
  public static final short NearestMipmapLinear = 4;
  
  public static final short LinearMipmapLinear = 5;
  
  public static final String[] names = new String[] { "Nearest", "Linear", "NearestMipmapNearest", "LinearMipmapNearest", "NearestMipmapLinear", "LinearMipmapLinear" };
  
  public static String name(int e) {
    return names[e];
  }
}
