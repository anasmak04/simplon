package com.project.Br13.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,

property = "id_activite")
public class Activite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_activite;
	private String titre;
	private String descriptif;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_debut;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_fin;
	private boolean etat;
	private TypeActivite typeactivite;

//	@ManyToMany
//	@JoinTable(name = "Exercice_Activite", joinColumns = @JoinColumn(name = " id_activite"), inverseJoinColumns = @JoinColumn(name = "id_exercice"))
//	private List<Exercice> exercices;
//
//	@ManyToMany
//	@JoinTable(name = "Partcipant_Activite", joinColumns = @JoinColumn(name = " id_activite"), inverseJoinColumns = @JoinColumn(name = "id_participant"))
//	private List<Participant> participant;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "activite_participant", joinColumns = {
			@JoinColumn(name = "id_activite") }, inverseJoinColumns = { @JoinColumn(name = "id_participant") })
	private List<Participant> participants = new ArrayList<Participant>();
}