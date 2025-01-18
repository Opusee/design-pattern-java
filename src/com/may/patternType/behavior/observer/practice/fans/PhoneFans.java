package com.may.patternType.behavior.observer.practice.fans;

import com.may.patternType.behavior.observer.practice.shop.PhoneShop;

public abstract class PhoneFans {
    protected String name;

    public PhoneFans(String name) {//构造的时候不持有商店。后面单独注册
        this.name = name;
    }

    public abstract void inform(PhoneShop phoneShop);//商店通知粉丝

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
