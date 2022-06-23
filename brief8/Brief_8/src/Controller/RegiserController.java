package Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

	HomeDao dao = new HomeDao();
	    @FXML
	    private Button button;

	    @FXML
	    private TextField name;

	    @FXML
	    private PasswordField pasword;

	    @FXML 
	    private TextField username;
	    
		Alert a = new Alert(AlertType.NONE);
	    @FXML
	    void btn_Action(ActionEvent event) throws IOException  {
			User user = new User(username.getText(),name.getText(),pasword.getText());
			dao.insertUser(user);
			
	    	Parent  root= FXMLLoader.load(getClass().getResource("/Views/Login.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
			 if (name.getText().isEmpty() && username.getText().isEmpty()  && pasword.getText().isEmpty()) {
	    		a.setAlertType(AlertType.ERROR);
	  			a.show();
	  			a.setTitle("ERROR");
	  			a.setHeaderText("please enter your informations");
	  			a.setContentText("you don't enter your informations");
	    	}
			 
			 else if (name.getText().isEmpty() || username.getText().isEmpty()  || pasword.getText().isEmpty()) {
		    		a.setAlertType(AlertType.ERROR);
		  			a.show();
		  			a.setTitle("ERROR");
		  			a.setHeaderText("please enter your informations");
		  			a.setContentText("you don't enter your informations");
		    	}
	    }
	    
	    @FXML
	    void forget_Action(ActionEvent event) throws IOException  {
	    	Parent  root= FXMLLoader.load(getClass().getResource("/Views/Login.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show(); 
	    }
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
			
		
	

}
