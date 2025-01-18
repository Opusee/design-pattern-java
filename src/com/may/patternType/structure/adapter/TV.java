package com.may.patternType.structure.adapter;

public class TV implements DualPin {

    @Override
    public void electrify(String live, String nul) {
        System.out.println("火线通电：" + live);
        System.out.println("零线通电：" + nul);
    }
}
