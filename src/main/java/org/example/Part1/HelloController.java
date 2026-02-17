package org.example.Part1;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    TextField NameField, EmailField, PhoneField;
    @FXML
    TextArea CommentArea;
    @FXML
    Label DownloadError, SubmitText, EmailError, PhoneError;
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
}
