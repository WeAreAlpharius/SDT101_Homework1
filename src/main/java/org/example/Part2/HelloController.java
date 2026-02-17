package org.example.Part2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    public RadioButton RadioIEELTS, RadioDuolingo, RadioNMT;
    @FXML
    TextField NameField, EmailField, PhoneField;
    @FXML
    TextArea CommentArea;
    @FXML
    Label DownloadError, SubmitText, EmailError, PhoneError, LoadSaveLabel;
    @FXML
    ToggleGroup english;
    @FXML
    ChoiceBox<String> ChoiceProgram;
    @FXML
    CheckBox TermsButton;
    @FXML
    public void initialize() {
        ChoiceProgram.getItems().addAll("BGM",
                                        "BMS",
                                        "BSEAI");
        RadioNMT.setUserData(1);
        RadioIEELTS.setUserData(2);
        RadioDuolingo.setUserData(3);
    }


    public void onDownloadEnglish() {
        DownloadError.setText("Error. Cannot download file");
        DownloadError.setTextFill(Color.RED);
    }

    public void OnSubmit() {
        if(TermsButton.isSelected()){

            NameField.setText("");
            EmailField.setText("");
            PhoneField.setText("");
            DownloadError.setText("");
            EmailError.setText("");
            PhoneError.setText("");
            CommentArea.setText("");

            english.getSelectedToggle().setSelected(false);
            ChoiceProgram.setValue("");

            SubmitText.setText("Your form is submitted");
            SubmitText.setTextFill(Color.GREEN);
        }
        else {
            SubmitText.setText("First agree with our terms");
            SubmitText.setTextFill(Color.RED);
        }
    }

    public void onEmail() {
        if(EmailField.getText().matches("[A-Za-z.0-9]{3,}@[A-Za-z]+\\.com")){
            EmailError.setText("");
        }
        else {
            EmailError.setText("Incorrect email");
            EmailError.setTextFill(Color.RED);
        }
    }

    public void onPhone() {
        if(PhoneField.getText().matches("\\+[0-9]{12}")){
            PhoneError.setText("");
        }
        else {
            PhoneError.setText("Incorrect number");
            PhoneError.setTextFill(Color.RED);
        }
    }

    public void onLoad() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("./data"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            try{
                List<String> list = Files.readAllLines(selectedFile.toPath());

                NameField.setText(list.get(0));
                EmailField.setText(list.get(1));
                PhoneField.setText(list.get(2));
                EmailError.setText(list.get(3));
                PhoneError.setText(list.get(4));
                CommentArea.setText(list.get(5));

                switch (Integer.parseInt(list.get(6))){
                    case 0: break;
                    case 1:
                        english.selectToggle(RadioNMT);
                        break;
                    case 2:
                        english.selectToggle(RadioIEELTS);
                        break;
                    case 3:
                        english.selectToggle(RadioDuolingo);
                        break;
                    default:
                        throw new IOException();
                }

                ChoiceProgram.setValue(list.get(7));

            } catch (IOException e){
                LoadSaveLabel.setText("Error reading file");
                LoadSaveLabel.setTextFill(Color.RED);
            }

            SubmitText.setText("");
        }
    }

    public void onSave() {

        List<String> save = new ArrayList<String> (List.of(
                NameField.getText(),
                EmailField.getText(),
                PhoneField.getText(),
                EmailError.getText(),
                PhoneError.getText(),
                CommentArea.getText(),
                english.getSelectedToggle() != null ? english.getSelectedToggle().getUserData().toString() : "0",
                ChoiceProgram.getValue())
        );

        Path path = Path.of("./data/" + NameField.getText().replaceAll(" ", "") + "Application.txt");

        try {
            Files.write(path, save);
        } catch (IOException e) {
            LoadSaveLabel.setText("Error writing file");
            LoadSaveLabel.setTextFill(Color.RED);
        }

    }
}
