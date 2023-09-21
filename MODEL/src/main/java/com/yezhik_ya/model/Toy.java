package com.yezhik_ya.model;

import java.io.Serializable;

public class Toy implements Serializable
{
    private String name;
    private Double price;
    public Toy(String name, Double price) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
