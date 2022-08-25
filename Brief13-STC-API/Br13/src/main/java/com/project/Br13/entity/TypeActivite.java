package com.project.Br13.entity;


import javax.persistence.*;

import lombok.Data;


@Data 
@Embeddable
public class TypeActivite {
	
	private String type;

}
