package com.may.patternType.behavior.state;

public class Client {
    public static void main(String[] args) {
        Switcher s = new Switcher();
        s.switchOff();//WARN!!!断电状态无需再关
        s.switchOn();//OK...灯亮
        s.switchOff();//OK...灯灭
        s.switchOn();//OK...灯亮
        s.switchOn();//WARN!!!通电状态无需再开
    }
}
