package com.may.patternType.behavior.template;

public class GPS implements CigarLighterInterface {
    //导航的实现
    @Override
    public void electrifyDC16V() {
        System.out.println("连接卫星");
        System.out.println("定位。。。");
    }
}
