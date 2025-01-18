package com.may.patternType.behavior.visitor.practice;

public class Arrived implements Visitor {

    @Override
    public void visit(ModelA modelA) {
        System.out.println("到达并访问了modelA");
    }

    @Override
    public void visit(ModelB modelB) {
        System.out.println("到达并访问了modelB");
    }

    @Override
    public void visit(ModelC modelC) {
        System.out.println("到达并访问了modelC");
    }

    @Override
    public void visit(ModelD modelD) {
        System.out.println("到达并访问了modelD");
    }
}
