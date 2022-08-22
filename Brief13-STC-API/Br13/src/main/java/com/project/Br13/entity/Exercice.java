package com.project.Br13.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class Exercice {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

		private Integer id_exercice;
		private Integer annee;
		private Date date_debut;
		private Date date_fin;
		private boolean statut;
		
	 	@ManyToMany
	    @JoinTable(name = "Exercice_Activite", joinColumns = @JoinColumn(name = "id_exercice "),
	    inverseJoinColumns = @JoinColumn(name = "id_activite"))
	    private List<Activite> activite;
		
}
