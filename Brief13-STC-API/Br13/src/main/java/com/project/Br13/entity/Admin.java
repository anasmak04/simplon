package com.project.Br13.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @Entity

public class Admin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String password;
	private String email;
	private String telephone;

//	 @OneToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "id_participant", referencedColumnName = "id")
//	 	private Participant participant;
	
	public Admin() {
		super();
		//TODO Auto-generated constructor stub
	}

public Admin(Long id, String nom, String prenom, String password, String email, String telephone) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.password = password;
	this.email = email;
	this.telephone = telephone;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

@Override
public String toString() {
	return "Admin [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", email=" + email
			+ ", telephone=" + telephone + "]";
}
	
	
}
