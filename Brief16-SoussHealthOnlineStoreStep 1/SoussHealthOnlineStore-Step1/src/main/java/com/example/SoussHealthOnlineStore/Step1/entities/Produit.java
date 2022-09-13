package com.example.SoussHealthOnlineStore.Step1.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "prouits_id")
public class Produit{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prouits_id")
	private Long id;
	private String name;
	private String description;
//	//enter id directly instead of object.
//	private Set<Integer> categories;

	@ManyToMany
	@JoinTable(name = "commande", joinColumns = @JoinColumn(name = "produit_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<Utilisateur> utilisateurs;

	@ManyToOne
	@JoinColumn(name = "categorie_id")
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Categorie categorie;
}
