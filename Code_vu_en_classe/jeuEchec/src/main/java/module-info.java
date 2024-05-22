module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens ca.mv.projet to javafx.fxml;
    exports ca.mv.projet;
    exports ca.mv.projet.models;
    opens ca.mv.projet.models to javafx.fxml;
}