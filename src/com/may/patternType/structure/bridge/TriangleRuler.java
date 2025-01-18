package com.may.patternType.structure.bridge;

public class TriangleRuler implements Ruler {
    @Override
    public void regularize() {//尺子模板画出三角形
        System.out.println("△");
    }
}
