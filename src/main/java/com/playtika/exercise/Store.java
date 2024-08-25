package com.playtika.exercise;

import java.util.*;

public class Store {
    List<Item> items = new ArrayList<>();

    public Store() {
    }

    public Store(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        if (items.isEmpty()) {
            items.add(item);
            return;
        }
        if(items.contains(item)){
            for(Item i : items) {
                if (i.equals(item)) {
                    i.setAmount(i.getAmount() + item.getAmount());
                }
            }
            return;
        }
        items.add(item);
    }

    public void updateItem(Item item) {
        if (items.isEmpty()) {
            throw new NoSuchElementException("No items found. Seems like the store is empty.");
        }
        for (Item i : items) {
            if (i.equals(item)) {
                int index = items.indexOf(i);
                items.set(index, item);
            }
        }
    }

    public void deleteItem(Item item) {
        if (items.isEmpty()) {
            return;
        }
        items.remove(item);
    }

    public int getTotalAmount() {
        return items.stream().mapToInt(Item::getAmount).sum();
    }

    public List<Item> filterItemsByCategory(Category category) {
        return items.stream().filter(i -> i.getCategory() == category).toList();
    }

    public List<Item> getExpiredItems() {
        long currentTime = Calendar.getInstance().getTimeInMillis();
        return new ArrayList<>(items.stream()
                .filter(i -> i.getCategory() == Category.FOOD)
                .filter(i -> i.getExpDateInMs() > currentTime)
                .toList());
    }

    public List<Item> getItems() {
        return this.items;
    }
}
