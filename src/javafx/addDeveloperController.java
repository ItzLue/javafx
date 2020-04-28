package javafx;

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
import domain.*;
import System.App;
public class addDeveloperController implements Initializable {

    App app;
    @FXML
    public TextField firstnameField,lastnameField;

   @FXML
   private TableView<Developer> devTab;


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
    public void registerDeveloper() throws Exception{

        app.registerDeveloper(new Developer(firstnameField.getText(),lastnameField.getText()));


        System.out.println(firstnameField.getText() + " " + lastnameField.getText());

        String ID = firstnameField.getText().toUpperCase().substring(0,2) + lastnameField.getText().toUpperCase().substring(0,2) + "01";
        devTab.getItems().add(app.getDeveloperHM().get(ID));
    }

    @FXML
    public void firstNameDeveloper() throws Exception{

        firstnameField.getText();
        System.out.println(firstnameField.getText());
    }

    @FXML
    public void lastNameDeveloper() throws Exception{
        lastnameField.getText();
        System.out.println(lastnameField.getText());
    }

    @FXML
    public void initialize(URL url, ResourceBundle rb){

    }

}