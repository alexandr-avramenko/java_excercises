package com.playtika.exercise;

public class Tech implements Item {
    private final Category category = Category.TECH;
    private int power;



    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public void setAmount(int amount) {

    }

    @Override
    public Category getCategory() {
        return this.category;
    }

    @Override
    public long getExpDateInMs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
