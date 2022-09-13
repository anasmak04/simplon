package com.example.SoussHealthOnlineStore.Step1.entities;

import java.util.List;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;
	private String username;
	private String name;
	private String password;

	@ManyToMany
	@JoinTable(name = "commande", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "produit_id"))
	private List<Produit> produit;
}
