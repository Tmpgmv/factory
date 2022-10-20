package com.example.factory.controller;

import com.example.factory.service.Shape;
import com.example.factory.service.ShapeFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ShapeController {


    public ShapeController(Shape shape) {
        this.shape = shape;
    }

    public final Shape shape;



    @GetMapping({"/", ""})
    public Shape getShape(@RequestParam String aShape) throws Exception{
        return shape;
    }
}
