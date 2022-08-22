package com.project.Br13.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="typeresponsable")
@Data @NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class TypeRespnsable {
	@Id
	@Column(name="idTypeResponsable")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String type;
	
	@OneToMany(mappedBy = "typeresponsable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Responsable> responsables;
}
