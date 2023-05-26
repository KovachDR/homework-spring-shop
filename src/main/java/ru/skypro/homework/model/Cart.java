package ru.skypro.homework.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
private final List<Integer> items;


    public Cart() {
        items = new ArrayList<>();
    }


    public List<Integer> addItems(List<Integer> ids) {
        this.items.addAll(ids);
        return this.items;
    }
    public List<Integer> getItems() {
        return this.items;
    }

}
