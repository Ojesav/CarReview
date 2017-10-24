package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomeController implements Initializable {

    @FXML
    private AnchorPane homeAnchor;

    @FXML
    private JFXButton maruti;

    @FXML
    private JFXButton hyundai;

    @FXML
    private JFXButton chevrolet;

    @FXML
    private JFXButton tataMotors;

   
	  
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
 
		
	}
	
	@FXML
	public void marutiAction(ActionEvent e)
	{
	   try {
		loadFXML("/FXML/Maruti.fxml","Maruti");
		
	} catch (IOException e1) {
		
		e1.printStackTrace();
	}
	}
	
	 @FXML
	 public void chevroletAction(ActionEvent event) {

		 try {
			loadFXML("/FXML/Chevrolet.fxml","Chevrolet");
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		 
	  }

	 @FXML
	 public void hyundaiAction(ActionEvent event) {

		   try {
			loadFXML("/FXML/Hyundai.fxml","Hyundai");
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	  
	 }


	  @FXML
	  public void tataMotorsAction(ActionEvent event) {

		   try {
			loadFXML("/FXML/TataMotors.fxml","TataMotors");
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	   }
	

	public void loadFXML(String loc, String title) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource(loc));
		Stage stage = new Stage(StageStyle.UNDECORATED);
		stage.setScene(new Scene(root));
		stage.setTitle(title);
		stage.setX(491);
		stage.setY(129);
		stage.show();
		
	}
	
	
}
