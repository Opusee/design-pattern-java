package com.may.patternType.behavior.observer;

/**
 * 观察者模式
 * 动静转换。多方买（静)，一方卖（动)，大大提高了沟通效率，用户不用主动去询问是否到货，而是商店到货了通知用户购买。
 * 类似 http 的 poll 模型，单方面由客户端向服务端请求，如果大量频繁的请求过来，占用资源且服务容易瘫痪。而观察者就类似于 websocket ，由服务器主动推送。
 */
public class Client {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Buyer tanSir = new PhoneFans("果粉唐僧", shop);
        Buyer barJeet = new HandChopper("剁手族八戒", shop);
        shop.register(tanSir);
        shop.register(barJeet);

        //商店到货
        shop.setProduct("猪肉炖粉条");
        shop.setProduct("水果手机【爱疯叉】");

        /*输出结果
            剁手族八戒购买：猪肉炖粉条
            果粉唐僧购买：水果手机【爱疯叉】
            剁手族八戒购买：水果手机【爱疯叉】
        */
    }
}

