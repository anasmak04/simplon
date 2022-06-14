package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import application.User;

public class DAO implements InterfaceDao{

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		  try {
		      PreparedStatement stmt = connection.prepareStatement("INSERT INTO utilisateur (id,name,prenom,mail,adresse,ville,pays) VALUES (?,?, ?, ?, ?, ?,?)");
		      stmt.setInt(1, user.getId());
		      stmt.setString(2,user.getNom() );
		      stmt.setString(3,user.getPrenom() );
		      stmt.setString(4,user.getMail() );
		      stmt.setString(5,user.getAdresse() );
		      stmt.setString(6,user.getVille());
		      stmt.setString(7,user.getPays());

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

	public boolean update(int id,User user) {
		// TODO Auto-generated method stub
		 try {
		        PreparedStatement stmt = connection.prepareStatement("UPDATE utilisateur SET name=?, prenom=?, mail=?, Adresse=?, ville=? ,pays=?  WHERE id=?");

			      stmt.setString(1, user.getNom());
			      stmt.setString(2, user.getPrenom());
			      stmt.setString(3, user.getMail());
			      stmt.setString(4, user.getAdresse());
			      stmt.setString(5,user.getVille());
			      stmt.setString(6,user.getPays());
			      stmt.setInt(7 ,user.getId());
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
	public String delete(int id) {
		// TODO Auto-generated method stub
		  try {
		        Statement stmt = connection.createStatement();
		        int i = stmt.executeUpdate("DELETE FROM utilisateur WHERE id='" + id + "'");

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
	public Set<User> select() {
		
		try {
			Statement stmt = connection.createStatement(); 
			 ResultSet resultSet = stmt.executeQuery("select * from utilisateur");
			 	
		     Set<User> users = new HashSet<User>();

			while (resultSet.next()) {

			User user  = new User();

			user.setId(resultSet.getInt("id"));
			user.setNom(resultSet.getString("nom"));
			user.setPrenom(resultSet.getString("prenom"));
			user.setMail(resultSet.getString("mail"));
			user.setAdresse(resultSet.getString("adresse"));
			user.setVille(resultSet.getString("ville"));
			user.setPays(resultSet.getString("pays"));
			
			return users;
			
			}

			} catch (Exception e) {
			e.printStackTrace();
			System.err.println("problem in lister...");
			}
 
			System.out.println("error");
			return null;

	}
}
