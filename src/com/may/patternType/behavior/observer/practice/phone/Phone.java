package com.may.patternType.behavior.observer.practice.phone;

public abstract class Phone {
    private String color;//手机颜色
    private int num;//手机数量

    public Phone(String color, int num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
