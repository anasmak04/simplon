package net.j2ee.ecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="Cours")
public class Cours {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_Cours")
	private int id_Cours;
	@Column(name="name_Cours")
	private String name_Cours;
	
	@ManyToOne
	private Etudiant etudiant;
	
	@ManyToOne
	private Professeurs professeurs;

	public Cours() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Cours(int id_Cours, String name_Cours, Etudiant etudiant, Professeurs professeurs) {
		super();
		this.id_Cours = id_Cours;
		this.name_Cours = name_Cours;
		this.etudiant = etudiant;
		this.professeurs = professeurs;
	}

	public int getId_Cours() {
		return id_Cours;
	}

	public void setId_Cours(int id_Cours) {
		this.id_Cours = id_Cours;
	}

	public String getName_Cours() {
		return name_Cours;
	}

	public void setName_Cours(String name_Cours) {
		this.name_Cours = name_Cours;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Professeurs getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(Professeurs professeurs) {
		this.professeurs = professeurs;
	}

	@Override
	public String toString() {
		return "Cours [id_Cours=" + id_Cours + ", name_Cours=" + name_Cours + ", etudiant=" + etudiant
				+ ", professeurs=" + professeurs + "]";
	}
	
	
	
	
	

}
