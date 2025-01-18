package com.may.patternType.structure.proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式。
 * 和装饰模式不同的是，代理模式更强调的是对被代理对象的控制，而不是仅限于去装饰目标对象并增强其原有的功能
 */
public class Client {
    public static void main(String[] args) {

        //访问外网（互联网）,生成猫代理。
        Internet internet = (Internet) Proxy.newProxyInstance(
                Modem.class.getClassLoader(),
                Modem.class.getInterfaces(),
                new KeywordFilter(new Modem()));
        internet.access("http://www.电影.com");
        internet.access("http://www.游戏.com");
        internet.access("http://www.学习.com");
        internet.access("http://www.工作.com");

        //访问内网（局域网），生成交换机代理。
        Intranet intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new KeywordFilter(new Switch()));
        intranet.fileAccess("\\\\192.68.1.2\\共享\\电影\\IronHuman.mp4");
        intranet.fileAccess("\\\\192.68.1.2\\共享\\游戏\\Hero.exe");
        intranet.fileAccess("\\\\192.68.1.4\\shared\\Java学习资料.zip");
        intranet.fileAccess("\\\\192.68.1.6\\Java知音\\设计模式是什么鬼.doc");

        /*
25            开启关键字过滤模式...
26            禁止访问：http://www.电影.com
27            禁止访问：http://www.游戏.com
28            正在访问：http://www.学习.com
29            正在访问：http://www.工作.com
30            开启关键字过滤模式...
31            禁止访问：\\192.68.1.2\共享\电影\IronHuman.mp4
32            禁止访问：\\192.68.1.2\共享\游戏\Hero.exe
33            访问内网：\\192.68.1.4\shared\Java学习资料.zip
34            访问内网：\\192.68.1.6\Java知音\设计模式是什么鬼.doc
35
36        */
    }
}
