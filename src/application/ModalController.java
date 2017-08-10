package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ModalController implements Initializable{
	
	@FXML
	private TextField addItem;
	@FXML
	private Button btnBack;
	ObservableList<String> list = MainController.returnList();
	
	@FXML
	public void addItem(ActionEvent event) throws IOException{
		list.add(addItem.getText());
		System.out.println("Assignment Added");
		
		Parent mainControl = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene mainScene = new Scene(mainControl);
		Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();		
		mainStage.setScene(mainScene);
		mainStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
	}

}
