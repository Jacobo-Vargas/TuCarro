module TuCarro {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires com.jfoenix;
    requires de.jensd.fx.glyphs.fontawesome;
    requires javafx.media;

    exports view;
    opens view to javafx.fxml;
    opens model to javafx.controls;
    exports model;


}