package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import static model.tuCarroInstance.INSTANCE;
import java.io.IOException;
import java.util.Objects;

public class VentanaEmpleado extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fmxloader = new FXMLLoader(view.VentanaEmpleado.class.getResource("EmpleadoController.fxml"));
        Scene scene = new Scene(fmxloader.load());
        stage.setResizable(false);
        stage.setTitle(INSTANCE.getLogin().getNombreUSer());
        stage.setScene(scene);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/image-removebg-preview.png")));
        stage.getIcons().add(icon);
        stage.show();

    }
}
