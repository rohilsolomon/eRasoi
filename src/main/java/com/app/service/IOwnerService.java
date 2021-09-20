package com.app.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.pojo.Owner;

@Repository
public interface IOwnerService{
	//add a method to fetch all kitchen list
	List<Owner> fetchAllKitchens();
	
	//add a method to add new Owner
	Owner saveOwner(Owner transientOwner);
}
