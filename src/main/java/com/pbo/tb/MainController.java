package com.pbo.tb;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;

public class MainController  {
    @FXML
    private MenuBar menuBar ;

    @FXML
    public void newHandler() {
    }

    @FXML
    public void openHandler() {
    }

    @FXML
    public void exitHandler() {
        menuBar.getScene().getWindow().hide();
    }
}
