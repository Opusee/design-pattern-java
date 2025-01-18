package com.may.patternType.structure.composite;

public class File extends Node {

    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        try {
            throw new Exception("不能添加子节点。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
