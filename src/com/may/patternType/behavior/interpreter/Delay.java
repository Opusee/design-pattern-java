package com.may.patternType.behavior.interpreter;

public class Delay implements Expression {
    private int seconds;// 延时秒数

    public Delay(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void interpret() {
        System.out.println("系统延迟：" + seconds + "秒钟");
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
