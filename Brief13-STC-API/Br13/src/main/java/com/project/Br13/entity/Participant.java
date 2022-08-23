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
@Table(name="Participant")
public class Participant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id_participant;
	private String fullname;
	private String telephone;
	private String email;
	private String domaine;
	private String structure;
	
	@ManyToMany
    @JoinTable(name = "Partcipant_Activite", joinColumns = @JoinColumn(name = "id_participant "),
    inverseJoinColumns = @JoinColumn(name = "id_activite"))
    private List<Activite> activite;
	
	@ManyToOne
    @JoinColumn(name = "idResponsable")
    private Responsable responsable;

	public Participant() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Participant(Long id_participant, String fullname, String telephone, String email, String domaine,
			String structure, List<Activite> activite, Responsable responsable) {
		super();
		this.id_participant = id_participant;
		this.fullname = fullname;
		this.telephone = telephone;
		this.email = email;
		this.domaine = domaine;
		this.structure = structure;
		this.activite = activite;
		this.responsable = responsable;
	}

	public Long getId_participant() {
		return id_participant;
	}

	public void setId_participant(Long id_participant) {
		this.id_participant = id_participant;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public List<Activite> getActivite() {
		return activite;
	}

	public void setActivite(List<Activite> activite) {
		this.activite = activite;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	@Override
	public String toString() {
		return "Participant [id_participant=" + id_participant + ", fullname=" + fullname + ", telephone=" + telephone
				+ ", email=" + email + ", domaine=" + domaine + ", structure=" + structure + ", activite=" + activite
				+ ", responsable=" + responsable + "]";
	}
	
	
	
	
}
