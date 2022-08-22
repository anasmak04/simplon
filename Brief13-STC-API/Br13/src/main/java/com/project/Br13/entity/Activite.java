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
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @Entity 
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class Activite {
		
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_activite; 
	private String titre;
	private String descriptif;
	private Date date_debut;
	private Date date_Fin;
	private boolean etat;
	private Integer id_responsable;
	
	
	 	@ManyToMany
	    @JoinTable(name = "Exercice_Activite", joinColumns = @JoinColumn(name = " id_activite"),
	    inverseJoinColumns = @JoinColumn(name = "id_exercice"))
	    private List<Exercice> exercices;
	 	
	 	
		@ManyToMany
	    @JoinTable(name = "Partcipant_Activite", joinColumns = @JoinColumn(name = " id_activite"),
	    inverseJoinColumns = @JoinColumn(name = "id_participant"))
	    private List<Participant> participant;
		
		@ManyToOne
	    @JoinColumn(name = "idTypeActivite")
	    private TypeActivite typeactivite;
	
}