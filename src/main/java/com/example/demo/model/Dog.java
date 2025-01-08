package com.example.demo.model;


import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

@Schema(description = "Represents a Cat class.")
public class Dog extends RepresentationModel<Dog> {

    private Integer speed;

    public Dog(Integer speed) {
        this.speed = speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
