package org.example.Part1;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller extends Pane {

    Rectangle rect;

    public Controller(String text) {

        Label label = new Label(text);
        label.setLayoutX(0);
        label.setLayoutY(50);

        rect = new Rectangle(100, 100, Color.GREY);
        rect.setLayoutX(0);
        rect.setLayoutY(0);

        super.getChildren().addAll(rect, label);
    }

    public void changeRed() {
        rect.setFill(Color.RED);
    }

    public void changeGrey() {
        rect.setFill(Color.GREY);
    }
}
