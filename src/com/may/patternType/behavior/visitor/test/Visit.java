package com.may.patternType.behavior.visitor.test;

public class Visit implements Visitor {
    @Override
    public void visit(Model1 model1) {
        System.out.println("model1");
    }

    @Override
    public void visit(Model2 model2) {
        System.out.println("model2");
    }

    @Override
    public void visit(Model3 model3) {
        System.out.println("model3");
    }
}
