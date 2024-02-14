package com.example.myapplication.domain;

import java.util.List;

public class Person {
    public String name;
    public String phone;

    public List<Pets> pets;

    public Person(String name, String phone, List<Pets> pets) {
        this.name = name;
        this.phone = phone;
        this.pets = pets;
    }
}
