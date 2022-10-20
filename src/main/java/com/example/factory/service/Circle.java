package com.example.factory.service;


import lombok.ToString;

@ToString
public class Circle implements Shape {

    @Override
    public String draw() {
        return "Circle";
    }
}