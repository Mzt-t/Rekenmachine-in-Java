module com.example.rekenmachine {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires com.jfoenix;

    opens com.example.rekenmachine to javafx.fxml;
    exports com.example.rekenmachine;
}