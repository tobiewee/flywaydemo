package com.example.flywaydemo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
@NoArgsConstructor
@Getter
public class TestDataClass {
    @Id
    private Long id;
    private String title;

    public TestDataClass(
            Long id,
            String title
    ) {
        this.id = id;
        this.title = title;
    }
}
