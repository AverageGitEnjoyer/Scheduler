package sample;
import javafx.fxml.FXML;
//import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.util.ArrayList;

import java.awt.*;
import java.awt.event.ActionEvent;

import javafx.scene.control.TextField;

public class Controller {

    private ArrayList<String> namesList = new ArrayList<String>();

    @FXML
    private Text displayText;

    @FXML
    private TextField nameInput;

    @FXML
    void updateText() {
        String name = nameInput.getText();
        namesList.add(name);
        String out = "";
        for(int i = 0; i < namesList.size(); i++)
        {
            out+=namesList.get(i) + "\n";
        }
        displayText.setText(out);
    }


}