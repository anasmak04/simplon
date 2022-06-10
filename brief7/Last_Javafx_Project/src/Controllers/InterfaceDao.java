package Controllers;

import java.sql.Connection;

import application.DbConnect;

public interface InterfaceDao {
	Connection connection = DbConnect.getConnection();

	public void insert();
	public void update();
	public void delete();
	public void select();
}
