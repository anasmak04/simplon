package com.project.Br13.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class Admin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private String password;
	private String email;
	private String telephone;
	
//	 @OneToOne(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "id_participant", referencedColumnName = "id")
//	 	private Participant participant;
	
}
