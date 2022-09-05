package com.example.springData.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "course")
public class CourseMaterial {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseMaterialId;
	private String url;
	
	@OneToOne(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY
			)
	@JoinColumn(
				name="course_id",
				referencedColumnName="courseId"
			)
	private Course course;
			
			
}
