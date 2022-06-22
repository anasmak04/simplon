
package Controller;

import java.sql.Connection;
import Connexion.DbConnect;
import models.User;



public interface User_Interface_Dao {
	
	Connection connection = DbConnect.getConnection();

	public boolean insertUser(User user);
}
