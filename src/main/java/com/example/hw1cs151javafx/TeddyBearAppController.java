package com.example.hw1cs151javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.util.Duration;

public class TeddyBearAppController{
    @FXML
    private TextField nameField;

    @FXML
    private void makeTeddyBearButtonClicked() {
        // Get the input Teddy Bear's name from the user and create a new Teddy Bear object to be displayed
        String teddyBearName = nameField.getText();
        makeTeddyBear(teddyBearName);
    }

    @FXML
    private void makeTeddyBear(String inputTeddyBearName) {
        // Create all the Teddy Bear's shapes
        Circle teddyBearBody = new Circle(200, 200, 80, Color.rgb(174, 209, 212));
        Circle teddyBearHead = new Circle(200, 100, 60, Color.rgb(174, 209, 212));
        Circle teddyBearLeftEye = new Circle(175, 80, 8, Color.rgb(126, 72, 28));
        Circle teddyBearRightEye = new Circle(225, 80, 8, Color.rgb(126, 72, 28));
        Circle teddyBearNose = new Circle(200, 93, 8, Color.rgb(126, 72, 28));
        Circle teddyBearLeftEar = new Circle(160, 50, 20, Color.rgb(174, 209, 212));
        Circle teddyBearRightEar = new Circle(240, 50, 20, Color.rgb(174, 209, 212));
        Circle teddyBearLeftArm = new Circle(120, 180, 20, Color.rgb(174, 209, 212));
        Circle teddyBearRightArm = new Circle(280, 180, 20, Color.rgb(174,207, 212));
        Circle teddyBearLeftLeg = new Circle(160, 270, 20, Color.rgb(174, 207, 212));
        Circle teddyBearRightLeg = new Circle(240, 270, 20, Color.rgb(174, 209, 212));
        Arc teddyBearMouth = new Arc(200, 120, 30, 10, 0, -180);
        teddyBearMouth.setType(ArcType.OPEN);
        teddyBearMouth.setStroke(Color.RED);
        teddyBearMouth.setFill(null);

        // Create Translation Transition for the Teddy Bear's mouth
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), teddyBearMouth);
        translateTransition.setByY(-20);
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransition.setAutoReverse(true);

        // Create Text object to show the Teddy Bear's name
        Text teddyBearName = new Text(190, 310, inputTeddyBearName);
        teddyBearName.setTextAlignment(TextAlignment.CENTER);

        // Create Fade Transition for the Teddy Bear's name
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), teddyBearName);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        fadeTransition.setCycleCount(FadeTransition.INDEFINITE);
        fadeTransition.setAutoReverse(true);

        // Create a new Pane object and add all Teddy Bear's objects to it
        Pane pane = new Pane();
        pane.getChildren().addAll(teddyBearBody, teddyBearHead, teddyBearLeftEye, teddyBearRightEye, teddyBearNose,
                teddyBearLeftEar, teddyBearRightEar, teddyBearLeftArm, teddyBearRightArm, teddyBearLeftLeg,
                teddyBearRightLeg, teddyBearMouth, teddyBearName);

        // Create a new Scene object and Stage object and set the Stage object to use the Scene object
        Scene scene = new Scene(pane, 400, 400);
        Stage stage = new Stage();
        stage.setTitle("Teddy Bear: " + inputTeddyBearName);
        stage.setScene(scene);
        stage.show();

        // Play both the Translation and Fade Transitions
        translateTransition.play();
        fadeTransition.play();
    }
}