module com.garcia.viewledpanel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.garcia.viewledpanel to javafx.fxml;
    exports com.garcia.viewledpanel;
}