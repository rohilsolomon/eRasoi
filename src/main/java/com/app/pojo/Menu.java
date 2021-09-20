package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "menu")
public class Menu extends BaseEntity{
	
	@Column(length = 20, unique = true)
	private String thaliName;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private double price;
	
	//this is many to one bi-directional association
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
	private Owner owner;

	
	public Menu() {
		super();
		System.out.println("in ctor of Menu "+getClass().getName());
	}


	public Menu(String thaliName, String description, double price, Owner owner) {
		super();
		this.thaliName = thaliName;
		this.description = description;
		this.price = price;
		this.owner = owner;
	}

	

}
