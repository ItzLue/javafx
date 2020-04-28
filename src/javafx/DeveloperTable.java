package javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import System.App;
import domain.*;

public class DeveloperTable implements Initializable {
    App app = new App();
    // Table
    @FXML
    private TableView<Developer> devTab;
    @FXML
    private TableColumn<Developer, String> firstNameCol;
    @FXML
    private TableColumn<Developer, String> lastNameCol;
    @FXML
    private TableColumn<Developer, String> idCol;

    //TextFields for new Developer
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;

    // Search bar
    @FXML
    private TextField searchBar;


    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        // Load fxml file and set scene
        Parent showDeveloperParent = FXMLLoader.load(getClass().getResource("resources/frontPage.fxml"));
        Scene showDeveloperScene = new Scene(showDeveloperParent);

        // Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(showDeveloperScene);
        window.show();
    }

    public void changeFirstNameCellEvent(TableColumn.CellEditEvent cellEditEvent) {
//        Developer developerSelected = devTab.getSelectionModel().getSelectedItem();
//        developerSelected.setFirstName(cellEditEvent.getNewValue().toString());
    }

    public void changeLastNameCellEvent(TableColumn.CellEditEvent cellEditEvent) {
//        Developer developerSelected = devTab.getSelectionModel().getSelectedItem();
//        developerSelected.setLastName(cellEditEvent.getNewValue().toString());
    }

    public void newDeveloperButtonPushed(ActionEvent event) {
        app.registerDeveloper(new Developer("Ole", "Jensen"));
        app.getDevValues();
        devTab.setItems(app.developerList);
    }

    public void deleteButtonPushed(ActionEvent event) {

        devTab.refresh();
        devTab.setItems(app.developerList);
        System.out.println(app.developerList.size());
//        ObservableList<Developer> selectedRows, allDevelopers;
//        allDevelopers = devTab.getItems();
//
//        //this gives us the rows that were selected
//        selectedRows = devTab.getSelectionModel().getSelectedItems();
//
//        //loop over the selected rows and remove the Person objects from the table
//        for (Developer developer : selectedRows) {
//            allDevelopers.remove(developer);
//        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        devTab.setEditable(true);
//        devTab.setItems(app.developerList);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("ID"));



        // Update list


//        FilteredList<Developer> filteredList = new FilteredList<Developer>(getDevelopers(), b -> true);
//
//        searchBar.textProperty().addListener(((observableValue, oldValue, newValue) -> {
//            filteredList.setPredicate(developer -> {
//                // if empty
//                if (newValue == null || newValue.isEmpty()) {
//                    return true;
//                }
//                // Compare names
//                String lowerCaseFilter = newValue.toLowerCase();
//
//                if (developer.getFirstName().toLowerCase().contains(lowerCaseFilter)) {
//                    return true;
//                } else if (developer.getLastName().toLowerCase().contains(lowerCaseFilter)) {
//                    return true;
//                } else if (developer.getId().toLowerCase().contains(lowerCaseFilter)) {
//                    return true;
//                } else {
//                    return false;
//                }
//            });
//        }));
//
//        SortedList<Developer> sortedData = new SortedList<Developer>(filteredList);
//
//        sortedData.comparatorProperty().bind(devTab.comparatorProperty());
//
//        devTab.setItems(filteredList);
    }
}
