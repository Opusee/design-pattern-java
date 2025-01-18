package com.may.patternType.behavior.observer;

public abstract class Buyer {// 买家
    protected String name;
    protected Shop shop;

    public Buyer(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
        //shop.register(this);//这里是在构造时强制将自己注册到商家，但是实际应该又买家自己决定是否注册
    }

    public abstract void inform();
}
