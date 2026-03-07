package org.example.Part1_2.ClassLibrary;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ImageMessage extends BaseMessage<Image>{

    public ImageMessage(Image content, String date, String sender) {
        super(content, date, sender);
    }

    @Override
    public Pane render() {
        Pane a =  super.render();
        ImageView b = new ImageView(content);
        b.setFitWidth(200);
        b.setPreserveRatio(true);

        a.getChildren().add(b);
        return a;
    }
}
