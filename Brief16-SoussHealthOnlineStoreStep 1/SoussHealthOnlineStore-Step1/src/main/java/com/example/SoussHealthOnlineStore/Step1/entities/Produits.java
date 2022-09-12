package com.example.SoussHealthOnlineStore.Step1.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produits implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prouits_id")
	private Long id;
	private String name;
	private String description;
//	
//	//enter id directly instead of object.//najib
//	private Set<Integer> categories;

	

	@ManyToMany
	@JoinTable(
			  name = "produits_categories", 
			  joinColumns = @JoinColumn(name = "prouits_id"), 
			  inverseJoinColumns = @JoinColumn(name = "name_Categorie"))
	private List<Categories> categories;
	
	@ManyToMany
	@JoinTable(
			  name = "commande", 
			  joinColumns = @JoinColumn(name = "prouits_id"), 
			  inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<utilisateur> utilisateurs;
}
