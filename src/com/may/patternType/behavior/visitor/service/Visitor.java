package com.may.patternType.behavior.visitor.service;

import com.may.patternType.behavior.visitor.pojo.Candy;
import com.may.patternType.behavior.visitor.pojo.Fruit;
import com.may.patternType.behavior.visitor.pojo.Wine;

/**
 * 访问者接口
 */
public interface Visitor {
    void visit(Candy candy); //糖果的重载方法
    void visit(Wine wine); //酒的重载方法
    void visit(Fruit fruit); //水果的重载方法
}
