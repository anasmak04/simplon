package models;

import java.sql.Date;

public class Tache {
		private String tache,description,status,deadline,nom_caegorie;

		
		

		public Tache(String tache, String description, String status, String deadline, String nom_caegorie) {
			super();
			this.tache = tache;
			this.description = description;
			this.status = status;
			this.deadline = deadline;
			this.nom_caegorie = nom_caegorie;
		}

		public String getTache() {
			return tache;
		}

		public void setTache(String tache) {
			this.tache = tache;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDeadline() {
			return deadline;
		}

		public void setDeadline(String deadline) {
			this.deadline = deadline;
		}

		public String getNom_caegorie() {
			return nom_caegorie;
		}

		public void setNom_caegorie(String nom_caegorie) {
			this.nom_caegorie = nom_caegorie;
		}
		
		
}
