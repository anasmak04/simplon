package net.j2ee.ecole.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Etudiant")
public class Etudiant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_Etudi")
	private int id_Etudi;
	@Column(name="name_Etudi")
	private String name_Etudi;
	@Column(name="presnom_Etudi")
	private String presnom_Etudi;
	@Column(name="niveau_Etudi")
	private String niveau_Etudi;
	@Column(name="age_Etudi")
	private int age_Etudi;
	
	
    @OneToMany(mappedBy = "etudiant" , fetch = FetchType.EAGER)
    private Collection<Cours> cours = new ArrayList<Cours>();


	public Etudiant() {
		super();
	}


	public Etudiant(int id_Etudi, String name_Etudi, String presnom_Etudi, String niveau_Etudi, int age_Etudi,
			Collection<Cours> cours) {
		super();
		this.id_Etudi = id_Etudi;
		this.name_Etudi = name_Etudi;
		this.presnom_Etudi = presnom_Etudi;
		this.niveau_Etudi = niveau_Etudi;
		this.age_Etudi = age_Etudi;
		this.cours = cours;
	}


	public int getId_Etudi() {
		return id_Etudi;
	}


	public void setId_Etudi(int id_Etudi) {
		this.id_Etudi = id_Etudi;
	}


	public String getName_Etudi() {
		return name_Etudi;
	}


	public void setName_Etudi(String name_Etudi) {
		this.name_Etudi = name_Etudi;
	}


	public String getPresnom_Etudi() {
		return presnom_Etudi;
	}


	public void setPresnom_Etudi(String presnom_Etudi) {
		this.presnom_Etudi = presnom_Etudi;
	}


	public String getNiveau_Etudi() {
		return niveau_Etudi;
	}


	public void setNiveau_Etudi(String niveau_Etudi) {
		this.niveau_Etudi = niveau_Etudi;
	}


	public int getAge_Etudi() {
		return age_Etudi;
	}


	public void setAge_Etudi(int age_Etudi) {
		this.age_Etudi = age_Etudi;
	}


	public Collection<Cours> getCours() {
		return cours;
	}


	public void setCours(Collection<Cours> cours) {
		this.cours = cours;
	}


	@Override
	public String toString() {
		return "Etudiant [id_Etudi=" + id_Etudi + ", name_Etudi=" + name_Etudi + ", presnom_Etudi=" + presnom_Etudi
				+ ", niveau_Etudi=" + niveau_Etudi + ", age_Etudi=" + age_Etudi + ", cours=" + cours + "]";
	}
	
	
	
	
	
}
