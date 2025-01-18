package com.may.patternType.behavior.visitor.practice;

public interface Visitor {
    void visit(ModelA modelA);
    void visit(ModelB modelB);
    void visit(ModelC modelC);
    void visit(ModelD modelD);
}
