package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetName {
	
@GetMapping("/name")

public String getName() {
    String name="Subha";
	return "Hello"+name;
}
}
