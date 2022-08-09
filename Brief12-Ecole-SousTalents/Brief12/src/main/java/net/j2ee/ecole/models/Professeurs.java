package net.j2ee.ecole.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	public Professeurs() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Professeurs(String name_Prof, String presnom_Prof) {
		super();
		this.name_Prof = name_Prof;
		this.presnom_Prof = presnom_Prof;
	}
	
	public Professeurs(int id_Prof, String name_Prof, String presnom_Prof) {
		super();
		this.id_Prof = id_Prof;
		this.name_Prof = name_Prof;
		this.presnom_Prof = presnom_Prof;
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
	
	
}
