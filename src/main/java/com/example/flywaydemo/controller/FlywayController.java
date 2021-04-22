package com.example.flywaydemo.controller;

import com.example.flywaydemo.models.TestDataClass;
import com.example.flywaydemo.services.TestDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/flyway-test")
public class FlywayController {

    @Autowired
    private TestDataService service;

    @GetMapping
    public List<TestDataClass> getData() {
        return service.getAllData();
    }
}
