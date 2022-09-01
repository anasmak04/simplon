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

		property = "id_participant")
@Table(name = "Participant")
public class Participant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_participant;
	private String fullname;
	private String telephone;
	private String email;
	private String domaine;
	private String structure;

//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "participants")
//	private List<Activite> activites = new ArrayList<Activite>();

	@ManyToOne
	@JoinColumn(name = "id_responsable")
	private Responsable responsable;

	@OneToMany
	// @Transient
	@JoinColumn(name = "id_activite")
	List<Activite> activites = new ArrayList<>();
}
