package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
@Override
public void start(Stage primaryStage) {
    try {
    	Parent root=FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
		Scene scene = new Scene(root,400,400);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
       
    } 

    catch(Exception e) {
        e.printStackTrace();
        System.exit(0);

    }
}

public static void main(String[] args) {
    launch(args);
}
}