package LooL;


public class Produits {
	private String ref_produit,nom_produit,type_produit,ref_categorie;
	private int Qte_produit;
	private float prix_produit;

	
	public Produits(String ref_produit, String nom_produit, String type_produit, int qte_produit,
			float prix_produit, String ref_categorie) {
		
		this.ref_produit = ref_produit;
		this.nom_produit = nom_produit;
		this.type_produit = type_produit;
		this.Qte_produit = qte_produit;
		this.prix_produit = prix_produit;
		this.ref_categorie = ref_categorie;
	}

	public String getRef_produit() {
		return ref_produit;
	}

	public void setRef_produit(String ref_produit) {
		this.ref_produit = ref_produit;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	
	public String getType_produit() {
		return type_produit;
	}

	public void setType_produit(String type_produit) {
		this.type_produit = type_produit;
	}

	public int getQte_produit() {
		return Qte_produit;
	}

	public void setQte_produit(int qte_produit) {
		Qte_produit = qte_produit;
	}

	public float getPrix_produit() {
		return prix_produit;
	}

	public void setPrix_produit(float prix_produit) {
		this.prix_produit = prix_produit;
	}
	
	public String getRef_categorie() {
		return ref_categorie;
	}

	public void setRef_categorie(String ref_categorie) {
		this.ref_categorie = ref_categorie;
	}

	@Override
	public String toString() {
		return "Produits [ref_produit=" + ref_produit + ", nom_produit=" + nom_produit + ", type_produit="
				+ type_produit + ", Qte_produit=" + Qte_produit + ", prix_produit=" + prix_produit + "]";
	}

	public void add(Produits produit1) {
		// TODO Auto-generated method stub
		
	}

	

	

	
	
	
}
