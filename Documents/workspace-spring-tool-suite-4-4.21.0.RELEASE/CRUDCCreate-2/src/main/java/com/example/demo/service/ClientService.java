package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.Client;
import com.example.demo.dao.ClientRepository;


@Service
public class ClientService {
	
	public ClientService() {
		System.out.println("inside ClientService Const");
	}
	
	@Autowired
	ClientRepository clientRepository;

	public Client createclient(Client cli)
	{
		System.out.println("inside ClientService.createclient");
		Client c= clientRepository.save(cli);
		return c;
	}

	public Iterable<Client> getAllClient() {
		System.out.println("inside ClientService.getAllClient");
		Iterable<Client> s=clientRepository.findAll();
		
		return s;
	}

	public Client getClientById( int id) {
		
		System.out.println("inside getClientById");
		Optional<Client> client =clientRepository.findById(id);
		if (client.isPresent())
		{
			System.out.println("client is present for id" +client);
			Client c = client.get();
			return c;
						
		}else
		{
			System.out.println("client is not present" +client);
			return new Client();
		}
	}

}
