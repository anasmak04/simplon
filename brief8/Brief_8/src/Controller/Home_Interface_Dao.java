package Controller;

import java.sql.Connection;
import java.util.Set;

import models.Tache;
import Connexion.DbConnect;

public interface Home_Interface_Dao {
	Connection connection = DbConnect.getConnection();

	public boolean AddTache(Tache tache);
	public boolean UpdateTache(String tache,Tache tache1);
	public Set<Tache> select();
	public String delete(String tache);


}
