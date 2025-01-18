package com.may.patternType.behavior.template;

public class CigarLighter implements CigarLighterInterface {
    //点烟器的实现
    @Override
    public void electrifyDC16V() {
        int time = 1000;
        while (--time > 0) {
            System.out.println("加热电炉丝");
        }
        System.out.println("点烟器弹出");
    }
}
