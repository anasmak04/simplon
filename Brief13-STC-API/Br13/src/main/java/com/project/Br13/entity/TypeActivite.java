package com.project.Br13.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="TypeActivite")


public class TypeActivite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String type;
	
	@OneToMany(mappedBy = "typeactivite", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Activite> activites;

	public TypeActivite() {
		super();
		//TODO Auto-generated constructor stub
	}

	public TypeActivite(long id, String type, List<Activite> activites) {
		super();
		this.id = id;
		this.type = type;
		this.activites = activites;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Activite> getActivites() {
		return activites;
	}

	public void setActivites(List<Activite> activites) {
		this.activites = activites;
	}
	
	
	
}
