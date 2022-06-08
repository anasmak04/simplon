package lol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public  class UserDao implements UserDaoInterface{
	public Set<User> getAllCandidates() {
		  Connection connection = DbConnect.getConnection();

		    try {
		        Statement stmt = connection.createStatement();
		        ResultSet rs = stmt.executeQuery("SELECT * FROM utilisateur");

		        Set<User> candidates = new HashSet<User>();
		        
		   	 while ( rs.next() ) {
		   		 
		            User user = extractCandidateFromResultSet(rs);
		            candidates.add(user);
		        }

		       return candidates;

		    } catch (SQLException ex) {
		        ex.printStackTrace();
		    }

		    return null;
		}


public User getCandiate(int id) {
	
Connection connection = DbConnect.getConnection();

try {
  Statement stmt = connection.createStatement();
  System.out.print(id);
  ResultSet rs = stmt.executeQuery("SELECT * FROM utilisateur WHERE id=" + id);

  if(rs.next())
  {
	  User user = new User();
	  user.setId( rs.getInt("id") );
	  user.setMail( rs.getString("mail") );
	  user.setName( rs.getString("name") );
	  user.setPrenom( rs.getString("prenom") );
	  user.setAdresse( rs.getString("adresse") );
	  user.setVille( rs.getString("ville") );
	  user.setPays( rs.getString("pays") );
	    
	  return user;
  }

} catch (SQLException ex) {
  ex.printStackTrace();
}

return null;
}

 
public boolean insertCandidate(User user)  {
	  Connection connection = DbConnect.getConnection();

  try {
      PreparedStatement stmt = connection.prepareStatement("INSERT INTO utilisateur (id,name,prenom,mail,adresse,ville,pays) VALUES (?, ?, ?, ?, ?, ?, ?)");
      stmt.setInt(1, user.getId());
      stmt.setString(2, user.getName());
      stmt.setString(3, user.getPrenom());
      stmt.setString(4, user.getMail());
      stmt.setString(5, user.getAdresse());
      stmt.setString(6, user.getVille());
      stmt.setString(7, user.getPays());
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
  
public boolean updateCandidate(int id, User user) {
	 Connection connection = DbConnect.getConnection();

	    try {
	        PreparedStatement stmt = connection.prepareStatement("UPDATE utilisateur SET mail=?, name=?, prenom=?, adresse=?, ville=?, pays=? WHERE id=?");

	        stmt.setString(1, user.getMail());
	        stmt.setString(2, user.getName());
	        stmt.setString(3, user.getPrenom());
	        stmt.setString(4, user.getAdresse());
	        stmt.setString(5, user.getVille());
	        stmt.setString(6, user.getPays());
	        stmt.setInt(7, id);

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
  
  
public boolean deleteCandidate(int id) {
	 Connection connection = DbConnect.getConnection();

	    try {
	        Statement stmt = connection.createStatement();
	        int i = stmt.executeUpdate("DELETE FROM utilisateur WHERE id=" + id);

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

private static User extractCandidateFromResultSet(ResultSet rs) throws SQLException {
	  User user = new User(0, null, null, null, null, null, null);
	  user.setId( rs.getInt("id") );
	  user.setMail( rs.getString("mail") );
	  user.setName( rs.getString("name") );
	  user.setPrenom( rs.getString("prenom") );
	  user.setAdresse( rs.getString("adresse") );
	  user.setVille( rs.getString("ville") );
	  user.setPays( rs.getString("pays") );
	    
	  System.out.print(user);
	  return user;
	  
	}


@Override
public Set<User> getAllUser() {
	// TODO Auto-generated method stub
	return null;
}
}
