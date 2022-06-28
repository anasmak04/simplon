package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Models.User;


public class Dao implements InterfaceDao {

	@Override
	public boolean insertUser(User user) {
		try { 
		      PreparedStatement stmt = connection.prepareStatement("INSERT INTO Useer (Namee,Email,Passwordd) VALUES (?,?, ?)");
		      stmt.setString(1,user.getNamee());
		      stmt.setString(2,user.getEmail());
		      stmt.setString(3,user.getPasswordd());
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
