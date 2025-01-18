package com.may.patternType.create.singleton;

/**
 * 单例模式
 */
public class God {
    private volatile static God god;

    private God() {
    }

    public static God getInstance() {//庙是开放的不用排队进入
        if (god == null) {//如果头柱香未产生，这批抢香人进入堂内排队。
            synchronized (God.class) {
                if (god == null) {//只有头香造了神，其他抢香的白排队了
                    god = new God();
                }
            }
        }
        //此处头柱香产生后不必再排队
        return god;
    }
}
