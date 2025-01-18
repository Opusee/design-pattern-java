package com.may.patternType.behavior.strategy.practice;

public class Main {
    public static void main(String[] args) {
        Installer installer = new Installer();
        installer.setPlug(new PlugA());
        installer.install();

        installer.setPlug(new PlugB());
        installer.install();
    }
}
