package com.may.patternType.structure.proxy;

public class Switch implements Intranet{//交换机。内网访问，局域网传文件等
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网：" + path);
    }
}
