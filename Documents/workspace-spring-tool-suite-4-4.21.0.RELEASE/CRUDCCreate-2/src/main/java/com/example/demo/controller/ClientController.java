package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ClientRepository;
import com.example.demo.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	ClientService clientService;
	
	public ClientController() {
		System.out.println("inside clientController Const");
	}
	
	@PostMapping("/createClient")
	public Client createclient(@RequestBody Client c)
	{
		System.out.println("inside.createclient");
		Client cli= clientService.createclient(c);
		return cli;
	}
	
	
	@GetMapping("/getAllClient")
	public Iterable<Client> getAllClient()
	{
		System.out.println("inside ClientController.getAllClient");
		
		 Iterable<Client> client=clientService.getAllClient();
		return client;
		
	}
	
	
	@GetMapping("/getClientById/{cid}")
	public Client getClientById(@PathVariable ("cid") int id)
	{
		System.out.println("inside getClientById");
		Client c =clientService.getClientById(id);
		
		return c;
	}
}
