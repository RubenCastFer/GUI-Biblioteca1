package gui.viewsandcontrollers.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Label label;

    public void initialize() {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        //label.setText("Hola Mundo!");
        // lineas nuevas
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        Stage dialog = new Stage();
        dialog.setScene(scene);
        // capturar la ventana lanzada por ese evento
        //dialog.initOwner(stageParent);
        //dialog.initModality(Modality.APPLICATION);
        dialog.showAndWait();
        //dialog.show();
    }
}

