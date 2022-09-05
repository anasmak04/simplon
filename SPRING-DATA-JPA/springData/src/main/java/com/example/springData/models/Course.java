package com.example.springData.models;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long courseId; 
		private String title;
		private String credit;
		
		@OneToOne(mappedBy = "course")
		private CourseMaterial courseMaterial;
		
		
}
