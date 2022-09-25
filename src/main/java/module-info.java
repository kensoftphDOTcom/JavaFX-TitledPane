module com.kensoftph.titledpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.titledpane to javafx.fxml;
    exports com.kensoftph.titledpane;
}