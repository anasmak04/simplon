package com.project.Br13.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor 
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,

property = "id_responsable")
public class Responsable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_responsable;
	private String nom;
	private String prenom;
	private String telephone;
	private String domaine;
	private boolean etat;
	private TypeRespnsable typeresponsable;

//	@OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<Participant> participants;
	
	@OneToMany
    //@Transient
    @JoinColumn( name = "id_participant")
	List<Participant> participants = new ArrayList<>();
	
	@OneToMany
    //@Transient
    @JoinColumn( name = "id_activite")
    List<Activite> activites = new ArrayList<>();
	


}
