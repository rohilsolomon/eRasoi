package com.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_tbl")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{
	@Column(length = 20)
	@NotBlank(message = "User Name is required")
	private String firstName;
	
	@Column(length = 20)
	@NotBlank(message = "User Last Name is required")
	private String lastName;
	
	@Column(length = 20, unique = true)
	@NotBlank(message = "User email is required")
	private String email;
	
	@NotBlank(message = "User password is required")
	@Length(min = 8,max=20,message = "Invalid password length")
	private String password;
	
	private long mobileNo;
	
	@Column(length = 20,nullable = false)
	private String address;
	
	private String city;
	
	@ManyToOne
	@JoinColumn(name = "ownerId")
	private Owner owner;
	
}
