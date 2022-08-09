package net.j2ee.ecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Cours")
public class Cours {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_Cours")
	private Long id_Cours;
	@Column(name="name_Cours")
	private String name_Cours;
	
	public Cours() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Cours(Long id_Cours, String name_Cours) {
		super();
		this.id_Cours = id_Cours;
		this.name_Cours = name_Cours;
	}

	public Long getId_Cours() {
		return id_Cours;
	}

	public void setId_Cours(Long id_Cours) {
		this.id_Cours = id_Cours;
	}

	public String getName_Cours() {
		return name_Cours;
	}

	public void setName_Cours(String name_Cours) {
		this.name_Cours = name_Cours;
	}

	@Override
	public String toString() {
		return "Cours [id_Cours=" + id_Cours + ", name_Cours=" + name_Cours + "]";
	}
	
	

}
