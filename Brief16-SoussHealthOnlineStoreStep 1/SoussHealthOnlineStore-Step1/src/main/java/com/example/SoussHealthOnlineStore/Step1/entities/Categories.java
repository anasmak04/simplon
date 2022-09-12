package com.example.SoussHealthOnlineStore.Step1.entities;

import java.util.List;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_categorie;
	private String name_Categorie;

	@OneToMany
	private List<Produits> produits;
}
