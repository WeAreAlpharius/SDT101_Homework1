package org.example.Part1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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

            a.setOnMouseClicked(_ -> label.setText("Selected controller: " + temp));

            hBox.getChildren().add(a);
        }

        VBox vBox = new VBox(label, hBox);


        Scene scene = new Scene(vBox, 1100, 500);
        stage.setTitle("Controllers");
        stage.setScene(scene);
        stage.show();
    }
}
