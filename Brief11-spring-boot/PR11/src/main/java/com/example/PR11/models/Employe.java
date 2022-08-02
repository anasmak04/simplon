package com.example.PR11.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employes")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id_employees")
	private Long id_employees;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="Adress")
	private String Adress;
	@Column(name="Contact")
	private String Contact;
	public Employe(Long id_employees, String firstname, String lastname, String email, String adress, String contact) {
		super();
		this.id_employees = id_employees;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		Adress = adress;
		Contact = contact;
	}
	public Employe() {
		//TODO Auto-generated constructor stub
	}
	public Long getId_employees() {
		return id_employees;
	}
	public void setId_employees(Long id_employees) {
		this.id_employees = id_employees;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	
	
}
