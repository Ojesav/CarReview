package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class MarutiController implements Initializable {

	 @FXML
	private JFXButton back;

     @FXML
    private AnchorPane MarutiAnchor;
	 
     AnchorPane CarInfo;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	@FXML 
	public void backAction(ActionEvent e)
	{
		back.getScene().getWindow().hide();
	}

	
	public void setNode(Node node)
	{
		//MarutiAnchor.getChildren().clear();
		MarutiAnchor.getChildren().add((Node) node);
		
		FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
		
		
	}

	
      public void createPage() {
		
		try {
			CarInfo = FXMLLoader.load(getClass().getResource("/FXML/CarInfo.fxml"));
			setNode(CarInfo);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
      
     @FXML
     public void altoAction(ActionEvent e)
     {
    	 System.out.println("Hii");
    	 setNode(CarInfo);
     }
      
	
}
