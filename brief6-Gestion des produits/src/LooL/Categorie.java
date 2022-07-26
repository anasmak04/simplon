package LooL;

public class Categorie {
		
	private String ref_categorie,nom_categorie;

	
	public Categorie(String ref_categorie, String nom_categorie) {
		super();
		this.ref_categorie = ref_categorie;
		this.nom_categorie = nom_categorie;
	}
	


	public Categorie(String ref_categorie) {
		super();
		this.ref_categorie = ref_categorie;
	}



	public String getRef_categorie() {
		return ref_categorie;
	}


	public void setRef_categorie(String ref_categorie) {
		this.ref_categorie = ref_categorie;
	}


	public String getNom_categorie() {
		return nom_categorie;
	}


	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}


	@Override
	public String toString() {
		return "Categorie [ref_categorie=" + ref_categorie + ", nom_categorie=" + nom_categorie + "]";
	}

	
}
