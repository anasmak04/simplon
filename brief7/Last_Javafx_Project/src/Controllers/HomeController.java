package Controllers;

import application.User;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

import javafx.scene.layout.AnchorPane;

import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class HomeController {
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
	private TableView<User> column;
	@FXML
	private TableColumn<User, Integer> id_column;
	@FXML
	private TableColumn<User, String> nom_column;
	@FXML
	private TableColumn<User, String> prenom_column;
	@FXML
	private TableColumn<User, String> mail_column;
	@FXML
	private TableColumn<User, String> Adresse_column;
	@FXML
	private TableColumn<User, String> ville_column;
	@FXML
	private TableColumn<User, String> pays_column;
	@FXML
	private Button insert;
	@FXML
	private Button update;
	@FXML
	private Button delete;
	@FXML
	private Button select;

}
