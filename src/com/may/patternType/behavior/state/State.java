package com.may.patternType.behavior.state;

public interface State {
    void switchOn(Switcher switcher);//开
    void switchOff(Switcher switcher);//关
}
