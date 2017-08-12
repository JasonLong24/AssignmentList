package application;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainController implements Initializable{
	

	@FXML
	private ListView<String> assignmentList;
	@FXML
	private Button myButton;
	@FXML
	private AnchorPane rootPane;
	
	private static ObservableList<String> list = FXCollections.observableArrayList("Add items here");
	
	public static ObservableList<String> returnList() {
		return(list);
	}	
	
	@FXML
	public void handleButton(ActionEvent event) throws IOException {
	
		Parent modalParent = FXMLLoader.load(getClass().getResource("Modal.fxml"));
		Stage stage = new Stage();
		stage.setScene(new Scene(modalParent));
		stage.setResizable(false);
		stage.alwaysOnTopProperty();
		stage.show();
		System.out.println(stage.getOnHiding());
		
		/*System.out.println("BUTTON PRESSED");
		Parent modalParent = FXMLLoader.load(getClass().getResource("Modal.fxml"));
		Scene modalScene = new Scene(modalParent);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(modalScene);
		appStage.show();*/
	}
	
	@FXML
	public void removeList(ActionEvent event) {
	    int selectedItem = assignmentList.getSelectionModel().getSelectedIndex();
	    list.remove(selectedItem);
	}
	
	public void initialize(URL url, ResourceBundle rb) {
		assignmentList.setItems(list);
	} 
	
	
}
