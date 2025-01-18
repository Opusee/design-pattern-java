package com.may.patternType.behavior.observer.practice.shop;

/**
 * 小米商城
 */
public class MiStore extends PhoneShop{

    public MiStore(String name) {
        super(name);
    }

    @Override
    public void notifyFans() {
        this.phoneFansList.stream().forEach(phoneFans -> phoneFans.inform(this));
    }
}
