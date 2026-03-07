package org.example.Part1_2;

import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.example.Part1_2.ClassLibrary.*;

import java.awt.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class HelloController {

    public VBox root;
    public VBox MessageBox;
    public ChoiceBox<String> MessageChoice;
    public Button SubmitButton;
    public TextField textField;
    public ChoiceBox<String> ChoiceUser;
    public ScrollPane scrollPane;

    public void initialize() {

        scrollPane.setVvalue(1.0);
        MessageBox.heightProperty().addListener((obs, oldVal, newVal) -> {
            scrollPane.setVvalue(1.0);
        });

        MessageChoice.getItems().addAll("Contact",
                "File",
                "Image",
                "Location",
                "Text"
        );
        MessageChoice.setValue("Text");

        ChoiceUser.getItems().addAll("Bob", "Jeff");
        ChoiceUser.setValue("Bob");

        MessageBox.getChildren().add(new TextMessage("Hello world!", "02:39", "Bob").render());
        MessageBox.getChildren().add(new ImageMessage(new Image("file:data/blue.png"), "03:01", "Jeff").render());

    }

    public void onSubmit() {

        BaseMessage a;

        switch (MessageChoice.getValue()){
            case "Text":
                a = new TextMessage(textField.getText(),
                        new SimpleDateFormat("kk:mm").format(new Date()),
                        ChoiceUser.getValue()
                );
                break;
            case "Contact":
                ContactPopUp popUp = new ContactPopUp();
                ContactInfo info = popUp.showPopUp();

                a = new ContactMessage(info,
                        new SimpleDateFormat("kk:mm").format(new Date()),
                        ChoiceUser.getValue()
                );
                break;
            case "File": {
                File file = chooseFile();
                a = new FileMessage(file.toPath(),
                        new SimpleDateFormat("kk:mm").format(new Date()),
                        ChoiceUser.getValue()
                );
                break;
            }
            case "Image": {
                try {
                    File file = chooseFile();

                    Image image = new Image(file.toURI().toString());
                    a = new ImageMessage(image,
                            new SimpleDateFormat("kk:mm").format(new Date()),
                            ChoiceUser.getValue()
                    );
                } catch (Exception e) {
                    textField.setText("Invalid image");
                    return;
                }
                break;
            }
            case "Location":
                a = new LocationMessage(
                        new LocationCoordinates(
                            (new Random()).nextDouble() * 100,
                            (new Random()).nextDouble() * 100
                            ),
                        new SimpleDateFormat("kk:mm").format(new Date()),
                        ChoiceUser.getValue()
                );
                break;
            default:
                return;
        }

        MessageBox.getChildren().add(a.render());
    }


    public File chooseFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("./data"));
        return fileChooser.showOpenDialog(new Stage());
    }

}
