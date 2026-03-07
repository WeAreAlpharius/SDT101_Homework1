package org.example.Part1_2.ClassLibrary;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ContactMessage extends BaseMessage<ContactInfo>{

    public ContactMessage(ContactInfo content, String date, String sender) {
        super(content, date, sender);
    }

    @Override
    public Pane render() {
        Pane a =  super.render();
        Label b = new Label("Contact: " + content.name +
                "\nNumber: " + content.number
        );

        b.setWrapText(true);
        b.setTextFill(Color.WHITE);

        a.getChildren().add(b);
        return a;
    }
}
