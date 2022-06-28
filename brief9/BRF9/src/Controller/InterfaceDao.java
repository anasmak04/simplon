package Controller;

import java.sql.Connection;
import java.sql.Connection;

import Connection.DbConnect;
import Models.User;

public interface InterfaceDao {
	Connection connection = DbConnect.getConnection();

	public boolean insertUser(User user); 
}
