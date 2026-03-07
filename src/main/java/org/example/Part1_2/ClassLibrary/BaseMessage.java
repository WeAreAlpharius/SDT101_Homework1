package org.example.Part1_2.ClassLibrary;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public abstract class BaseMessage<T> {

    T content;

    String date;
    String sender;

    BaseMessage(T content, String date, String sender){
        this.content = content;
        this.date = date;
        this.sender = sender;
    }

    public Pane render(){
        Label titleSender = new Label(sender);
        titleSender.setFont(new Font(14));

        titleSender.setFont(Font.font("System", FontWeight.BOLD, 13));
        titleSender.setTextFill(Color.WHITE);

        Label labelDate = new Label(date);
        labelDate.setFont(Font.font(10));
        labelDate.setTextFill(Color.GRAY);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        HBox header = new HBox(6, titleSender, spacer, labelDate);
        header.setAlignment(Pos.CENTER_LEFT);

        VBox a = new VBox(header);

        a.setSpacing(5);
        a.setPadding(new Insets(10));
        a.setMaxWidth(350);

        a.setBackground(new Background(
                new BackgroundFill(
                        Color.web("#2B2B2B"),
                        new CornerRadii(12),
                        Insets.EMPTY
                )
        ));

        a.setBorder(new Border(new BorderStroke(
                Color.web("#3A3A3A"),
                BorderStrokeStyle.SOLID,
                new CornerRadii(12),
                new BorderWidths(1)
        )));

        return a;
    }
}
