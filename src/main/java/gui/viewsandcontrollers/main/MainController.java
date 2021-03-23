package gui.viewsandcontrollers.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private Button button;
	@FXML
	private Label label;
	@FXML
	private Button exitBotton;

	// Event Listener on Button[#button].onAction
	@FXML
	public void handleButtonAction(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene= new Scene(root);
		Stage dialog = new Stage();
        dialog.setScene(scene);
        dialog.showAndWait();
		        /*label.setText("Hola Mundo!");
		        // lineas nuevas
		        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		        scene = new Scene(root);
		        dialog = new Stage();
		        dialog.setScene(scene);
		        // capturar la ventana lanzada por ese evento
		        //dialog.initOwner(stageParent);
		        //dialog.initModality(Modality.APPLICATION);
		        
		        dialog.showAndWait();
		        //dialog.show();*/
	    
	}
	// Event Listener on Button[#exitBotton].onAction
	@FXML
	public void exit(ActionEvent event) {

	    Stage stage = (Stage) exitBotton.getScene().getWindow();
	    stage.close();
	}
}
