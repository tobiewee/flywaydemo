package com.example.flywaydemo.repositories;

import com.example.flywaydemo.models.TestDataClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestDataClass, Long> {
}
