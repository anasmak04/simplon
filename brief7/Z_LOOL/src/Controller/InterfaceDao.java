package Controller;

import java.sql.Connection;
import java.util.Set;

import application.DbConnect;
import application.User;

public interface InterfaceDao {
	Connection connection = DbConnect.getConnection();

	public boolean insert(User user);
	public boolean update(int id,User user);
	public String delete(int id);
	public Set<User> select();
	
}
