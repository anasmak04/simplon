package com.project.Br13.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="typeresponsable")
@Data 
public class TypeRespnsable {
	@Id
	@Column(name="idTypeResponsable")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String type;
	
	@OneToMany(mappedBy = "typeresponsable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Responsable> responsables;

	public TypeRespnsable() {
		super();
		//TODO Auto-generated constructor stub
	}

	public TypeRespnsable(long id, String type, List<Responsable> responsables) {
		super();
		this.id = id;
		this.type = type;
		this.responsables = responsables;
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

	public List<Responsable> getResponsables() {
		return responsables;
	}

	public void setResponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}

	@Override
	public String toString() {
		return "TypeRespnsable [id=" + id + ", type=" + type + ", responsables=" + responsables + "]";
	}
	
	
}
