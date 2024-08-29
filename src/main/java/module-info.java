module exerciciosjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires java.desktop;

    opens basico;
    opens layout;
    opens fxml;
}