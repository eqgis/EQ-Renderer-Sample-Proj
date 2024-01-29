package com.eqgis.test;

import android.os.Bundle;

/**
 * 基础三维场景
 */
public class BaseSceneActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_scene);

        sceneLayout = findViewById(R.id.base_scene_layout);
        //加载GLTF模型
        GltfUtils.addGltf(this,sceneLayout.getRootNode());
    }
}