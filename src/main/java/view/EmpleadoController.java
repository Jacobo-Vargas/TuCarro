package view;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import model.Cliente;

import javax.swing.*;
import java.io.IOException;

import static model.SistemaInstance.SISTEMAINSTANCE;

public class EmpleadoController {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private HBox topHBox;
    @FXML
    private Label labelVehiculos;
    @FXML
    private JFXButton menuVehiculos;
    @FXML
    private JFXButton btnRegistrarCliente;
    @FXML
    private JFXButton btnSalir;
    @FXML
    private JFXButton btnGuardar;
    @FXML
    private JFXButton btnLimpiar;
    @FXML
    private TextField txtNombreCliente, txtDocumentoCliente;




    @FXML
    private void handleVehiculosButtonClick() {
        // Lógica para el botón Vehiculos
    }

    @FXML
    private void handleRegistrarClienteButtonClick() {
        // Lógica para el botón Registrar Cliente
    }
    @FXML
    private void handleSalirButtonClick() {
        // Lógica para el botón Salir
    }


    @FXML
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
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
    public void actionLimpiarDatos(ActionEvent e){
            txtNombreCliente.clear();
            txtDocumentoCliente.clear();

    }


    public void actionGuardarDatosCliente(ActionEvent actionEvent) throws Exception {

        if(SISTEMAINSTANCE.getSistema().registrarCliente(new Cliente(txtDocumentoCliente.getText(), txtNombreCliente.getText()))){
            showErrorAlert("Proceso de registro","Registro exitoso");
            txtDocumentoCliente.clear();
            txtNombreCliente.clear();
        }else{
            showWarningAlert("Proceso de registro","Verifique los datos ingresados");

        }

    }

}
