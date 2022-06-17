package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.User;

public class DAO implements InterfaceDao {

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		try { 
		      PreparedStatement stmt = connection.prepareStatement("INSERT INTO utilisateur (username,nom,pasword) VALUES (?,?, ?)");
		      stmt.setString(1, user.getUsername());
		      stmt.setString(2,user.getNom() );
		      stmt.setString(3,user.getPasword() );
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

	

}
