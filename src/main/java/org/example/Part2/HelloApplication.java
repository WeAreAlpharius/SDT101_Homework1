package org.example.Part2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Circle circle = new Circle(20, -100, 200);
        circle.setStroke(Color.AQUAMARINE); //Stroke
        circle.setFill(Color.ROYALBLUE);
        circle.setStrokeWidth(10);          //StrokeWidth

        Rectangle rectangle = new Rectangle(40, 60);
        rectangle.setOpacity(0.3);      //Opacity

        Line line = new Line(0,0,40,60);

        HBox hbox = new HBox(rectangle, line);      //HBox
        hbox.setAlignment(Pos.CENTER_RIGHT);
        hbox.setStyle("-fx-border-color: red;");

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(0.0, 0.0,
                80.0, 40.0,
                40.0, 80.0
        );
        polygon.setStrokeLineJoin(StrokeLineJoin.ROUND);

        GridPane grid = new GridPane();                 //GridPane
        grid.add(new Label("0,0"), 0 ,0 );
        grid.add(new Label("1,0"), 1 ,0 );
        grid.add(new Label("0,1"), 0 ,1 );
        grid.add(new Label("1,1"), 1,1 );

        grid.setGridLinesVisible(true);
        grid.setAlignment(Pos.CENTER);


        VBox vBox = new VBox(polygon, hbox, grid);      //VBox
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20));             //Padding
        vBox.setStyle("-fx-border-color: red;");
        vBox.setAlignment(Pos.CENTER);            //Alignment

        //Background
        vBox.setBackground(new Background(new BackgroundFill(Color.AZURE, null, null)));
        vBox.relocate(200, 200);


        Pane pane = new Pane(circle, vBox);




        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
