module com.pbo.tb {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;

    opens com.pbo.tb to javafx.fxml;
    exports com.pbo.tb;
}