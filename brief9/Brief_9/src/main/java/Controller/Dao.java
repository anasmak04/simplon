//package Controller;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import Connection.DbConnect;
//
//import Model.Useer;
//
//public class Dao implements Interface {
//
//	@Override
//	public boolean insertUser(Useer useer) {
//		// TODO Auto-generated method stub
//		try { 
//		      PreparedStatement stmt = connection.prepareStatement("INSERT INTO Useer (Namee ,Email ,Passwordd) VALUES (?,?, ?)");
//		      stmt.setString(1, useer.getNamee());
//		      stmt.setString(2,useer.getEmail() );
//		      stmt.setString(3,useer.getPasswordd() );
//		      int i = stmt.executeUpdate();
//		      if(i == 1) { 
//		      return true;
//		      }
//			   	stmt.close();
//			    connection.close();
//
//		  } 
//		  	catch (SQLException ex) {
//		      ex.printStackTrace();
//		  }
//
//		  return false;
//		  }
//
//}
