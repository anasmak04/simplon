package application;
	
import Controller.HomeDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import models.Tache;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Views/Register.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			String css = this.getClass().getResource("application.css").toExternalForm();
			primaryStage.setTitle("TODO LIST");
			primaryStage.setScene(scene); 
			primaryStage.show();   
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	 
	
	public static void main(String[] args) {
		launch(args);
//		HomeDao dao = new HomeDao();
//		Tache task = new Tache("task1");
//		System.out.println(dao.delete(task)); 

	}
}
