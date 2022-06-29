package Models;

public class Task {
	private String task,description,status,deadline,nom_caegorie;

	public Task(String task, String description, String status, String deadline, String nom_caegorie) {
		super();
		this.task = task;
		this.description = description;
		this.status = status;
		this.deadline = deadline;
		this.nom_caegorie = nom_caegorie;
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

	public String getNom_caegorie() {
		return nom_caegorie;
	}

	public void setNom_caegorie(String nom_caegorie) {
		this.nom_caegorie = nom_caegorie;
	}
	
	
		
}
