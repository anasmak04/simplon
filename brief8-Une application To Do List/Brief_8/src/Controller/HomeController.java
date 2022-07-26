package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import models.Tache;
import models.User;

public class HomeController implements Initializable {
	HomeDao dao = new HomeDao();
	
	 @FXML
	 private TableView<Tache> Affiche;
	   
	@FXML
    private Button LOGOUT;

    @FXML
    private Button add;

    

    @FXML
    private TextField deadline;

    @FXML
    private Button delete;

    @FXML
    private TextField description;

    @FXML
    private Button select;

    @FXML
    private ChoiceBox<String> status_choiceboxe;

    @FXML
    private ChoiceBox<String> categorie_choicebox;  

    @FXML
    private TextField tache;

    @FXML
    private Button update;
    
    @FXML
    private TableColumn<Tache, String> tache_id;
    
    @FXML
    private TableColumn<Tache, String> status_id;
    
    @FXML
    private TableColumn<Tache, String> description_id;
    

    @FXML
    private TableColumn<Tache, String> deadline_id;
    
    @FXML
    private TableColumn<Tache, String> categorie_id;
    
    
    private String[] statu = {"Pas encore","En cours","Terminé"};
    
    private String[] Categ = {"pésentation","veille","recherche"};
 
    
  
    @FXML
    void add_Action(ActionEvent event) {
  		Tache tachee = new Tache(tache.getText(),description.getText(),status_choiceboxe.getValue(), deadline.getText(), categorie_choicebox.getValue());
  		dao.AddTache(tachee); 
    } 

    @FXML 
    void delete_Action(ActionEvent event) {
		Tache tache1 = new Tache(tache.getText());
		dao.delete(tache1);
		
    }
       
    @FXML
    void select_Action(ActionEvent event) {
    	affiche();
    	} 
       
    @FXML
    void update_Action(ActionEvent event) {
	Tache tache1 = new Tache(tache.getText(),description.getText(),status_choiceboxe.getValue(), deadline.getText(), categorie_choicebox.getValue());
	dao.UpdateTache(tache1);
    } 
    
    @FXML
    void  LOGOUT_Action(ActionEvent event) throws IOException {
    	Parent  root= FXMLLoader.load(getClass().getResource("/Views/Register.fxml"));
    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root); 
		stage.setScene(scene);
		stage.show();	
    } 
    
    private ObservableList<Tache> data = FXCollections.observableArrayList(
//			new Tache("projet","interface","En cours","2020-06-80","recherche"),
//			new Tache("projet1","interface","En cours","2020-06-80","recherche"),
//			new Tache("projet2","interface","En cours","2020-06-80","recherche")


); 
     
	public void affiche() {
		data.addAll(dao.select());
		tache_id.setCellValueFactory(new PropertyValueFactory<Tache, String>("tache"));
		description_id.setCellValueFactory(new PropertyValueFactory<Tache, String>("description"));
		status_id.setCellValueFactory(new PropertyValueFactory<Tache, String>("status"));
		deadline_id.setCellValueFactory(new PropertyValueFactory<Tache, String>("deadline"));
		categorie_id.setCellValueFactory(new PropertyValueFactory<Tache, String>("nom_caegorie"));
		Affiche.setItems(data);
		Affiche.refresh();
		}
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub 
		status_choiceboxe.getItems().addAll(statu);
		categorie_choicebox.getItems().addAll(Categ);
		affiche();
}
    
}