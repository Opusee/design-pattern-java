package com.may.patternType.structure.decorator;

public abstract class Decorator implements Showable {//化妆品粉饰器

    Showable showable;//持有某个善于展示的家伙，也就是girl

    public Decorator(Showable showable) {//构造时注入这个家伙
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();//直接调用不做加任何粉饰。
    }
}
