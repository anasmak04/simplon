package com.example.SoussHealthOnlineStore.Step1.entities;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.*;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id_categorie")
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id_categorie;
	private String name_Categorie;
 

//    @JsonIgnore
	@OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
	private List<Produit> produit;
}
