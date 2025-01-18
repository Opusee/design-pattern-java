package com.may.patternType.behavior.interpreter;

public class Repetition implements Expression {

    private int loopCount;// 循环次数
    private Expression expression;// 循环体表达式

    public Repetition(Expression expression, int loopCount) {
        this.expression = expression;
        this.loopCount = loopCount;
    }

    @Override
    public void interpret() {
        while (loopCount > 0){
            expression.interpret();
            loopCount --;
        }
    }
}
