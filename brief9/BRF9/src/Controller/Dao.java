package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
	
	

	@Override
	public boolean validate(User user) {
	 boolean status = false;
        try {
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Useer where Email = ? and Passwordd = ? "); 
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPasswordd());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } 	catch (SQLException ex) {
		      ex.printStackTrace();
		  }
        return status;
	 
}
}


	