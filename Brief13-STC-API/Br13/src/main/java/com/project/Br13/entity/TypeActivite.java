package com.project.Br13.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="activite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
public class TypeActivite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String type;
	
	@OneToMany(mappedBy = "typeactivite", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Activite> activites;
}
