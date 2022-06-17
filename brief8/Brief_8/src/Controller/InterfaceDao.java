package Controller;

import java.sql.Connection;
import Connexion.DbConnect;
import models.User;



public interface InterfaceDao {
	
	Connection connection = DbConnect.getConnection();

	public boolean insertUser(User user);
}
