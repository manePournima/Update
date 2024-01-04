package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/getName")
	public String getName()
	{
		System.out.println("inside getName port 9097");
		return "hello from port 9097";
	}
}
