package com.may.patternType.behavior.visitor.pojo;

import com.may.patternType.behavior.visitor.service.Acceptable;
import com.may.patternType.behavior.visitor.service.Visitor;

import java.time.LocalDate;

public class Wine extends Product implements Acceptable {
    public Wine(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
