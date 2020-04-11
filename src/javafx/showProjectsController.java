package javafx;

import Data.Project;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class showProjectsController implements Initializable {



    @FXML
    public void frontpage(ActionEvent event) throws Exception {

        // Load fxml file and set scene
        Parent addDeveloperParent = FXMLLoader.load(getClass().getResource("resources/frontpage.fxml"));
        Scene addDeveloperScene = new Scene(addDeveloperParent);

        // Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(addDeveloperScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

}
