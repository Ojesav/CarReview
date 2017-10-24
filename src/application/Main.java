package application;
	
import Controllers.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	User user = new User();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader firstLoader = new FXMLLoader(getClass().getResource("/FXML/LoginMain.fxml"));
			firstLoader.setController(new Controllers.LoginController(user));
			Parent root = firstLoader.load();
			
			Scene scene = new Scene(root,664,424);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
