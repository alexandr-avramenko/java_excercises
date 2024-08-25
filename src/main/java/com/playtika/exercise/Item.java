package com.playtika.exercise;

import java.util.Objects;

public interface Item {
    int getAmount();
    void setAmount(int amount);
    Category getCategory();
    long getExpDateInMs();
}
