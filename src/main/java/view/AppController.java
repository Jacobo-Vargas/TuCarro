package view;

import static model.SistemaInstance.SISTEMAINSTANCE;
import static model.tuCarroInstance.INSTANCE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.SistemaInstance;

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
        if((INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(),txtPassword.getText()) == 1) || (INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(),txtPassword.getText()) == 2) ){
            launchVentanaEmpleado();
            Stage currentStage = (Stage) btnIngresar.getScene().getWindow();
            currentStage.hide();
        }if((INSTANCE.getLogin().verificarCredenciales(txtUsuario.getText(),txtPassword.getText()) == 3) ){
            lanzarVentanaAdministrador();
            Stage currentStage = (Stage) btnIngresar.getScene().getWindow();
            currentStage.hide();
        }else{
            System.out.println(SISTEMAINSTANCE.getSistema().listaEmpleados.size());
        }
}
}
