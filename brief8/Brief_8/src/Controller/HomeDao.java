package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import Connexion.DbConnect;
import models.Tache;

public class HomeDao implements Home_Interface_Dao {

	@Override
	public boolean AddTache(Tache tache) {
		 try { 
		      PreparedStatement stmt = connection.prepareStatement("INSERT INTO tache (tache,description,status,deadline,nom_caegorie) VALUES (?,?, ?, ?, ?)");
		      stmt.setString(1, tache.getTache());
		      stmt.setString(2, tache.getDescription());
		      stmt.setString(3,tache.getStatus());
		      stmt.setString(4,tache.getDeadline());
		      stmt.setString(5,tache.getNom_caegorie() );


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
	public boolean UpdateTache(String tache, Tache tache1) {
		 try {
		        PreparedStatement stmt = connection.prepareStatement("UPDATE tache SET  description=?, status=?, deadline=?, nom_caegorie=?   WHERE tache=?");

			      stmt.setString(1,tache1.getDescription());
			      stmt.setString(2, tache1.getStatus());
			      stmt.setString(3, tache1.getDeadline());
			      stmt.setString(4, tache1.getNom_caegorie());
			      stmt.setString(5 ,tache1.getTache());
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

	@Override
	public Set<Tache> select() {
		try {
			Statement stmt = connection.createStatement(); 
			 ResultSet resultSet = stmt.executeQuery("select * from tache");
			 	
		     Set<Tache> taches = new HashSet<Tache>();

			while (resultSet.next()) {

			Tache tache  = new Tache(null, null, null, null, null);
		
			tache.setTache(resultSet.getString("tache"));
			tache.setDescription(resultSet.getString("description"));
			tache.setStatus(resultSet.getString("status"));
			tache.setDeadline(resultSet.getString("deadline"));
			tache.setNom_caegorie(resultSet.getString("nom_caegorie"));

			
			
			taches.add(tache);
			
			}
			
			return taches;
			} catch (Exception e) {
			e.printStackTrace();
			System.err.println("problem in lister...");
			}
 
			System.out.println("error");
			return null;

	}

	@Override
	public String delete(String tache) {        
		 try {
		        Statement stmt = connection.createStatement();
		        int i = stmt.executeUpdate("DELETE FROM tache WHERE tache='" + tache + "'");

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
	}

	
	

