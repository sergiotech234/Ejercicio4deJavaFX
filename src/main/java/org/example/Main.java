package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Creacion de varios botones
        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        Button button3 = new Button("Botón 3");
        //posiciones de los botones de forma vertical y horizontal
        HBox hBox = new HBox(button1,button2);
        VBox vBox = new VBox(hBox,button3);

        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setTitle("Aplicacion  de clic de boton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
