package view;

import static model.tuCarroInstance.INSTANCE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

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

    @FXML
    private void launchVentanaEmpleado() throws IOException {
        VentanaEmpleado ventanaEmpleado = new VentanaEmpleado();
        Stage stage = new Stage();
        ventanaEmpleado.start(stage);
    }
    @FXML
    private void lanzarVentanaAdministrador() throws IOException {
        var ventanaAdmin=new VentanaAdmin();
        Stage stage = new Stage();
        ventanaAdmin.start(stage);
    }




    @FXML
    public void actionBtnIngresar(ActionEvent actionEvent) throws IOException {
        if ((INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(), txtPassword.getText()) == 1)) {
            launchVentanaEmpleado();
            Stage currentStage = (Stage) btnIngresar.getScene().getWindow();
            currentStage.hide();
        }if((INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(), txtPassword.getText()) == 3)){
            lanzarVentanaAdministrador();
            Stage currentStage = (Stage) btnIngresar.getScene().getWindow();
            currentStage.hide();
        }else if((INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(),txtPassword.getText()) == 2)){
            showConfirmatioAlert("Login","Bienvenido "+ INSTANCE.getLogin().getNombre());
            launchVentanaEmpleado();
            Stage currentStage = (Stage) btnIngresar.getScene().getWindow();
            currentStage.hide();
       } else{
            showWarningAlert("Login","Verifique los datos ingresados");
        }
    }

    

    @FXML
    private void showWarningAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @FXML
    private void showConfirmatioAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
