package com.example.App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

@RequestMapping("/")
public String hello()
{
	return "Testing this project in github";
}
}
