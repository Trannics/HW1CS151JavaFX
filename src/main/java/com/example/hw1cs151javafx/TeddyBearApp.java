package com.example.hw1cs151javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class TeddyBearApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TeddyBearApp.class.getResource("TeddyBearAppForm-view.fxml")); // Load up 'TeddyBearAppForm-view.fxml'
        Scene scene = new Scene(fxmlLoader.load(), 320, 240); // Initializes 'Scene' object with the 'fxmlLoader'
        // Run the 'stage'
        stage.setTitle("Make Teddy Bears!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}