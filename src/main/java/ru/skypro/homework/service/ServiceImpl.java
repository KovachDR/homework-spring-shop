package ru.skypro.homework.service;

import ru.skypro.homework.model.Cart;

import java.util.List;
import java.util.Map;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    private Cart cart;

    public ServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<String> addItems(List<String> ids) {
        return cart.addItems(ids);
    }

    @Override
    public List<String> getItems() {
        return cart.getItems();
    }
}
