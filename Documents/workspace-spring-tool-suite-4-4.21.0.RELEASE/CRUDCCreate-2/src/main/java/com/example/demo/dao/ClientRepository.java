package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
	
	

}
