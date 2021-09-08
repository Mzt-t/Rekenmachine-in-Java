package com.example.rekenmachine;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField input;
    public Label prom;
    public JFXButton zero;
    public JFXButton one;
    public JFXButton two;
    public JFXButton three;
    public JFXButton four;
    public JFXButton five;
    public JFXButton six;
    public JFXButton seven;
    public JFXButton eight;
    public JFXButton nine;
    public JFXButton divide;
    public JFXButton multiply;
    public JFXButton minus;
    public JFXButton plus;

    private double fnumber;
    private double snumber;
    private String operation;


    @FXML
    public void point_click(){
        input.setText(input.getText()+".");
    }
    public void zero_click(){
        input.setText(input.getText()+"0");
    }
    public void one_click(){
        input.setText(input.getText()+"1");
    }
    public void two_click(){
        input.setText(input.getText()+"2");
    }
    public void three_click(){
        input.setText(input.getText()+"3");
    }
    public void four_click(){
        input.setText(input.getText()+"4");
    }
    public void five_click(){
        input.setText(input.getText()+"5");
    }
    public void six_click(){
        input.setText(input.getText()+"6");
    }
    public void seven_click(){
        input.setText(input.getText()+"7");
    }
    public void eight_click(){
        input.setText(input.getText()+"8");
    }
    public void nine_click(){
        input.setText(input.getText()+"9");
    }
    public void plus_click(){
        String value = input.getText();
        double valuenumber = Double.parseDouble(input.getText());
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value+"+");
        operation = "+";
    }
    public void minus_click(){
        String value = input.getText();
        double valuenumber = Double.parseDouble(input.getText());
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value+"-");
        operation = "-";
    }
    public void multi_click(){
        String value = input.getText();
        double valuenumber = Double.parseDouble(input.getText());
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value+"x");
        operation = "x";
    }
    public void divide_click(){
        String value = input.getText();
        double valuenumber = Double.parseDouble(input.getText());
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value+"/");
        operation = "/";
    }
    public void clear_click(){
        input.setText("");
        prom.setText("");
        this.fnumber=0;
        this.snumber=0;
    }
    public void equal_click(){
        switch(operation){
            case "+":
                String value = input.getText();
                this.snumber = Double.parseDouble(value);
                double system = this.fnumber+this.snumber;
                input.setText(String.valueOf(system));
                String oldprom = prom.getText();
                prom.setText(oldprom+value);
                break;
            case "-":
                String valuemin = input.getText();
                this.snumber = Double.parseDouble(valuemin);
                double systemmin = this.fnumber-this.snumber;
                input.setText(String.valueOf(systemmin));
                String oldprommin = prom.getText();
                prom.setText(oldprommin+valuemin);
                break;
            case "x":
                String valuex = input.getText();

                this.snumber = Double.parseDouble(valuex);
                double systemx = this.fnumber*this.snumber;
                input.setText(String.valueOf(systemx));
                String oldpromx = prom.getText();
                prom.setText(oldpromx+valuex);
                break;
            case "/":
                String valued = input.getText();
                this.snumber = Double.parseDouble(valued);
                double systemd = this.fnumber/this.snumber;
                input.setText(String.valueOf(systemd));
                String oldpromd = prom.getText();
                prom.setText(oldpromd+valued);
                break;
        }
    }
}