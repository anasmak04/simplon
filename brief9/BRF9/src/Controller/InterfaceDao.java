package Controller;

import java.sql.Connection;
import java.util.Set;

import Connection.DbConnect;
import Models.Task;
import Models.User;

public interface InterfaceDao {
	Connection connection = DbConnect.getConnection();

	public boolean insertUser(User user); 
	public boolean validate(User user);
	public boolean AddTache(Task task);
	public boolean UpdateTache(Task task);
	public String delete(Task task); 
	public Set<Task> select();



	
       

}
