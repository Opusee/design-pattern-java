package com.may.patternType.behavior.visitor.service;

/**
 * 双派发
 */
public interface Acceptable {
    // 主动接受拜访者
    void accept(Visitor visitor);
}
