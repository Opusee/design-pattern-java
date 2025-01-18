package com.may.patternType.create.prototype;

public class Bullet implements Cloneable {

    //重写克隆方法
    @Override
    public Bullet clone() throws CloneNotSupportedException {
        return (Bullet) super.clone();
    }
}
