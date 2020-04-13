package javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class frontPageController implements Initializable {

    @FXML
    public void showDevelopersScene(ActionEvent event) throws Exception {

        // Load fxml file and set scene
        Parent showDeveloperParent = FXMLLoader.load(getClass().getResource("resources/showDevelopers.fxml"));
        Scene showDeveloperScene = new Scene(showDeveloperParent);

        // Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(showDeveloperScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}