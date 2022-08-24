package com.project.Br13.entity;

import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
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

	@ManyToMany
	@JoinTable(name = "Exercice_Activite", joinColumns = @JoinColumn(name = " id_activite"), inverseJoinColumns = @JoinColumn(name = "id_exercice"))
	private List<Exercice> exercices;

	@ManyToMany
	@JoinTable(name = "Partcipant_Activite", joinColumns = @JoinColumn(name = " id_activite"), inverseJoinColumns = @JoinColumn(name = "id_participant"))
	private List<Participant> participant;

	
	public Activite() {
		super();
	}

	public Activite(Long id_activite, String titre, String descriptif, Date date_debut, Date date_fin, boolean etat,
			TypeActivite typeactivite, List<Exercice> exercices, List<Participant> participant) {
		super();
		this.id_activite = id_activite;
		this.titre = titre;
		this.descriptif = descriptif;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.etat = etat;
		this.typeactivite = typeactivite;
		this.exercices = exercices;
		this.participant = participant;
	}

	public Long getId_activite() {
		return id_activite;
	}

	public void setId_activite(Long id_activite) {
		this.id_activite = id_activite;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public TypeActivite getTypeactivite() {
		return typeactivite;
	}

	public void setTypeactivite(TypeActivite typeactivite) {
		this.typeactivite = typeactivite;
	}

	public List<Exercice> getExercices() {
		return exercices;
	}

	public void setExercices(List<Exercice> exercices) {
		this.exercices = exercices;
	}

	public List<Participant> getParticipant() {
		return participant;
	}

	public void setParticipant(List<Participant> participant) {
		this.participant = participant;
	}

	@Override
	public String toString() {
		return "Activite [id_activite=" + id_activite + ", titre=" + titre + ", descriptif=" + descriptif
				+ ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", etat=" + etat + ", typeactivite="
				+ typeactivite + ", exercices=" + exercices + ", participant=" + participant + "]";
	}
}