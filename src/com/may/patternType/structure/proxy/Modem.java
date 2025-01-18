package com.may.patternType.structure.proxy;

public class Modem implements Internet {//调制解调器，猫。外网访问，上网浏览等
    @Override
    public void access(String url) {
        System.out.println("正在访问：" + url);
    }
}
