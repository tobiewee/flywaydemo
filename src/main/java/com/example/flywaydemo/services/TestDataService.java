package com.example.flywaydemo.services;

import com.example.flywaydemo.models.TestDataClass;
import com.example.flywaydemo.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDataService {
    @Autowired
    private TestRepository repository;

    public List<TestDataClass> getAllData() {
        return repository.findAll();
    }
}
