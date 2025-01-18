package com.may.patternType.behavior.observer.practice.fans;


import com.may.patternType.behavior.observer.practice.phone.IPhoneX;
import com.may.patternType.behavior.observer.practice.phone.Phone;
import com.may.patternType.behavior.observer.practice.shop.PhoneShop;

import java.util.List;

public class IphoneXFans extends PhoneFans {
    public IphoneXFans(String name) {
        super(name);
    }

    @Override
    public void inform(PhoneShop phoneShop) {
        List<Phone> phones = phoneShop.getPhones();
        Boolean hasProduct = false;//是否有这个商品
        for (Phone phone : phones) {
            if (phone instanceof IPhoneX) {
                hasProduct = true;
                if (phone.getNum() > 0) {
                    System.out.println(this.getName() + "在：" + phoneShop.getName() + "购买了一台【" + phone.getColor() + " iphone X】");
                    phone.setNum(phone.getNum() - 1);
                }else {
                    System.out.println(phoneShop.getName() + "【iphone x 】卖完了");
                }
            }
        }
        if (!hasProduct){
            System.out.println(phoneShop.getName() + "没有进货：【iphone X】");
        }
    }

}
