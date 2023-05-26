module TuCarro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports view;
    opens view to javafx.fxml;

}