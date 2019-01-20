//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class Main extends Application {
    public Main() {
    }

    //This is where I do the conversions

    public static double convertFarenheittoCelsius(double farenheitTemp) {
        double celsiusTemp = (farenheitTemp - 32) * (0.555555555);
        return celsiusTemp;
    }
    public static double convertFahrenheitToKelvin(double fahrenheitTemp){

        return convertCelsiustoKelvin(convertFarenheittoCelsius(fahrenheitTemp));
    }
    public static double convertCelsiusToFarenheit(double celsiusTemp) {
        double farenheitTemp = (int)celsiusTemp * (1.8) + 32;
        return (int)Math.round(farenheitTemp);
    }

    public static double convertCelsiustoKelvin(double celsiusTemp) {

        return celsiusTemp + 273.15;
    }

    public static double convertKelvintoCelsius(double kelvinTemp) {

        return kelvinTemp - 273.15;
    }

    public static double convertKelvintoFahrenheit(double kelvinTemp){
        return convertCelsiusToFarenheit(convertKelvintoCelsius(kelvinTemp));
    }


    //Main Method
    public static void main(String[] args) throws InterruptedException {
        launch(args);
    }
    //Some checks I made to make sure an input is an integer or a double (I didn't make them though thank you to thenewboston on youtube)
    public static boolean isDouble(TextField input, String errorMessage){
        try{
            double age = Double.parseDouble(input.getText());
            return true;
        }
        catch (NumberFormatException e){
            PopUp.display("ERROR ERROR ERROR","Error: " + errorMessage);
            return false;
        }
    }

    public static boolean isInt(TextField input, String errorMessage){
        try{
            int age = Integer.parseInt(input.getText());
            return true;
        }
        catch (NumberFormatException e){
            PopUp.display("ERROR ERROR ERROR","Error: " + errorMessage);
            return false;
        }
    }
    //Sets the main scene
    public void start(Stage primaryStage) {
        //Main Menu
        primaryStage.setTitle("Unit Converter");
        Label label1 = new Label("Welcome to the Unit converter!!");
        Button convertTemperature = new Button("Convert Temperature");
        Button exitButton = new Button("Exit");
        exitButton.setOnAction((e) -> {
            primaryStage.close();
        });
        HBox bottomMenu = new HBox();
        bottomMenu.getChildren().addAll(new Node[]{convertTemperature, exitButton});
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(label1);
        borderPane.setBottom(bottomMenu);
        Scene scene1 = new Scene(borderPane, 600.0D, 300.0D);
        HBox topMenu = new HBox();
        HBox tempBottomMenu = new HBox();

        //Convert Temperature Scene
        Label temperatureLabel = new Label("Which temperature would you like to convert?");
        Button celsiusButton = new Button("Celsius");
        Button fahrenheitButton = new Button("Fahrenheit");
        Button kelvinButton = new Button("Kelvin");
        Button backButton = new Button("Go Back");
        topMenu.getChildren().addAll(new Node[]{temperatureLabel});
        tempBottomMenu.getChildren().addAll(new Node[]{fahrenheitButton, celsiusButton, kelvinButton, backButton});
        backButton.setOnAction((e) -> {
            primaryStage.setScene(scene1);

        });
        fahrenheitButton.setOnAction((e) -> {
            PopUp.displayFahrenheit("Fahrenheit Menu", "Fahrenheit Menu");
        });
        celsiusButton.setOnAction(e ->{
            PopUp.displayCelsius("Celsius Menu", "Celsius Menu");
        });
        kelvinButton.setOnAction(e ->{
            PopUp.displayKelvin("Kelvin Menu","Kelvin Menu");
        });
        BorderPane tempBorder = new BorderPane();
        tempBorder.setTop(topMenu);
        tempBorder.setBottom(tempBottomMenu);
        Scene tempScene = new Scene(tempBorder, 600.0D, 300.0D);
        convertTemperature.setOnAction((e) -> {
            primaryStage.setScene(tempScene);
        });

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
