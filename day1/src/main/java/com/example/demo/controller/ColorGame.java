package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {
	
@GetMapping("/color")

public String getColor() {
    String color="Green";
	return "My favorite color: "+color;
}
}

