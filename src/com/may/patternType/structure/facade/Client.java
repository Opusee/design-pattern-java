package com.may.patternType.structure.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.provideService();
    }
}
