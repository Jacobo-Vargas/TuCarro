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
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import model.Cliente;
import model.TuCarro;

import javax.swing.*;
import java.io.IOException;
import java.util.Objects;

import static model.SistemaInstance.SISTEMAINSTANCE;

public class EmpleadoController {
    public JFXButton menuSalir;
    public JFXButton menuRegistrar;
    public AnchorPane anchorpane;
    @FXML
    private Pane mediaPane;
    @FXML
    private MediaView mediaView;
    @FXML
    private MediaPlayer mediaPlayer;
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
    private JFXButton playVideo;
    @FXML
    private TextField txtNombreCliente, txtDocumentoCliente;
    @FXML
    private TableView<Cliente> tblClientes;
    @FXML
    private TableColumn<Cliente, String> colDocumento;
    @FXML
    private TableColumn<Cliente, String> colNombre;
    private boolean isReproduciendo = false;
    ObservableList<Cliente> clientes;
    @FXML
    public void initialize() {
        clientes = FXCollections.observableArrayList(SISTEMAINSTANCE.getSistema().getListaClientes());
        colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tblClientes.setItems(clientes);

        String videoPath = Objects.requireNonNull(getClass().getResource("/videos/videoCarro.mp4")).toExternalForm();
        Media media = new Media(videoPath);
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-border-radius: 5px;");
        if (!mediaPane.getChildren().contains(mediaView)) {
            mediaPane.getChildren().add(mediaView);
        }

    }


    @FXML
    private void handleRegistrarClienteButtonClick() {
        String nombre = txtNombreCliente.getText();
        String documento = txtDocumentoCliente.getText();
        try {
            Cliente cliente = new Cliente(documento, nombre);
            boolean registrado = SISTEMAINSTANCE.getSistema().registrarCliente(cliente);
            txtNombreCliente.clear();
            txtDocumentoCliente.clear();

            if (registrado) {
                clientes.add(cliente);
                tblClientes.refresh();

                showInformationAlert("Cliente registrado", "El cliente se ha registrado correctamente.");
            } else {
                showWarningAlert("Registro fallido", "No se pudo registrar el cliente, verfique los datos ingresados.");
            }
        } catch (IllegalArgumentException e) {
            showErrorAlert("Datos inválidos", e.getMessage());
        } catch (Exception e) {
            showErrorAlert("Error", "Se produjo un error al registrar el cliente.");
        }
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
    @FXML
    private void showInformationAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public void playVideo() {
        if (isReproduciendo) {
            mediaPlayer.stop();
            playVideo.setText("Play");
        } else {
            mediaPlayer.play();
            playVideo.setText("Stop");
        }

        isReproduciendo = !isReproduciendo;
    }

}
