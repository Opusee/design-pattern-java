package com.may.patternType.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * 这个关键字过滤功能我们不再写到代理类里面了，而是另外写个类并实现JDK反射包中提供的InvocationHandler接口
 */
public class KeywordFilter implements InvocationHandler {//动态代理实现过滤

    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    // 被代理的真实对象,猫、交换机、或是别的什么都是。
    private Object origin;

    public KeywordFilter(Object origin) {
        this.origin = origin;//注入被代理对象
        System.out.println("开启关键字过滤模式...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //要被切入方法面之前的业务逻辑
        String arg = args[0].toString();
        for (String keyword : blackList) {
            if (arg.contains(keyword)) {
                System.out.println("禁止访问：" + arg);
                return null;
            }
        }
        //调用真实的被代理对象方法
        return method.invoke(origin, arg);
    }
}
