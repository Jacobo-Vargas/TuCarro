package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

import static model.tuCarroInstance.INSTANCE;

public class VentanaAdmin extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader ventana = new FXMLLoader(view.VentanaEmpleado.class.getResource("diseñoAdmin.fxml"));
        Scene scene = new Scene(ventana.load());
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle(INSTANCE.getLogin().getNombreUSer());
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/image-removebg-preview.png")));
        stage.getIcons().add(icon);
        stage.show();
    }
}
