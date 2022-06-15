package application;
	
import Controller.DAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
 
 
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/Interfaces/Home.fxml")));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			String css = this.getClass().getResource("application.css").toExternalForm();
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args){
		launch(args);
//		DAO da = new DAO();
//	User user = new User(25,"AYOUB","OUDON","anasdec@gmail.com","temara rabat12","rabat","maroc");
//		System.out.println(da.insert(user));		
		
//		User update = new User(1,"bilal","makanda","anasdec@gmail.com","temara rabat12","rabat","maroc"); 
//	System.out.println(da.update(1, update));
	}
	
}
