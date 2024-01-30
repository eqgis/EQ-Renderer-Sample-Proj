package com.eqgis.test.scene;

import android.content.Context;

import com.eqgis.eqr.node.RootNode;

/**
 * 场景示例通用接口
 * @author tanyx 2024/1/30
 * @version 1.0
 **/
public interface ISampleScene {
    /**
     * 创建场景
     * @param context 上下文
     * @param rootNode 场景节点
     */
    void create(Context context, RootNode rootNode);

    /**
     * 销毁成就
     * @param context 上下文
     */
    void destroy(Context context);
}