package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class EditController implements Initializable {

	@FXML
	private TextField editView;
	
	@FXML
	public void getEdit(ActionEvent event) {
		int index = MainController.getEdit();
		String editItem = editView.getText();
		System.out.println(editItem);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
