package javafx;

import Data.Devs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class showDevelopersController implements Initializable {

    public ObservableList<Devs> data;

    @FXML
    private TableView<Devs> devTab;
    @FXML
    public TextField firstnameField, lastnameField;

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

    @FXML
    public void register(ActionEvent event) throws Exception {

        var emp1 = new Devs(firstnameField.getText(),lastnameField.getText());

        System.out.println(emp1.firstName() + " " + emp1.lastName() + " " + emp1.id() + " " + emp1.hashCode());

         data = FXCollections.observableArrayList(
                new Devs(emp1.firstName(), emp1.lastName())
        );


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn idCol = new TableColumn("id");

        devTab.getColumns().addAll(firstNameCol,lastNameCol,idCol);

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Devs, String>("firstName"));

        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Devs, String>("lastName"));

        idCol.setCellValueFactory(
                new PropertyValueFactory<Devs, String>("id"));

        devTab.setItems(data);
        devTab.getColumns().addAll(firstNameCol, lastNameCol, idCol);

    }

}
