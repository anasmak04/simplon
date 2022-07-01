package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Models.Task;
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

	@Override
	public boolean AddTache(Task task) {
		try { 
		      PreparedStatement stmt = connection.prepareStatement("INSERT INTO Task (task,description,status,deadline,nom_categorie) VALUES (?,?, ?, ?::Date, ?)");
		      stmt.setString(1, task.getTask());
		      stmt.setString(2, task.getDescription());
		      stmt.setString(3,task.getStatus());
		      stmt.setString(4,task.getDeadline());
		      stmt.setString(5,task.getNom_categorie());


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
	public boolean UpdateTache(Task task) {
		try {
//			System.out.println(task.getDeadline());
	        PreparedStatement stmt = connection.prepareStatement("UPDATE Task SET  description=?, status=?, deadline=?::Date, nom_categorie=?   WHERE task=?");

		      stmt.setString(1,task.getDescription());
		      stmt.setString(2, task.getStatus());
		      stmt.setString(3, task.getDeadline());
		      stmt.setString(4, task.getNom_categorie());
		      stmt.setString(5 ,task.getTask()); 
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
	public String delete(Task task) {
		try {
	        Statement stmt = connection.createStatement();
	        int i = stmt.executeUpdate("delete from Task where task = '" + task.getTask() + "'");
	        
	      if(i == 1) {
	        return "success";
	      }
		    stmt.close(); 
		    connection.close();

	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        System.out.println("error here !!");
	    }
	    
	    return "not success";
	}

	public List<Task> getAll() {
		List<Task> list=new ArrayList<Task>();  
		         
		       try{  
			        PreparedStatement st = connection.prepareStatement("select * from Task");
		           ResultSet rs=st.executeQuery();  
		           while(rs.next()){  
		               Task tsk = new Task();  
//		               u.setId(rs.getInt(1));  
//		               u.setNom(rs.getString(2));
//		               u.setPrenom(rs.getString(3));
//		               u.setNomUser(rs.getString(4));  
//		               u.setEmail(rs.getString(5));  
//		               u.setPassword(rs.getString(6));
//		               list.add(u);
		               tsk.setTask(rs.getString("task"));
						tsk.setDescription(rs.getString("description"));
						tsk.setStatus(rs.getString("status")); 
					tsk.setDeadline(rs.getString("deadline"));
					tsk.setNom_categorie(rs.getString("nom_categorie"));
					list.add(tsk);
		   }
		       }
		           catch (SQLException ex) {
		        ex.printStackTrace();
		    }
			return list;
	}



	@Override
	public Set<Task> select() {
		try {
			Statement stmt = connection.createStatement(); 
			 ResultSet resultSet = stmt.executeQuery("select * from Task");
			 	
		     Set<Task> tasks = new HashSet<Task>();

			while (resultSet.next()) {

				Task task  = new Task(null, null, null, null, null);
		
				task.setTask(resultSet.getString("task"));
				task.setDescription(resultSet.getString("description"));
				task.setStatus(resultSet.getString("status")); 
			task.setDeadline(resultSet.getString("deadline"));
			task.setNom_categorie(resultSet.getString("nom_categorie"));

	 
			tasks.add(task);
			
			}
			
			return tasks;
			} catch (Exception e) {
			e.printStackTrace();
			System.err.println("problem in lister...");
			}
 
			System.out.println("error");
			return null;

	}
}


	