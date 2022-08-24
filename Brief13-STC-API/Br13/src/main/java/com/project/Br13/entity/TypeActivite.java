package com.project.Br13.entity;


import javax.persistence.*;



@Embeddable
public class TypeActivite {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
