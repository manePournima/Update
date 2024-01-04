package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.Student;

@Repository
public interface Studentrepository  extends CrudRepository<Student, Integer>{

}
