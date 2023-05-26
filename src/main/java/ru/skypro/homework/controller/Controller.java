package ru.skypro.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.service.ServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/order")
public class Controller {
    private final ServiceImpl service;

    public Controller(ServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids) {
        return service.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return service.getItems();
    }
}
