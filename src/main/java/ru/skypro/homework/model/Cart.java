package ru.skypro.homework.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;
@Component
@SessionScope
public class Cart {
private final Map<String,Integer> items;


    public Cart() {
        items = new HashMap<>();
    }

    public Map<String, Integer> addItems(String item, int count) {
        this.items.put(item,count);
        return items;
    }
    public Map<String, Integer> getItems() {
        return this.items;
    }

}
