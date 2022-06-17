package Interfaces;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Controller.DAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import models.User;
public class RegiserController implements Initializable {

	DAO dao = new DAO();
	    @FXML
	    private Button button;

	    @FXML
	    private TextField name;

	    @FXML
	    private PasswordField pasword;

	    @FXML
	    private TextField username;
	   
	    @FXML
	    void btn_Action(ActionEvent event) throws IOException  {
			User user = new User(username.getText(),name.getText(),pasword.getText());
			System.out.println(dao.insertUser(user));
			
	    	Parent  root= FXMLLoader.load(getClass().getResource("/Interfaces/Login.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
//			Alert a = new Alert(AlertType.NONE);
//	    	  
//	  		if(name.getText().equals("anas")&& username.getText().equals("anaselmak") && pasword.getText().equals("321")) {
//	  			
//              a.setAlertType(AlertType.CONFIRMATION);
//              a.show();
//	  			
//	  		}else {
//	  			
//	  			a.setAlertType(AlertType.ERROR);
//	  			a.show();
//	  		}
	  		
	    }
	    

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
			
		
	

}
