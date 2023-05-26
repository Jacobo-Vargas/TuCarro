package view;

import static model.tuCarroInstance.INSTANCE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

import java.awt.event.ActionListener;


public class AppController {
    @FXML
    private Rectangle paneRectangle;
    @FXML
    private Label lblUsuario, lblPassword, lblBienvenida;
    @FXML
    private TextField txtUsuario,txtPassword;
    @FXML
    private Button btnIngresar;


    public void actionPerformed(ActionEvent actionEvent) {
        INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(),txtPassword.getText());
    }
}
