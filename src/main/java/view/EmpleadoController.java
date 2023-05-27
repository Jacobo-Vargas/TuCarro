package view;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import com.jfoenix.controls.JFXButton;

public class EmpleadoController {

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
    private void initialize() {
        // Este método se ejecuta automáticamente al cargar el FXML
        // Puedes realizar inicializaciones aquí
    }

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
