package Controller;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class LoginController implements Initializable{
	HomeDao dao = new HomeDao();
		@FXML 
	    private Button button;
 
	    @FXML
	    private PasswordField paswordd;

	    @FXML 
	    private TextField usernamee; 
	      Alert a = new Alert(AlertType.NONE);

	    @FXML
	    void btn_Actionn(ActionEvent event) throws IOException {
	    	if(usernamee.getText().equals("Anas") && paswordd.getText().equals("123")) {
  				
		    	Parent  root= FXMLLoader.load(getClass().getResource("/Views/Home.fxml"));
		    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();	
			}    
	    	
	    	else if (usernamee.getText().isEmpty() && paswordd.getText().isEmpty()) {
	    		a.setAlertType(AlertType.ERROR);
	  			a.show();
	  			a.setTitle("ERROR");
	  			a.setHeaderText("please enter your informations");
	  			a.setContentText("you don't enter your informations");
	    	}  
	    	
	    	
	    	else if (usernamee.getText().isEmpty() || paswordd.getText().isEmpty()) {
	    		a.setAlertType(AlertType.WARNING);
	  			a.show();  
	    	}
	    	
	    
//	    else {  
//	        
//	        String nom = usernamee.getText();
//	        String pass = paswordd.getText();
//	       
//	        boolean flag = dao.verfication(nom, pass);
//	       
//
//	    try {
//
//	    if(flag) {
//	     
//	               
//	            try {
//	            	Parent  root= FXMLLoader.load(getClass().getResource("/Views/Home.fxml"));
//			    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//					Scene scene = new Scene(root);
//					stage.setScene(scene);
//					stage.show();	
//	            }
//	            catch(Exception e){
//	            e.printStackTrace();
//	            System.out.println("problem in link");
//	            }
//	   
//	    }
//
//	    }
//	    catch (Exception e) {
//	    e.printStackTrace();
//	    System.err.println("problem in lister...");
//	    }
//	    }
	    		    	
	    }
	    
	    @FXML
	    void create_Action (ActionEvent event) throws IOException {
	    	
	    	Parent  root= FXMLLoader.load(getClass().getResource("/Views/Register.fxml"));
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
