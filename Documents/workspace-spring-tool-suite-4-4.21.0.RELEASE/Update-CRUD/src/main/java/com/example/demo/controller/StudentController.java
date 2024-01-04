package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
		
	public StudentController() {
		System.out.println("inside StudentController Const");
	}
	
	
	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student std)
	{
		System.out.println("inside StudentController.createstudent");
		Student s = studentService.createstudent(std);
		return s;
	}
	
	@GetMapping("/getAllStudent")
	public Iterable<Student> getallstudent()
	{
		System.out.println("inside StudentController.getAllStudent");
		Iterable<Student> s=studentService.getallStudent();
		return s;
		
	}
	
	@GetMapping("/getById/{sid}")
	public Student getById(@PathVariable ("sid") int id )
	{
		System.out.println("inside getById");
		Student sid=studentService.getById(id);
		return sid;
	}
	
	
	
	@PutMapping("/updateStudent/{sid}")
	public Student updateStudent(@RequestBody Student stdin , @PathVariable  int sid)
	{
		Student student=studentService.updateStudent(stdin);
		return student;
	}

	
	

}
