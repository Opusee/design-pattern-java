package com.may.patternType.structure.bridge;

public abstract class Pen {//画笔

    protected Ruler ruler;//尺子的引用

    /*
     * 注意这里的抽象画笔（第3行）引用了尺子接口，并且声明为protected，得以让彩笔子类进行继承，并由第9行构造子注入尺子，此处便是桥梁对接的重点
     */

    public Pen(Ruler ruler) {
        this.ruler = ruler;
    }

    public abstract void draw();//抽象方法
}
