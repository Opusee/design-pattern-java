package com.may.patternType.behavior.visitor.practice;

public class ModelC implements Accepted {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
