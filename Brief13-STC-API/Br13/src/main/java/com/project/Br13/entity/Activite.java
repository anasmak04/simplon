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

public class Activite {
		
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_activite; 
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

		public Activite() {
			super();
			//TODO Auto-generated constructor stub
		}

		public Activite(Long id_activite, String titre, String descriptif, Date date_debut, Date date_Fin, boolean etat,
				Integer id_responsable, List<Exercice> exercices, List<Participant> participant,
				TypeActivite typeactivite) {
			super();
			this.id_activite = id_activite;
			this.titre = titre;
			this.descriptif = descriptif;
			this.date_debut = date_debut;
			this.date_Fin = date_Fin;
			this.etat = etat;
			this.id_responsable = id_responsable;
			this.exercices = exercices;
			this.participant = participant;
			this.typeactivite = typeactivite;
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

		public Date getDate_Fin() {
			return date_Fin;
		}

		public void setDate_Fin(Date date_Fin) {
			this.date_Fin = date_Fin;
		}

		public boolean isEtat() {
			return etat;
		}

		public void setEtat(boolean etat) {
			this.etat = etat;
		}

		public Integer getId_responsable() {
			return id_responsable;
		}

		public void setId_responsable(Integer id_responsable) {
			this.id_responsable = id_responsable;
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

		public TypeActivite getTypeactivite() {
			return typeactivite;
		}

		public void setTypeactivite(TypeActivite typeactivite) {
			this.typeactivite = typeactivite;
		}

		@Override
		public String toString() {
			return "Activite [id_activite=" + id_activite + ", titre=" + titre + ", descriptif=" + descriptif
					+ ", date_debut=" + date_debut + ", date_Fin=" + date_Fin + ", etat=" + etat + ", id_responsable="
					+ id_responsable + ", exercices=" + exercices + ", participant=" + participant + ", typeactivite="
					+ typeactivite + "]";
		}
	
		
}