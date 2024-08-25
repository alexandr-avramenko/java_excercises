package com.playtika.exercise;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Food fish = new Food("Fish", 1724304399722L, 12, Category.FOOD, 172460782714L);
        store.addItem(fish);
        System.out.println(store.getItems());
    }
}