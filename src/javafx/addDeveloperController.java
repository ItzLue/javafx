package javafx;

import javafx.collections.FXCollections;
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
import java.net.URL;
import java.util.ResourceBundle;

import Data.*;

public class addDeveloperController implements Initializable {

    @FXML
    public TextField firstnameField,lastnameField;


    @FXML
    public void frontpage(ActionEvent event) throws Exception {

        // Load fxml file and set scene
        Parent addDeveloperParent = FXMLLoader.load(getClass().getResource("resources/frontpage.fxml"));
        Scene addDeveloperScene = new Scene(addDeveloperParent);

        // Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(addDeveloperScene);
        window.show();
    }
    @FXML
    public void register(ActionEvent event) throws Exception{

        System.out.println(firstnameField.getText());
        System.out.println(lastnameField.getText());

            var emp1 = new Devs(firstnameField.getText(),lastnameField.getText());



        System.out.println(emp1.id());
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}