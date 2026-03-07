package org.example.Part1_2.ClassLibrary;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.nio.file.Path;

public class FileMessage extends BaseMessage<Path> {


    public FileMessage(Path content, String date, String sender) {
        super(content, date, sender);
    }

    @Override
    public Pane render() {
        Pane a =  super.render();

        Label b = new Label("File: " + content.toString());

        b.setWrapText(true);
        b.setTextFill(Color.WHITE);

        a.getChildren().add(b);
        return a;
    }

}
