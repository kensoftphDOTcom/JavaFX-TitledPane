package com.kensoftph.titledpane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class TitledPaneController implements Initializable {

    @FXML
    private TitledPane titledPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("person.png"));
        ImageView iv = new ImageView(image);
        titledPane.setGraphic(iv);
        titledPane.setAnimated(true);
    }
}