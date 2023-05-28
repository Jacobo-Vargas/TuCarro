package view;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import model.Cliente;
import model.TuCarro;

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
    private TableView<Cliente> tblClientes;
    @FXML
    private TableColumn<Cliente, String> colDocumento;
    @FXML
    private TableColumn<Cliente, String> colNombre;

    ObservableList<Cliente> clientes;
    @FXML
    public void initialize() {
        clientes = FXCollections.observableArrayList(SISTEMAINSTANCE.getSistema().getListaClientes());

        colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tblClientes.setItems(clientes);
    }



    @FXML
    private void handleVehiculosButtonClick() {
        // Lógica para el botón Vehiculos
    }

    @FXML
    private void handleRegistrarClienteButtonClick() {
        String nombre = txtNombreCliente.getText();
        String documento = txtDocumentoCliente.getText();

        try {
            Cliente cliente = new Cliente(documento, nombre);
            boolean registrado = SISTEMAINSTANCE.getSistema().registrarCliente(cliente);

            if (registrado) {
                clientes.add(cliente);
                tblClientes.refresh();

                showInformationAlert("Cliente registrado", "El cliente se ha registrado correctamente.");
            } else {
                showWarningAlert("Registro fallido", "No se pudo registrar el cliente.");
            }
        } catch (IllegalArgumentException e) {
            showErrorAlert("Datos inválidos", e.getMessage());
        } catch (Exception e) {
            showErrorAlert("Error", "Se produjo un error al registrar el cliente.");
        }
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


//    public void actionGuardarDatosCliente(ActionEvent actionEvent) throws Exception {
//
//        if(SISTEMAINSTANCE.getSistema().registrarCliente(new Cliente(txtDocumentoCliente.getText(), txtNombreCliente.getText()))){
//            showErrorAlert("Proceso de registro","Registro exitoso");
//            txtDocumentoCliente.clear();
//            txtNombreCliente.clear();
//            System.out.println(clientes.size());
//            tblClientes.refresh();
//        }else{
//            showWarningAlert("Proceso de registro","Verifique los datos ingresados");
//
//        }
//
//    }
    private void showInformationAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
