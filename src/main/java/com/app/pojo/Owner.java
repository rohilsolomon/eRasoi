package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "owner_admin_tbl")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Owner extends BaseEntity{
	@Column(length = 200)
	@NotBlank(message = "User Name is required")
	private String firstName;
	
	@Column()
	@NotBlank(message = "User Last Name is required")
	private String lastName;
	
	@NotBlank(message = "Kitchen Name is required")
	@Column( nullable = false)
	private String kitchenName;
	
	@Column( unique = true)
	@NotBlank(message = "User email is required")
	private String email;
	
	@NotBlank(message = "User password is required")
	@Length(message = "Invalid password length")
	private String password;
	
	private long mobileNo;
	
	@Column(nullable = false)
	private String address;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column
	private String city;
	
	@Column
	private Boolean status;
	
	@Transient
	@OneToMany(mappedBy = "owner",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<User> userList = new ArrayList<User>();
	
	@Transient
	@OneToMany(mappedBy = "owner",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Menu> menu = new ArrayList<Menu>();
	
	
	
}
