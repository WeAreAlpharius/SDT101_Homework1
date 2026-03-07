package org.example.Part1_2.ClassLibrary;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContactPopUp {

    private ContactInfo result;

    public ContactInfo showPopUp(){
        Stage popup = new Stage();

        Label c1 = new Label("Contact: Bob\nNumber: +309209502");
        ContactInfo cI1 = new ContactInfo("Bob", "+393009209502");

        c1.setOnMouseClicked(e -> {
            if (e.getClickCount() >= 2) {
                popup.close();
                result = cI1;
            }
        });

        Label c2 = new Label("Contact: Jeff\nNumber: +398661733850");
        ContactInfo cI2 = new ContactInfo("Jeff", "+398661733850");

        c2.setOnMouseClicked(e -> {
            if (e.getClickCount() >= 2) {
                popup.close();
                result = cI2;
            }
        });

        VBox vbox = new VBox(c1, c2);

        popup.setScene(new Scene(vbox, 150, 150));
        popup.showAndWait();

        return result;
    }
}
