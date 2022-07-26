package brief2;

public class Employe {
		
	private String name,prenom,Date;
	
	////// constructeur
	
	public Employe (String name, String prenom,String Date) {
		this.name = name;
		this.prenom = prenom;
		this.Date = Date;
	}
	
	
	
	///////// Getters
	
	public String getName () {
		return name;
	}
	
	
	public String getPrenom () {
		return prenom;
	}
	
	
	public String getDate () {
		return Date;
	}


}
