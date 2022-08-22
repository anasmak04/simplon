package com.project.Br13.entity;

import java.util.List;

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
public class Responsable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_responsable;
	private String nom;
	private String prenom;
	private String telephone;
	private String domaine;
	private boolean etat;
	
	@OneToMany(mappedBy = "responsable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Participant> participants;
	
	@ManyToOne
    @JoinColumn(name = "idTypeResponsable")
    private TypeRespnsable typeresponsable;
}
