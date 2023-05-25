package ru.skypro.homework.service;

import ru.skypro.homework.model.Cart;

import java.util.Map;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    private Cart cart;

    public ServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Map<String, Integer> addItems(String item, int count) {
        return cart.addItems(item,count);
    }

    @Override
    public Map<String, Integer> getItems() {
        return cart.getItems();
    }
}
