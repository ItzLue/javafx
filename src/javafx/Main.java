package javafx;

import domain.Developer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import domain.*;
import System.App;
public class Main extends Application {
    App app = new App();
//        public static void main(String[] args) {
//            launch(args);
//        }
//
//        @Override
//        public void start(Stage primaryStage) {
//            primaryStage.setTitle("Hello World!");
//            Button btn = new Button();
//            btn.setText("Add dev");
//            btn.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent event) {
//                    app.registerDeveloper(new Developer("Hans","Hansen"));
//                    System.out.println(app.getDeveloperHM().get("HAHA01"));
//                }
//            });
//
//            StackPane root = new StackPane();
//            root.getChildren().add(btn);
//            primaryStage.setScene(new Scene(root, 300, 250));
//            primaryStage.show();
//        }
//}

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("resources/showDevelopers.fxml"));
        primaryStage.setTitle("SoftwareHuset A/S");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
