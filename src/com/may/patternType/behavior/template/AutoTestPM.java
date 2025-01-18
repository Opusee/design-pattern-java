package com.may.patternType.behavior.template;

public class AutoTestPM extends PM {
    @Override
    protected void analyze() {
        System.out.println("进行业务沟通，需求分析");
    }

    @Override
    protected void design() {

    }

    @Override
    protected void develop() {

    }

    @Override
    protected boolean test() {
        return false;
    }

    @Override
    protected void release() {

    }
}
