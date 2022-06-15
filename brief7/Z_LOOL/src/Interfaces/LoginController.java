package Interfaces;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {



	    @FXML
	    private Button btn;

	    @FXML
	    private TextField name;

	    @FXML
	    private PasswordField password;

	    @FXML
	   public void login_Action(ActionEvent event) throws IOException {
//	    		System.out.println("HAHAHAAH");
	    	Parent  root= FXMLLoader.load(getClass().getResource("Home.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//Stage stage = new Stage();
			//Stage stage = (Stage) root.getScene().getWindow();
			stage.setScene(scene);
			stage.show();
			
			
			
			 Alert a = new Alert(AlertType.NONE);
		    	  
		  		if(name.getText().equals("Anas") && password.getText().equals("123")) {
		  			
	              a.setAlertType(AlertType.CONFIRMATION);
	              a.show();
		  			
		  		}else {
		  			a.setAlertType(AlertType.ERROR);
		  			a.show();
		  		}
		  		
		  		
		  	

	    }
	    
	    //Alert
	      
	    
	

}
