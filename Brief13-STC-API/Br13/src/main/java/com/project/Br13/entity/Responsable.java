package com.project.Br13.entity;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @Entity

public class Responsable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_responsable;
	private String nom;
	private String prenom;
	private String telephone;
	private String domaine;
	private boolean etat;
	
	@OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Participant> participants;
	
	@ManyToOne
    @JoinColumn(name = "idTypeResponsable")
    private TypeRespnsable typeresponsable;

	public Responsable() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Responsable(Long id_responsable, String nom, String prenom, String telephone, String domaine,
			boolean etat, List<Participant> participants, TypeRespnsable typeresponsable) {
		super();
		this.id_responsable = id_responsable;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.domaine = domaine;
		this.etat = etat;
		this.participants = participants;
		this.typeresponsable = typeresponsable;
	}

	public Long getId_responsable() {
		return id_responsable;
	}

	public void setId_responsable(Long id_responsable) {
		this.id_responsable = id_responsable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public TypeRespnsable getTyperesponsable() {
		return typeresponsable;
	}

	public void setTyperesponsable(TypeRespnsable typeresponsable) {
		this.typeresponsable = typeresponsable;
	}

	@Override
	public String toString() {
		return "Responsable [id_responsable=" + id_responsable + ", nom=" + nom + ", prenom=" + prenom + ", telephone="
				+ telephone + ", domaine=" + domaine + ", etat=" + etat + ", participants=" + participants
				+ ", typeresponsable=" + typeresponsable + "]";
	}
	
	
}
