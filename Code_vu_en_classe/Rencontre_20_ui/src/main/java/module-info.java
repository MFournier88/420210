module ca.mv.javafxdemo.rencontre_20_ui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ca.mv.javafxdemo.rencontre_20_ui to javafx.fxml;
    exports ca.mv.javafxdemo.rencontre_20_ui;
}