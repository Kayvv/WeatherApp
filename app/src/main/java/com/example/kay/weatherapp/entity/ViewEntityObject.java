package com.example.kay.weatherapp.entity;

import android.widget.RadioButton;

/**
 * Created by Kay on 2017/1/11.
 */

public class ViewEntityObject {

    private RadioButton radioButton;
    private String radioName;
    public ViewEntityObject(RadioButton radioButton, String radioName) {
        this.radioButton = radioButton;
        this.radioName = radioName;
    }
    public RadioButton getRadioButton() {
        return radioButton;
    }
    public void setRadioButton(RadioButton radioButton) {
        this.radioButton = radioButton;
    }
    public String getRadioName() {
        return radioName;
    }
    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }
}
