module ca.mv.javafxdemo.rencontre_20 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ca.mv.javafxdemo.rencontre_20 to javafx.fxml;
    exports ca.mv.javafxdemo.rencontre_20;
}