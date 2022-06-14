package application;

public class User {
	
	
	private int id;
	private String nom,prenom,mail,Adresse,ville,pays;
	public User(int id, String nom, String prenom, String mail, String adresse, String ville, String pays) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		Adresse = adresse;
		this.ville = ville;
		this.pays = pays;
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
}
