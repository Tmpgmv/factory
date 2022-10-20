package com.example.factory.service;

public class ShapeFactory  {
    public Shape getShape(String name) throws Exception{

        Shape result;

        switch (name) {
            case "circle":
                result = new Circle();
                break;

            case "rectangle":
                result = new Rectangle();
                break;
            case "square":
                result = new Square();
                break;
            default:
                throw new Exception("Shouldn't be here");
        }

        return result;
    }
}
