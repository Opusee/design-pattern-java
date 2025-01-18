package com.may.patternType.behavior.visitor.test;

public class Model2 implements Accepted{
    @Override
    public void accepted(Visitor visitor) {
        visitor.visit(this);
    }
}
