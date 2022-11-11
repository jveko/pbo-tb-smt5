package com.pbo.tb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;
    private static Pane root;
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
        root = loader.load();
        Scene scene = new Scene(root,  800, 500);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void showMainView() throws IOException {
        FXMLLoader mainLoader = new FXMLLoader();
        mainLoader.setLocation(Main.class.getResource("MainView.fxml"));
        root = mainLoader.load();
        Scene scene = new Scene(root,  800, 500);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}