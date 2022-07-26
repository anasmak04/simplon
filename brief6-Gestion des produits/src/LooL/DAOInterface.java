package LooL;

import java.sql.Connection;





public interface DAOInterface {
	  Connection connection = DbConnect.getConnection();
////////////////////////////////produits/////////////////////////////////////
	  boolean insertProduits(Produits produits);
	  boolean updateProduits(String ref_produit, Produits produits);
	  String deleteProduits(String ref_produit);
	  String select2();


	  
///////////////////////////////////////categorie////////////////////////////
	  boolean insertCategorie (Categorie categorie);
	  boolean updateCategorie(String ref_categorie,Categorie categorie);
	  String deleteCategorie(String ref_categorie);
	  String select1();

	  
	  //////Lister tous les produits d’une catégorie précise
	  boolean Select_categorie1(Categorie categorie);
	  
}
