package com.project.Br13.entity;

import java.util.ArrayList;
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
@Table(name = "Participant")
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id_participant;
	private String fullname;
	private String telephone;
	private String email;
	private String domaine;
	private String structure;

//	@ManyToMany
//	@JoinTable(name = "Partcipant_Activite", joinColumns = @JoinColumn(name = "id_participant "), inverseJoinColumns = @JoinColumn(name = "id_activite"))
//	private List<Activite> activite;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "participants")
	private List<Activite> activites = new ArrayList<Activite>();

	@ManyToOne
	@JoinColumn(name = "idResponsable")
	private Responsable responsable;

}
