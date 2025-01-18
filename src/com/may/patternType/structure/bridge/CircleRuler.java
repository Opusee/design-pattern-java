package com.may.patternType.structure.bridge;

public class CircleRuler implements Ruler {
    @Override
    public void regularize() {//尺子模板画出圆形
        System.out.println("○");
    }
}
