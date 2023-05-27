package view;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import com.jfoenix.controls.JFXButton;
import javafx.scene.layout.StackPane;

public class EmpleadoController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private HBox topHBox;

    @FXML
    private Label labelVehiculos;

    @FXML
    private JFXButton btnVehiculos;

    @FXML
    private JFXButton btnRegistrarCliente;

    @FXML
    private JFXButton btnSalir;

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
}
