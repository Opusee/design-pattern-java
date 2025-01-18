package com.may.patternType.behavior.strategy;

/**
 * 策略模式
 * 策略实现类已经成为独立于宿主之外的模块，即插即用。可以组合成为一个整体，又可以分拆独立，可以发生关联，但绝不耦合，既对立又统一，这是唯物辩证法的绝佳体现。
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();//实例化计算器
        calculator.setStrategy(new Addition());//接入加法实现
        int result = calculator.getResult(1, 1);//计算！
        System.out.println(result);//得到的是加法结果2

        calculator.setStrategy(new Subtraction());//再次接入减法实现
        result = calculator.getResult(1, 1);//计算！
        System.out.println(result);//得到的是减法结果0

    }
}
