package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Student;
import com.example.demo.dao.Studentrepository;

@Service
public class StudentService {

	@Autowired
	Studentrepository studentrepository;

	public StudentService() {
		System.out.println("inside Studentservice");
	}

	public Student createstudent(Student std) {
		System.out.println("inside StudentService.createStudent");
		Student s = studentrepository.save(std);
		return s;
	}

	public Iterable<Student> getallStudent() {
		System.out.println("studnetService getallStudent");
		Iterable<Student> s = studentrepository.findAll();
		return s;
	}

	public Student getById(int id) {
		System.out.println("inside getBYId");
		Optional<Student> stdid = studentrepository.findById(id);
		if (stdid.isPresent()) {
			System.out.println("stdid is present in database" + stdid);
			Student std1 = stdid.get();
			return std1;
		} else {
			System.out.println("stdid is not present" + stdid);
			return new Student();
		}
	}

	
	public Student updateStudent(Student stdin) {
		Student stdupdate = new Student();
		Optional<Student> stdid = studentrepository.findById(stdin.getId());

		if (stdid.isPresent()) {
			Student stdfromDb = stdid.get();
			System.out.println("std from db" + stdfromDb);

			stdupdate.setId(stdfromDb.getId());
			

			if (stdin.getName() == null) {
				System.out.println("No Name recived from UI");
				stdupdate.setName(stdfromDb.getName());
			} else {
				System.out.println("name recived from UI");
				stdupdate.setName(stdin.getName());
			}

			if (stdin.getAddress() == null) {
				System.out.println("No Address recived from UI");
				stdupdate.setAddress(stdin.getAddress());
			} else {
				System.out.println("No Address recived fron UI");
				stdupdate.setAddress(stdin.getAddress());
			}

			System.out.println("final Student to be update" + stdupdate);
			Student ss = studentrepository.save(stdupdate);
			return ss;

		} else {
			System.out.println("Student not present for Id" + stdin.getId());
		}
		return null;
	}

	/*
	 * public Student updateStudent(Student stdin) { //find stdl from db // take the
	 * missing values from db (already values in table)
	 * 
	 * Student stdtoUpdate= new Student(); Optional<Student>
	 * std111=studentrepository.findById(stdin.getId());
	 * 
	 * if(std111.isPresent()) { Student stdFromDB=std111.get();
	 * System.out.println("std from db --->" +stdFromDB);
	 * 
	 * stdtoUpdate.setId(stdFromDB.getId());
	 * 
	 * if(stdin.getName()==null) { System.out.println("no name from UI");
	 * stdtoUpdate.setName(stdFromDB.getName()); } else {
	 * System.out.println(" name received from UI");
	 * stdtoUpdate.setName(stdin.getName()); }
	 * 
	 * if(stdin.getAddress()==null) { System.out.println("no Address from UI");
	 * stdtoUpdate.setAddress(stdFromDB.getAddress()); } else {
	 * System.out.println(" Address received from UI");
	 * stdtoUpdate.setAddress(stdin.getAddress()); }
	 * 
	 * System.out.println("final std to be updated --->" +stdtoUpdate);
	 * 
	 * Student ss=studentrepository.save(stdtoUpdate); return ss;
	 * 
	 * }else { System.out.println("std not present for id -->" +stdin.getId()); }
	 * 
	 * 
	 * return null; }
	 */
}
