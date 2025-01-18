package com.may.patternType.create.abstractFactory;

public interface AbstractFactory {
    Unit createLowClass();// 工厂方法：制造低级兵种

    Unit createMidClass();// 工厂方法：制造中级兵种

    Unit createHighClass();// 工厂方法：制造高级兵种
}
