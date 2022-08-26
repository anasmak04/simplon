package com.project.Br13.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.hibernate.annotations.CreationTimestamp;

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

property = "id_exercice")

public class Exercice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_exercice;
	private Long annee;
	@CreationTimestamp
	@Column(updatable = true)
	Timestamp date_debut;
	@CreationTimestamp
	@Column(updatable = true)
	Timestamp date_fin;
	private boolean statut;

	@ManyToMany
	@JoinTable(name = "Exercice_Activite", joinColumns = @JoinColumn(name = "id_exercice "), inverseJoinColumns = @JoinColumn(name = "id_activite"))
	private List<Activite> activite;

}
