package com.may.patternType.behavior.visitor.pojo;

import com.may.patternType.behavior.visitor.service.Acceptable;
import com.may.patternType.behavior.visitor.service.Visitor;

import java.time.LocalDate;

public class Candy extends Product implements Acceptable {
    public Candy(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);// 把自己交给拜访者。
    }
}
