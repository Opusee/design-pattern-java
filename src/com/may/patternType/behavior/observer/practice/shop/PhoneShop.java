package com.may.patternType.behavior.observer.practice.shop;


import com.may.patternType.behavior.observer.practice.fans.PhoneFans;
import com.may.patternType.behavior.observer.practice.phone.Phone;

import java.util.ArrayList;
import java.util.List;

/**
 *手机商店
 */
public abstract class PhoneShop {

    String name;// 商店名称
    List<Phone> phones = new ArrayList<>();//初始化商店中的手机
    List<PhoneFans> phoneFansList = new ArrayList<>();//商店中注册的买家

    public List<Phone> getPhones() {
        return phones;
    }

    public PhoneShop(String name) {//构造的时候只给名字。不进货，不注册买家
        this.name = name;
    }

    //用户注册登记，可以接收此商家的通知
    public void regist(PhoneFans phoneFans){
        this.phoneFansList.add(phoneFans);
    }

    //用户取消登记，不接收此商家的通知
    public void unregist(PhoneFans phoneFans){
        this.phoneFansList.remove(phoneFans);
    }

    public abstract void notifyFans();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
        notifyFans();//进货的时候通知
    }

    public List<PhoneFans> getPhoneFansList() {
        return phoneFansList;
    }

    public void setPhoneFansList(List<PhoneFans> phoneFansList) {
        this.phoneFansList = phoneFansList;
    }
}
