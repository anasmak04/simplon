package LooL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class DAO implements DAOInterface{
	





	public boolean insertProduits1(Produits produits)  {

	  try {
	      PreparedStatement stmt = connection.prepareStatement("INSERT INTO produits (ref_produit,nom_produit,type_produit,Qte_produit,prix_produit,ref_categorie) VALUES (?,?, ?, ?, ?, ?)");
	      stmt.setString(1, produits.getRef_produit());
	      stmt.setString(2, produits.getNom_produit());
	      stmt.setString(3, produits.getType_produit());
	      stmt.setInt(4, produits.getQte_produit());
	      stmt.setFloat(5, produits.getPrix_produit());
	      stmt.setString(6, produits.getRef_categorie());

	      int i = stmt.executeUpdate();

	      if(i == 1) {
	      return true;
	      }
		   	stmt.close();
		    connection.close();

	  } 
	  	catch (SQLException ex) {
	      ex.printStackTrace();
	  }

	  return false;
	}

	@Override
	public boolean insertProduits(Produits produits) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean updateProduits(String ref_produit, Produits produits) {

		    try {
		        PreparedStatement stmt = connection.prepareStatement("UPDATE produits SET nom_produit=?, type_produit=?, Qte_produit=?, prix_produit=?, ref_categorie=?  WHERE ref_produit=?");

			      stmt.setString(1, produits.getNom_produit());
			      stmt.setString(2, produits.getType_produit());
			      stmt.setInt(3, produits.getQte_produit());
			      stmt.setFloat(4, produits.getPrix_produit());
			      stmt.setString(5,produits.getRef_categorie() );
			      stmt.setString(6, produits.getRef_produit());
		        int i = stmt.executeUpdate();
		      if(i == 1) {
		  	    return true;
		      }
			    stmt.close(); 
			    connection.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }

		    return false;
		}


	
	public String deleteProduits1(String ref_produit) {

		    try {
		        Statement stmt = connection.createStatement();
		        int i = stmt.executeUpdate("DELETE FROM produits WHERE ref_produit='" + ref_produit + "'");

		      if(i == 1) {
		        return "success";
		      }
			    stmt.close();
			    connection.close();

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }
		    
		    return "not success";
		}
	
	@Override
	public String deleteProduits(String ref_produit) {
		// TODO Auto-generated method stub
		return "not success";
	}

		

	////////////////////////////////////categorie/////////////////////////////////////////
	public boolean insertCategorie(Categorie categorie )  {

		  try {
		      PreparedStatement stmt = connection.prepareStatement("INSERT INTO categorie (ref_categorie,nom_categorie) VALUES (?, ?)");
		      stmt.setString(1, categorie.getRef_categorie());
		      stmt.setString(2,categorie.getNom_categorie());
		      int i = stmt.executeUpdate();

		      if(i == 1) {
		      return true;
		      }
			   	stmt.close();
			    connection.close();

		  } 
		  	catch (SQLException ex) {
		      ex.printStackTrace();
		  }

		  return false;
		}
	
	
	public boolean updateCategorie(String ref_produit, Categorie categorie) {
	    try {
	        PreparedStatement stmt = connection.prepareStatement("UPDATE categorie SET nom_categorie=?   WHERE ref_categorie=?");
		      
		      stmt.setString(1,categorie.getNom_categorie());
	          stmt.setString(2, categorie.getRef_categorie());

	        int i = stmt.executeUpdate();
	      if(i == 1) {
	  	    return true;
	      }
		    stmt.close(); 
		    connection.close();

	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }

	    return false;
	}
	
	
	public String deleteCategorie(String ref_categorie) {

	    try {
	        Statement stmt = connection.createStatement();
	        int i = stmt.executeUpdate("DELETE FROM categorie WHERE ref_categorie='" + ref_categorie + "'");

	      if(i == 1) {
	        return "success";
	      }
		    stmt.close();
		    connection.close();

	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    
	    return "not success";
	}


	
	
	
	Statement stmt;
	@Override
	public String select1() {
		try {
			Statement stmt = connection.createStatement(); 
			 ResultSet resultSet = stmt.executeQuery("select * from categorie");

			while (resultSet.next()) {
				System.out.print( "ref_produi :" + " " + resultSet.getString("ref_categorie") + "\t");
				System.out.print("nom_categorie :" +" " + resultSet.getString("nom_categorie") + "\n");
				

				return "success select";
			}

		} catch (Exception e) {
			System.err.println("problem in lister...");
			System.out.println(e);
		}
		
		return "not found";
	}

	@Override
	public String select2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String select21() {
		try {
			Statement stmt =connection.createStatement(); 
			 ResultSet resultSet = stmt.executeQuery("select * from produits");

			while (resultSet.next()) {
				System.out.print( "ref_produit :" + " " + resultSet.getString("ref_produit") + "\t");
				System.out.print("nom_produit :" +" " + resultSet.getString("nom_produit") + "\t");
				System.out.print("type_produit :" +" " + resultSet.getString("type_produit") + "\t");
				System.out.print("Qte_produit :" +" " + resultSet.getInt("Qte_produit") + "\t");
				System.out.print("prix_produit :" +" " + resultSet.getString("prix_produit") + "\n");
				return "success select";
			}

		} catch (Exception e) {
			System.err.println("problem in lister...");
			System.out.println(e);
		}
		
		return "not found";
	}

	
	@Override
	public boolean Select_categorie1(Categorie categorie) {
		try {
			Statement stmt =connection.createStatement();
			System.out.println("hihi");
			String sql = "select * from categorie  join produits on  produits.ref_categorie = categorie.ref_categorie where categorie.ref_categorie = '" + categorie.getRef_categorie() + "'";
			 ResultSet resultSet = stmt.executeQuery(sql );
			 System.out.println("Selection products in category ..."); 
			while (resultSet.next()) {
				System.out.print(resultSet.getString("ref_produit") + "\t ");
				System.out.print(resultSet.getString("nom_produit") + "\t ");
				System.out.print(resultSet.getString("type_produit") + "\t ");
				System.out.print(resultSet.getInt("qte_produit") + "\t ");
				System.out.print(resultSet.getFloat("prix_produit") + "\t ");
				System.out.println("");
			}

		} catch (Exception e) {
			System.err.println("problem in lister...");
			System.out.println(e);
		}
		
		return true;
	}

	


		
}
