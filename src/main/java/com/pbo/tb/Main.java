package com.pbo.tb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;
    private static Parent parent;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        showLoginView();
    }
    public static void main(String[] args) {
        launch();
    }
    public static void showLoginView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("LoginView.fxml"));
        parent = loader.load();
        Scene scene = new Scene(parent,  800, 500);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void showMainView() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("MainView.fxml"));
        parent = loader.load();
        Scene scene = new Scene(parent,  800, 500);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}