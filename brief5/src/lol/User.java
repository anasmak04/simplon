package lol;

public class User {
		
	private int id;
	private String name,prenom,mail,adresse,ville,pays;
	
	public User(int id, String name, String prenom, String mail, String adresse, String ville, String pays) {
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
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
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
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
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
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
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", ville=" + ville + ", pays=" + pays + "]";
	}
}
