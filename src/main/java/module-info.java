module com.garcia.viewledpanel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.garcia.viewledpanel to javafx.fxml;
    exports com.garcia.viewledpanel;
}