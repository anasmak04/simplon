package com.example.springData.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long TeacherId;
	private String firstName;
	private String LastName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_id", referencedColumnName = "TeacherId")
	private List<Course> course;

}
