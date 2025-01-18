package com.may.patternType.behavior.observer.practice.shop;

/**
 * iphone 商城
 */
public class AppleStore extends PhoneShop{

    public AppleStore(String name) {
        super(name);
    }

    @Override
    public void notifyFans() {
        this.phoneFansList.stream().forEach(phoneFans -> phoneFans.inform(this));
    }
}
