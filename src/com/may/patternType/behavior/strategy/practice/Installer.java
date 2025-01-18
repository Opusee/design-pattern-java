package com.may.patternType.behavior.strategy.practice;

public class Installer {
    private Plug plug;

    public Plug getPlug() {
        return plug;
    }

    public void setPlug(Plug plug) {
        this.plug = plug;
    }

    public void install(){
        this.plug.use();
    }
}
