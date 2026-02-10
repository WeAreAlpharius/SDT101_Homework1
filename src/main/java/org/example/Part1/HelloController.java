package org.example.Part1;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class HelloController {
    @FXML
    private Label labelNext;
    @FXML
    private Label textEnter;
    @FXML
    private CheckBox buttonNext;
    @FXML
    private CheckBox checkButtonOk;
    @FXML
    private TextField textFieldEnter;
    @FXML
    private ToggleButton toggle;
    @FXML
    private RadioButton bold;
    @FXML
    private RadioButton italic;

    @FXML
    protected void onStartButton(){textFieldEnter.setText("Enter here");}
    @FXML
    protected void onEnterTextField(){textEnter.setText(textFieldEnter.getText());}
    @FXML
    protected void onCheckBoxNext(){
        if(buttonNext.isSelected()){
            labelNext.setText(textFieldEnter.getText());
        } else {
            labelNext.setText("");
        }
    }
    @FXML
    protected void onToggleButton(){
        checkButtonOk.setSelected(toggle.isSelected());
    }
    @FXML
    protected void onCopyButton(){
        toggle.setText(labelNext.getText());
    }
    @FXML
    protected void onRadioButtonBold(){
        labelNext.setFont(Font.font(labelNext.getFont().getFamily(), FontWeight.BOLD, labelNext.getFont().getSize()));
    }
    @FXML
    protected void onRadioButtonItalic(){
        labelNext.setFont(Font.font(labelNext.getFont().getFamily(), FontPosture.ITALIC, labelNext.getFont().getSize()));
    }
}
