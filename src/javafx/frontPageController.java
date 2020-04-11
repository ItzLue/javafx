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
    private Button AddDeveloperBtn, ShowProjectsBtn, CreateProjectBtn, ShowDeveloperBtn,Back;


    @FXML
    public void addDeveloperScene(ActionEvent event) throws Exception {

        // Load fxml file and set scene
        Parent addDeveloperParent = FXMLLoader.load(getClass().getResource("resources/addDeveloper.fxml"));
        Scene addDeveloperScene = new Scene(addDeveloperParent);

        // Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(addDeveloperScene);
        window.show();
    }

    @FXML
    public void createProjectScene(ActionEvent event) throws Exception {

        // Load fxml file and set scene
        Parent addDeveloperParent = FXMLLoader.load(getClass().getResource("resources/createProject.fxml"));
        Scene addDeveloperScene = new Scene(addDeveloperParent);

        // Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(addDeveloperScene);
        window.show();
    }

    @FXML
    public void showDevelopersScene(ActionEvent event) throws Exception {

        // Load fxml file and set scene
        Parent addDeveloperParent = FXMLLoader.load(getClass().getResource("resources/showDevelopers.fxml"));
        Scene addDeveloperScene = new Scene(addDeveloperParent);

        // Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(addDeveloperScene);
        window.show();
    }

    @FXML
    public void showProjectScene(ActionEvent event) throws Exception {

        // Load fxml file and set scene
        Parent addDeveloperParent = FXMLLoader.load(getClass().getResource("resources/showProject.fxml"));
        Scene addDeveloperScene = new Scene(addDeveloperParent);

        // Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(addDeveloperScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}