package com.may.patternType.structure.adapter;

public class Adapter implements TriplePin {
    private DualPin dualPinDevice;

    //创建适配器地时候，需要把双插设备接入进来
    public Adapter(DualPin dualPinDevice) {
        this.dualPinDevice = dualPinDevice;
    }

    //适配器实现的是目标接口
    @Override
    public void electrify(String live, String nul, String earth) {
        //实际上调用了被适配设备的双插通电，地线e被丢弃了。
        dualPinDevice.electrify(live, nul);
    }
}
