package com.example.SoussHealthOnlineStore.Step1.entities;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	private String name;
	private String password;
}
