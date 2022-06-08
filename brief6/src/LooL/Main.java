package LooL;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("!---------------------Produits--Produits------------------------!");
		DAO dao = new DAO();
		
		
		////////// insert produit ///////////////////
//				Produits Insert = new Produits("j13764","Aragane","cosmétique",59,1200,"j321"); 
//				System.out.println(dao.insertProduits1(Insert));
		
		
		///////// update produits //////////////////
//				Produits update = new Produits("j13764","ragane","eating",59,1200,"j321"); 
//			System.out.println(dao.updateProduits("j13276", update));
		
		
			///////// delete produit /////////////
//			System.out.println(dao.deleteProduits1("j131"));
		
		
		//////// get produit //////////////
//		System.out.println(dao.getAllProduits());
		
		
		
		///////////// crud categorie ///////////
//		System.out.println("------------categorie--categorie---------");
//	Categorie InsertCategorie = new Categorie("j222","beaute"); 
//		System.out.println(dao.insertCategorie(InsertCategorie));
		
		
//		Categorie updateCategorie = new Categorie("j321","abeauteee"); 
//		System.out.println(dao.updateCategorie("j321", updateCategorie));
	
		
		//// delete categorie /////
//		System.out.println(dao.deleteCategorie("j222"));
		
		
//		System.out.println(dao.select1());
//		System.out.println(dao.select21());
		Categorie cat = new Categorie("j321");
		System.out.println(dao.Select_categorie1(cat));
		
		
}

}
