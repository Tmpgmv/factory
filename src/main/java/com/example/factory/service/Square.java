package com.example.factory.service;

import lombok.ToString;

@ToString
public class Square implements Shape {

    @Override
    public String draw() {
        return "Square";
    }
}