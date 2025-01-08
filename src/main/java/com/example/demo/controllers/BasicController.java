package com.example.demo.controllers;

import io.swagger.v3.oas.annotations.Operation;

import com.example.demo.model.Cat;
import com.example.demo.model.ResponseView;
import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class BasicController {

    @GetMapping("/cat")
    @JsonView(ResponseView.Animal.class)
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "get", description = "Provides an animal.")
    public Cat get() {

        return new Cat(12);
    }

}
