package com.project.Br13.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;


@Embeddable
public class TypeRespnsable {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
	
}
