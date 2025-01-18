package com.may.patternType.behavior.visitor.practice;

import java.util.Arrays;
import java.util.List;

/**
 * 自己练习实现访问者模式
 */
public class Main {
    public static void main(String[] args) {
        ModelA modelA = new ModelA();
        ModelB modelB = new ModelB();
        ModelC modelC = new ModelC();
        ModelD modelD = new ModelD();

        List<Accepted> accepts =  Arrays.asList(modelA,modelB,modelC,modelD);//受访者们

        Visitor visitor = new Arrived();

        for (Accepted model : accepts){
            model.accept(visitor);//受访者接待访问者，把自己交给访问者，然后访问者拿着受访者去调用不同的重载方法。
        }
    }
}
