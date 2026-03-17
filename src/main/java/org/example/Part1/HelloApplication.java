package org.example.Part1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        final Label label = new Label("No controls selected");
        HBox hBox = new HBox();
        hBox.setSpacing(30);

        for (int i = 0; i < 8; i++) {

            Controller a = new Controller("Controller" + i);
            int temp = i;

            //declaring interface
            EventHandler<MouseEvent> handler = (_) -> {
                label.setText("Selected controller: " + temp);
                a.requestFocus();
            };

            a.setOnMouseClicked(handler);

            a.focusedProperty().addListener((_, _, now) -> {
                if (now) {
                    a.changeRed();
                } else {
                    a.changeGrey();
                }
            });

            hBox.getChildren().add(a);
        }

        VBox vBox = new VBox(label, hBox);
        vBox.setSpacing(30);


        Scene scene = new Scene(vBox, 1100, 500);
        stage.setTitle("Controllers");
        stage.setScene(scene);
        stage.show();
    }
}
