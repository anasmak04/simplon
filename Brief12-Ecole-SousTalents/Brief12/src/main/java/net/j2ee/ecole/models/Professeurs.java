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
@Table(name="Professeurs")
public class Professeurs {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_Prof")
	private int id_Prof;
	@Column(name="name_Prof")
	private String name_Prof;
	@Column(name="presnom_Prof")
	private String presnom_Prof;
	
	@OneToMany(mappedBy = "professeurs" , fetch = FetchType.EAGER)
    private Collection<Cours> cours = new ArrayList<Cours>();

	public Professeurs() {
		super();
	}

	public Professeurs(int id_Prof, String name_Prof, String presnom_Prof, Collection<Cours> cours) {
		super();
		this.id_Prof = id_Prof;
		this.name_Prof = name_Prof;
		this.presnom_Prof = presnom_Prof;
		this.cours = cours;
	}

	public int getId_Prof() {
		return id_Prof;
	}

	public void setId_Prof(int id_Prof) {
		this.id_Prof = id_Prof;
	}

	public String getName_Prof() {
		return name_Prof;
	}

	public void setName_Prof(String name_Prof) {
		this.name_Prof = name_Prof;
	}

	public String getPresnom_Prof() {
		return presnom_Prof;
	}

	public void setPresnom_Prof(String presnom_Prof) {
		this.presnom_Prof = presnom_Prof;
	}

	public Collection<Cours> getCours() {
		return cours;
	}

	public void setCours(Collection<Cours> cours) {
		this.cours = cours;
	}

	@Override
	public String toString() {
		return "Professeurs [id_Prof=" + id_Prof + ", name_Prof=" + name_Prof + ", presnom_Prof=" + presnom_Prof
				+ ", cours=" + cours + "]";
	}
	
	
	
	
	
}
