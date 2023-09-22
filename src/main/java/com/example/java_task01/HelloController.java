package com.example.java_task01;

import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    private final Imt_class bmi = new Imt_class();
    public TextField massa;
    public TextField rost;
    public Label imt;


    public void onHelloButtonClick() {
        bmi.setMass_p(massa.getText());
        bmi.setRost_p(rost.getText());
        imt.setText(bmi.toString());
    }



}