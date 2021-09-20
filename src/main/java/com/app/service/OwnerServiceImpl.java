package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.OwnerRepository;
import com.app.pojo.Owner;

@Service
@Transactional
public class OwnerServiceImpl implements IOwnerService {
	//dependency : dao layer interface
	@Autowired
	private OwnerRepository repo;

	
	@Override
	public List<Owner> fetchAllKitchens() {
		// this method fetches list of kitchen name from database
		return repo.findAll();
	}


	@Override
	public Owner saveOwner(Owner transientOwner) {
		// this method will add a new Owner into the rushirasoi database
		return repo.save(transientOwner);
	}
	
	

}
