package view;

import static model.tuCarroInstance.INSTANCE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.event.ActionListener;
import java.io.IOException;


public class AppController {
    @FXML
    private Rectangle paneRectangle;
    @FXML
    private Label lblUsuario, lblPassword, lblBienvenida;
    @FXML
    private TextField txtUsuario,txtPassword;
    @FXML
    private Button btnIngresar;

    private void launchVentanaEmpleado() throws IOException {
        VentanaEmpleado ventanaEmpleado = new VentanaEmpleado();
        Stage stage = new Stage();
        ventanaEmpleado.start(stage);
    }

    public void actionPerformed(ActionEvent actionEvent) throws IOException {
        if((INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(),txtPassword.getText()) == 1) || (INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(),txtPassword.getText()) == 2) ){
            launchVentanaEmpleado();
        }
    }
}
