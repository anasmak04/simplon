package Models;

public class Task {
	private String task,description,status,deadline,nom_categorie;

	

		
	public Task(String task, String description, String status, String deadline, String nom_categorie) {
		super();
		this.task = task;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
		this.nom_categorie = nom_categorie;
	}




	public Task() {
		// TODO Auto-generated constructor stub
	}




	public String getTask() {
		return task;
	}




	public void setTask(String task) {
		this.task = task;
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




	public String getNom_categorie() {
		return nom_categorie;
	}




	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}



	
		
}
