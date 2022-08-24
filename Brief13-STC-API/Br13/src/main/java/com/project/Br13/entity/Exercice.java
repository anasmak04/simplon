package com.project.Br13.entity;

import java.sql.Timestamp;
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

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity

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

	public Exercice() {
		super();
	}

	public Exercice(Long id_exercice, Long annee, Timestamp date_debut, Timestamp date_fin, boolean statut,
			List<Activite> activite) {
		super();
		this.id_exercice = id_exercice;
		this.annee = annee;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.statut = statut;
		this.activite = activite;
	}

	public Long getId_exercice() {
		return id_exercice;
	}

	public void setId_exercice(Long id_exercice) {
		this.id_exercice = id_exercice;
	}

	public Long getAnnee() {
		return annee;
	}

	public void setAnnee(Long annee) {
		this.annee = annee;
	}

	public Timestamp getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Timestamp date_debut) {
		this.date_debut = date_debut;
	}

	public Timestamp getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Timestamp date_fin) {
		this.date_fin = date_fin;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public List<Activite> getActivite() {
		return activite;
	}

	public void setActivite(List<Activite> activite) {
		this.activite = activite;
	}

	@Override
	public String toString() {
		return "Exercice [id_exercice=" + id_exercice + ", annee=" + annee + ", date_debut=" + date_debut
				+ ", date_fin=" + date_fin + ", statut=" + statut + ", activite=" + activite + "]";
	}
		
}
