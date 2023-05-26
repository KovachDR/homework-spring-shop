package ru.skypro.homework.service;

import java.util.List;


public interface Service {
    List<String> addItems(List<String> ids);
    List<String> getItems();
}
