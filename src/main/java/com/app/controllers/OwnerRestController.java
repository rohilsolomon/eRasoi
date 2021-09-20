package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Owner;
import com.app.service.IOwnerService;

@RestController
@RequestMapping("/kitchenList")
@CrossOrigin(origins = "http://localhost:3000")
public class OwnerRestController {
	//dependency : service layer interface
	@Autowired
	private IOwnerService ownService;
	
	public OwnerRestController() {
		System.out.println("in ctor of OwnerRestController() "+getClass().getName());
	}



	//write a request handling method to fetch kitchen list
	@GetMapping("/list")
	public List<Owner> fetchAllKitchenList(){
		System.out.println("in fetchAllKitchens method "+getClass().getName());
		return ownService.fetchAllKitchens();
	}
	
	//add a request handling method to add a User/Owner or add a REST end point to add new user
	@PostMapping
	public ResponseEntity<?> saveOwner(@RequestBody Owner owner){
		System.out.println("in saveOwner Method");
		System.out.println("in saveOwner method of controller "+owner);
		return new ResponseEntity<>(ownService.saveOwner(owner), HttpStatus.CREATED);
	}
}
