package ru.skypro.homework.service;

import java.util.Map;

public interface Service {
    Map<String, Integer> addItems(String item, int count);
    Map<String, Integer> getItems();
}
