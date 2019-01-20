//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopUp {
    public PopUp() {
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public static void display(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300.0D);
        window.setMinHeight(300.0D);
        Label label1 = new Label();
        label1.setText(message);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Node[]{label1});
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox);
        window.setScene(scene);
        window.showAndWait();
    }

    public static void displayFahrenheit(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300.0D);
        window.setMinHeight(300.0D);
        Label titleLabel = new Label("Fahrenheit Menu");
        TextField tempInput = new TextField();
        Label middleLabel = new Label("Type the temperature here");
        Button toCelsius = new Button("Convert to Celsius");
        Button toKelvin = new Button("Convert to Kelvin");
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Node[]{titleLabel});
        VBox midBox = new VBox();
        midBox.getChildren().addAll(tempInput, middleLabel);
        HBox hbox = new HBox();
        hbox.getChildren().addAll(toCelsius, toKelvin);
        toCelsius.setOnAction(e ->{
            if (Main.isDouble(tempInput,"Please input a number") == true){
                double inputDouble = Main.convertFarenheittoCelsius(Integer.parseInt(tempInput.getText())*1.0);
                if (inputDouble == Math.floor(inputDouble)){
                    int rounded = (int)Math.floor(inputDouble);
                    displayAnswer("Celsius Answer", "Fahrenheit", "Celsius", tempInput.getText(), String.valueOf(rounded));
                }
                else {
                    BigDecimal bd = new BigDecimal(inputDouble);
                    bd = bd.round(new MathContext(3));
                    double rounded = bd.doubleValue();
                    displayAnswer("Celsius Answer", "Fahrenheit", "Celsius", tempInput.getText(), String.valueOf(rounded));
                }

            }
            else{}

        });
        toKelvin.setOnAction(e ->{

            if (Main.isDouble(tempInput,"Please input a number") == true){
                double inputDouble = Main.convertFahrenheitToKelvin(Integer.parseInt(tempInput.getText())*1.0);
                if (inputDouble == Math.floor(inputDouble)){
                    int rounded2 = (int)Math.floor(inputDouble);
                    displayAnswer("Kelvin Answer", "Fahrenheit", "Kelvin", tempInput.getText(), String.valueOf(rounded2));
                }
                else {
                    BigDecimal bd = new BigDecimal(inputDouble);
                    bd = bd.round(new MathContext(3));
                    double rounded2 = bd.doubleValue();
                    displayAnswer("Kelvin Answer", "Fahrenheit", "Kelvin", tempInput.getText(), String.valueOf(rounded2));
                }
            }
            else{}

        });
        BorderPane fahrenheitPane = new BorderPane();
        fahrenheitPane.setTop(vbox);
        fahrenheitPane.setBottom(hbox);
        fahrenheitPane.setCenter(midBox);
        Scene scene = new Scene(fahrenheitPane);
        window.setScene(scene);
        window.showAndWait();
    }

    public static void displayCelsius(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300.0D);
        window.setMinHeight(300.0D);
        Label titleLabel = new Label("Celsius Menu");
        TextField tempInput = new TextField();
        Label middleLabel = new Label("Type the temperature here");
        Button toFahrenheit = new Button("Convert to Fahrenheit");
        Button toKelvin = new Button("Convert to Kelvin");
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Node[]{titleLabel});
        VBox midBox = new VBox();
        midBox.getChildren().addAll(tempInput, middleLabel);
        HBox hbox = new HBox();
        hbox.getChildren().addAll(toFahrenheit, toKelvin);
        toFahrenheit.setOnAction(e ->{
            if (Main.isDouble(tempInput,"Please input a number") == true){
                double inputDouble = Main.convertCelsiusToFarenheit(Integer.parseInt(tempInput.getText())*1.0);
                if (inputDouble == Math.floor(inputDouble)){
                    int rounded = (int)Math.floor(inputDouble);
                    displayAnswer("Fahrenheit Answer", "Celsius", "Fahrenheit", tempInput.getText(), String.valueOf(rounded));
                }
                else {
                    BigDecimal bd = new BigDecimal(inputDouble);
                    bd = bd.round(new MathContext(3));
                    double rounded = bd.doubleValue();
                    displayAnswer("Fahrenheit Answer", "Celsius", "Fahrenheit", tempInput.getText(), String.valueOf(rounded));
                }

            }
            else{}

        });
        toKelvin.setOnAction(e ->{

            if (Main.isDouble(tempInput,"Please input a number") == true){
                double inputDouble = Main.convertCelsiustoKelvin(Integer.parseInt(tempInput.getText())*1.0);
                if (inputDouble == Math.floor(inputDouble)){
                    int rounded2 = (int)Math.floor(inputDouble);
                    displayAnswer("Kelvin Answer", "Celsius", "Kelvin", tempInput.getText(), String.valueOf(rounded2));
                }
                else {
                    BigDecimal bd = new BigDecimal(inputDouble);
                    bd = bd.round(new MathContext(3));
                    double rounded2 = bd.doubleValue();
                    displayAnswer("Kelvin Answer", "Celsius", "Kelvin", tempInput.getText(), String.valueOf(rounded2));
                }
            }
            else{}

        });
        BorderPane celsiusPane = new BorderPane();
        celsiusPane.setTop(vbox);
        celsiusPane.setBottom(hbox);
        celsiusPane.setCenter(midBox);
        Scene scene = new Scene(celsiusPane);
        window.setScene(scene);
        window.showAndWait();
    }

    public static void displayKelvin(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300.0D);
        window.setMinHeight(300.0D);
        Label titleLabel = new Label("Kelvin Menu");
        TextField tempInput = new TextField();
        Label middleLabel = new Label("Type the temperature here");
        Button toFahrenheit = new Button("Convert to Fahrenheit");
        Button toCelsius = new Button("Convert to Celsius");
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Node[]{titleLabel});
        VBox midBox = new VBox();
        midBox.getChildren().addAll(tempInput, middleLabel);
        HBox hbox = new HBox();
        hbox.getChildren().addAll(toFahrenheit, toCelsius);
        toFahrenheit.setOnAction(e ->{
            if (Main.isDouble(tempInput,"Please input a number") == true){
                double inputDouble = Main.convertKelvintoFahrenheit(Integer.parseInt(tempInput.getText())*1.0);
                if (inputDouble == Math.floor(inputDouble)){
                    int rounded = (int)Math.floor(inputDouble);
                    displayAnswer("Fahrenheit Answer", "Kelvin", "Fahrenheit", tempInput.getText(), String.valueOf(rounded));
                }
                else {
                    BigDecimal bd = new BigDecimal(inputDouble);
                    bd = bd.round(new MathContext(3));
                    double rounded = bd.doubleValue();
                    displayAnswer("Fahrenheit Answer", "Kelvin", "Fahrenheit", tempInput.getText(), String.valueOf(rounded));
                }

            }
            else{}

        });
        toCelsius.setOnAction(e ->{

            if (Main.isDouble(tempInput,"Please input a number") == true){
                double inputDouble = Main.convertKelvintoCelsius(Integer.parseInt(tempInput.getText())*1.0);
                if (inputDouble == Math.floor(inputDouble)){
                    int rounded2 = (int)Math.floor(inputDouble);
                    displayAnswer("Celsius Answer", "Kelvin", "Celsius", tempInput.getText(), String.valueOf(rounded2));
                }
                else {
                    BigDecimal bd = new BigDecimal(inputDouble);
                    bd = bd.round(new MathContext(3));
                    double rounded2 = bd.doubleValue();
                    displayAnswer("Celsius Answer", "Kelvin", "Celsius", tempInput.getText(), String.valueOf(rounded2));
                }
            }
            else{}

        });
        BorderPane kelvinPane = new BorderPane();
        kelvinPane.setTop(vbox);
        kelvinPane.setBottom(hbox);
        kelvinPane.setCenter(midBox);
        Scene scene = new Scene(kelvinPane);
        window.setScene(scene);
        window.showAndWait();
    }

    public static void displayAnswer(String title, String tempType, String otherTempType, String tempFirst, String tempSecond) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(300.0D);
        window.setMinHeight(300.0D);
        Label label1 = new Label();
        label1.setText(tempFirst + " degrees " + tempType + " is " + tempSecond + " degrees " + otherTempType);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new Node[]{label1});
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox);
        window.setScene(scene);
        window.showAndWait();
    }
}
