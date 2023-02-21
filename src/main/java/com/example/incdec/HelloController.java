package com.example.incdec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label show;

    int value = 0;

    public void increase(ActionEvent event){
        value++;
        show.setText(String.valueOf(Integer.parseInt(Integer.toString(value))));
    }

    public void decrease(ActionEvent event){
        value--;
        show.setText(String.valueOf(Integer.parseInt(Integer.toString(value))));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        show.setText(String.valueOf(Integer.parseInt(Integer.toString(value))));
    }
}