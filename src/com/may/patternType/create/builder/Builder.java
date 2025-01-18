package com.may.patternType.create.builder;

public interface Builder {//施工方接口

    void buildBasement();

    void buildWall();

    void buildRoof();

    Building getBuilding();
}
