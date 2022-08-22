package com.project.Br13.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class Responsable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_responsable;
	private Integer id_type_responsable;
	private String nom;
	private String prenom;
	private String telephone;
	private String domaine;
	private boolean etat;
}
