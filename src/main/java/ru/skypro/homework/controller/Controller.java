package ru.skypro.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.service.Service;
import ru.skypro.homework.service.ServiceImpl;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class Controller {
    private final ServiceImpl service;

    public Controller(ServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Map<String, Integer> addItems(@RequestParam String item,
                                         @RequestParam int count) {
        return service.addItems(item, count);
    }

    @GetMapping("/get")
    public Map<String, Integer> getItems() {
        return service.getItems();
    }
}
