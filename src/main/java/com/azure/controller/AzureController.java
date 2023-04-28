package com.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.model.Product;
import com.azure.repository.AzureRepository;

@RestController
public class AzureController {

	@Autowired
	private AzureRepository repo;

	@GetMapping("/azure")
	public String helloAzure() {

		return "Welcome to Azure Web apps this is an app deployed";

	}

	@GetMapping("/products")
	public List<Product> getProducts() {

		return repo.findAll();

	}

	@GetMapping("/version1")
	public String getDeploy() {
		return "version 2";
	}

}
