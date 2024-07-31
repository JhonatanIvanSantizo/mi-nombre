package com.example.mi_nombre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/hola/{name}")
    public String getname(@PathVariable String name) {
        return "Hola, "+name;
    }
}