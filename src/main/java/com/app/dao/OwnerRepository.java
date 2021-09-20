package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.Owner;

//this is dao layer
public interface OwnerRepository extends JpaRepository<Owner, Integer>{
	//fetch data from database
	List<Owner> findAll();
	
	
}
