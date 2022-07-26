package models;

public class User {
	
	private String username,nom,pasword;
	
	
	


	public User(String username, String nom, String pasword) {
		super();
		this.username = username;
		this.nom = nom;
		this.pasword = pasword;
	}


	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	


	
	
}
