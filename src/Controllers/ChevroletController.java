package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ChevroletController implements Initializable {

	 @FXML
		private JFXButton back;

		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			
		}
		
		@FXML 
		public void backAction(ActionEvent e)
		{
			back.getScene().getWindow().hide();
		}
	
}
