package com.example.springData.models;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Firstname;
	private String LastName;
	@Embedded
	private StudentInfos studentinfos;
	
}
