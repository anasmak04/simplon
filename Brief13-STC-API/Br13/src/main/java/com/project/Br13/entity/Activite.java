package com.project.Br13.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,

property = "id_activite")
public class Activite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_activite;
	private String titre;
	private String descriptif;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_debut;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_fin;
	private boolean etat;
		
	@Embedded
    //@Transient
    @AttributeOverrides( {
           @AttributeOverride(name="type", column = @Column(name="type_activite") )
        }
           )
    private TypeActivite typeactivite;


     @ManyToOne
        @JoinColumn( name = "id_responsable" )
        private Responsable Responsable;

     @ManyToOne
        @JoinColumn( name = "id_exercice" )
        private Exercice exercice;

     @ManyToOne
        @JoinColumn( name = "id_participant" )
        private Participant Participant;
	
}