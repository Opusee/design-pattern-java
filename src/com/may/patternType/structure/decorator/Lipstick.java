package com.may.patternType.structure.decorator;

public class Lipstick extends Decorator {//口红

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红(");
        showable.show();
        System.out.print(")");
    }
}
