package com.example.factory.service;

import lombok.ToString;

@ToString
public class Rectangle implements Shape {
    @Override
    public String draw() {
        return "Rectangle";
    }
}
