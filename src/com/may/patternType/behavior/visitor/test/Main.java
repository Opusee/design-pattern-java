package com.may.patternType.behavior.visitor.test;

import java.util.Arrays;
import java.util.List;

/**
 * 自己练习实现访问者模式
 */
public class Main {
    public static void main(String[] args) {
        Model1 model1 = new Model1();
        Model2 model2 = new Model2();
        Model3 model3 = new Model3();

        List<Accepted> accepts =  Arrays.asList(model1,model2,model3);//受访者们

        Visitor visitor = new Visit();

        for (Accepted model : accepts){
            model.accepted(visitor);//受访者接待访问者，把自己交给访问者，然后访问者拿着受访者去调用不同的重载方法。
        }
    }
}
