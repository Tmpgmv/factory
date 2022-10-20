package com.example.factory.congiguration;

import com.example.factory.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class FactoryConfiguration {

    @Bean
    public ShapeFactory shapeFactory() {
        return new ShapeFactory();
    }

    @Bean
    @Profile("circle")
    public Shape circleShapeService(ShapeFactory shapeFactory) throws Exception{
        return shapeFactory.getShape("circle");
    }

    @Bean
    @Profile("square")
    public Shape squareShapeService(ShapeFactory shapeFactory) throws Exception{
        return shapeFactory.getShape("square");
    }

    @Bean
    @Profile("rectangle")
    public Shape rectangleShapeService(ShapeFactory shapeFactory) throws Exception{
        return shapeFactory.getShape("rectangle");
    }

}


