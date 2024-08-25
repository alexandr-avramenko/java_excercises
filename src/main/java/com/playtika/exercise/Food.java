package com.playtika.exercise;

import java.util.Objects;

public class Food implements Item {
    private String name;
    private Category category;
    private double price;
    private int amount;
    private long expDateInMs;

    public Food(String name, double price, int amount, Category category, long expDateInMs) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.category = category;
        this.expDateInMs = expDateInMs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getExpDateInMs() {
        return expDateInMs;
    }

    public void setExpDateInMs(long expDateInMs) {
        this.expDateInMs = expDateInMs;
    }
}
