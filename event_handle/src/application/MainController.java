package application;


import java.io.IOException;
import java.util.Random;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class MainController {

    @FXML
    private Label myMessage;
    private Parent root;
    private Scene scene;
    private Stage stage;
    //private Random rand;

    @FXML
    void generaterandom (ActionEvent event) throws IOException{
    	root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Random rand=new Random();
        int myrand=rand.nextInt(50)+1;
        myMessage.setText(Integer.toString(myrand));
        System.out.println(Integer.toString(myrand));
        scene = new Scene(root);
		stage.setScene(scene);
		stage.show();


    }
}