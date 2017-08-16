package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class SettingsController implements Initializable {
	
	
	@FXML
	public void priorityRadio(ActionEvent event) {
		MainController.timeList().set(0, "Priority");
	}

	@FXML
	public void duedateRadio(ActionEvent event) {
		MainController.timeList().set(0, "Due Date");
	}
 	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	
}
