package com.may.patternType.create.builder;

/**
 * 建造者模式。
 * 与工厂模式不同的是，建造者的目的在于把复杂构造过程从不同对象展现中抽离出来，使得同样的构造工序可以展现出不同的产品对象。
 */
public class Client {
    public static void main(String[] args) {
        //招工，建别墅。
        Builder builder = new HouseBuilder();
        //交给工程总监
        Director director = new Director(builder);
        System.out.println(director.direct());
        //替换施工方，建公寓。
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
