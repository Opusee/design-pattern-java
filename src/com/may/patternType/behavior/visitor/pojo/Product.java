package com.may.patternType.behavior.visitor.pojo;

import java.time.LocalDate;

public abstract class Product {
    protected String name;
    protected LocalDate producedDate;
    protected float price;

    public Product(String name, LocalDate producedDate, float price) {
        this.name = name; // 商品
        this.producedDate = producedDate; //生产日期
        this.price = price; //价格
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(LocalDate producedDate) {
        this.producedDate = producedDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
