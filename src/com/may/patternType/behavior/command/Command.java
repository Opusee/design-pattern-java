package com.may.patternType.behavior.command;

public interface Command {
    //执行命令操作
    public void exe();

    //反执行命令操作
    public void unexe();
}
