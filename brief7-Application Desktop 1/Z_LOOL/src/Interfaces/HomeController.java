package Interfaces;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;

import java.beans.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import Controller.DAO;
import application.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class HomeController implements Initializable {
	DAO da = new DAO();
	@FXML
	private AnchorPane container;
	@FXML 
	private TextField id;
	@FXML 
	private TextField nom;
	@FXML
	private TextField prenom;
	@FXML
	private TextField mail;
	@FXML
	private TextField Adresse;
	@FXML
	private TextField ville;
	@FXML
	private TextField pays;
	@FXML
	private PasswordField pasword;
	@FXML
	private TableView <User> table;
	@FXML
	private TableColumn <User, Integer> id_column;
	@FXML
	private TableColumn <User, String> nom_column;
	@FXML
	private TableColumn  <User, String> prenom_column;
	@FXML
	private TableColumn <User, String> mail_column;
	@FXML
	private TableColumn <User, String> Adresse_column;
	@FXML
	private TableColumn <User, String> ville_column;
	@FXML
	private TableColumn <User, String> pays_column;
	@FXML
	private TableColumn <User, String> pasowrd_column;
	@FXML
	private Button insert_btn;
	@FXML
	private Button update_btn;
	@FXML
	private Button delete_btn;
	@FXML
	private Button select_btn;


	
	
	
	

	

	
	
    private ObservableList<User> data = FXCollections.observableArrayList(
//			new User(266,"AYOUB","OUDON","anasdec@gmail.com","temara rabat12","rabat","maroc"),
//			new User(265,"AYOUB","OUDON","anasdec@gmail.com","temara rabat12","rabat","maroc"),
//			new User(262,"AYOUB","OUDON","anasdec@gmail.com","temara rabat12","rabat","maroc")
); 
	
	
	public void affiche() {
		data.addAll(da.select());
		id_column.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
		nom_column.setCellValueFactory(new PropertyValueFactory<User, String>("nom"));
		prenom_column.setCellValueFactory(new PropertyValueFactory<User, String>("prenom"));
		mail_column.setCellValueFactory(new PropertyValueFactory<User, String>("mail"));
		Adresse_column.setCellValueFactory(new PropertyValueFactory<User, String>("adresse"));
		ville_column.setCellValueFactory(new PropertyValueFactory<User, String>("ville"));
   		pays_column.setCellValueFactory(new PropertyValueFactory<User, String>("pays"));
   		pasowrd_column.setCellValueFactory(new PropertyValueFactory<User, String>("pasword"));
		table.setItems(data);
		table.refresh();
		}
			
		
	@FXML
	public void updateAction(ActionEvent event) throws IOException {
		 int userId = Integer.parseInt(id.getText());
			User user = new User(userId,nom.getText(),prenom.getText(),mail.getText(),Adresse.getText(),ville.getText(),pays.getText(),pasword.getText());
			System.out.println(da.update(userId,user));	
			 
}
	
	//	// Event Listener on Button[#insert_btn].onAction
	@FXML
		public void insertAction(ActionEvent event) throws IOException {
        int userId = Integer.parseInt(id.getText());
		User user = new User(userId,nom.getText(),prenom.getText(),mail.getText(),Adresse.getText(),ville.getText(),pays.getText(),pasword.getText());
		System.out.println(da.insert(user));
	}
	
	
	@FXML
	public void  delete_Action(ActionEvent event) throws IOException {
		 int userId = Integer.parseInt(id.getText());
		new User(userId,nom.getText(),prenom.getText(),mail.getText(),Adresse.getText(),ville.getText(),pays.getText(),pasword.getText());
		//System.out.println(da.delete(userId));
		da.delete(userId);
	} 
	
	@FXML
	public void  select_Action(ActionEvent event) throws IOException {
		System.out.println("helllo");
		affiche();
	} 
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		affiche();
 
	}
}
