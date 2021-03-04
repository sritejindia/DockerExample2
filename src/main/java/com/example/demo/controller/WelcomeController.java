package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
   
	@RequestMapping("/")
	public String getMsg() {
		return "<h1>Welcome To Docker</h1>";
	}
}
