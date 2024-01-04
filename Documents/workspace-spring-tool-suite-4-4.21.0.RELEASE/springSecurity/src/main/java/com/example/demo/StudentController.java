package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	public StudentController() {
		System.out.println("inside Student Controller const");
		}
	
	@GetMapping("/springsecurity")
	public String getName()
	{
		System.out.println("inside getname");
		return "This is spring Security program";
	}

}
