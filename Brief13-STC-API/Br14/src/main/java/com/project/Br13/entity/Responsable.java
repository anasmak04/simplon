package com.project.Br13.entity;

import java.util.List;

import javax.persistence.*;

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
public class Responsable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_responsable;
	private String nom;
	private String prenom;
	private String telephone;
	private String domaine;
	private boolean etat;
	private TypeRespnsable typeresponsable;

	@OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Participant> participants;


}
