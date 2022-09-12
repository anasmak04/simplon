package com.example.SoussHealthOnlineStore.Step1.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categories{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@JsonIgnore
	private Long id_categorie;
	private String name_Categorie;


	
	@ManyToMany
	@JoinTable(
			  name = "produits_categories", 
			  joinColumns = @JoinColumn(name = "name_Categorie"), 
			  inverseJoinColumns = @JoinColumn(name = "prouits_id"))
	private List<Produits> produits;
}
