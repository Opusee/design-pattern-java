package com.may.patternType.behavior.observer.practice;

import com.may.patternType.behavior.observer.practice.fans.IphoneXFans;
import com.may.patternType.behavior.observer.practice.phone.IPhoneX;
import com.may.patternType.behavior.observer.practice.shop.AppleStore;
import com.may.patternType.behavior.observer.practice.shop.MiStore;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore("iPhone 专营店");
        MiStore miStore = new MiStore("小米旗舰店");
        IphoneXFans iphoneXFans1 = new IphoneXFans("iphonex粉丝1");
        IphoneXFans iphoneXFans2 = new IphoneXFans("iphonex粉丝2");

        appleStore.regist(iphoneXFans1);
        appleStore.regist(iphoneXFans2);
        miStore.regist(iphoneXFans1);
        miStore.regist(iphoneXFans2);

        appleStore.setPhones(Arrays.asList(new IPhoneX("金色",1)));
        miStore.setPhones(Arrays.asList(new IPhoneX("金色",2)));
    }
}
