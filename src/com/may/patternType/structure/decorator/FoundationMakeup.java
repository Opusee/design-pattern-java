package com.may.patternType.structure.decorator;

public class FoundationMakeup extends Decorator {//粉底

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底(");
        showable.show();
        System.out.print(")");
    }
}
