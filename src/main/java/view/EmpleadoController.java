package view;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.AireAcondicionado;
import model.Cliente;
import model.SelectVehicle;
import model.TuCarro;

import javax.swing.*;
import java.io.IOException;
import java.util.Objects;

import static model.SistemaInstance.SISTEMAINSTANCE;

public class EmpleadoController {
    @FXML
    public JFXButton menuSalir;
    @FXML
    public JFXButton menuRegistrar;
    @FXML
    public JFXButton menuVehiculos;
    @FXML
    public AnchorPane anchorpane;
    @FXML
    public Pane paneVerVehiculos;
    @FXML
    public Pane paneRegistrarClientes;
    @FXML
    public FontAwesomeIconView imagePlay;
    @FXML
    public FontAwesomeIconView imagePause;
    @FXML
    public Rectangle rectangleFondo;
    @FXML
    public JFXButton btnLimpiar;
    @FXML
    public JFXButton btnGuardar;
    @FXML
    public TextField tfCapacidadCarga;
    @FXML
    public TextField tfNumPuertas;
    @FXML
    public TextField tfNumPasajeros;
    @FXML
    public TextField tfMarca;
    @FXML
    public TextField tfSalEmergencia;
    @FXML
    public TextField tfNumEjes;
    @FXML
    public TextField tfVelCrucero;
    @FXML
    public TextField tfBolsasAire;
    @FXML
    public TextField tfCapacidadMaletero;
    @FXML
    public TextField tfPrecio;
    @FXML
    public TextField tfCilindraje;
    @FXML
    public TextField tfVelMaxima;
    @FXML
    public TextField tfPlaca;
    @FXML
    public TextField tfCambios;
    @FXML
    public TextField tfModelo;
    @FXML
    public ComboBox<SelectVehicle> boxSelVehicle;
    @FXML
    private Pane mediaPane;
    @FXML
    private MediaView mediaView;
    @FXML
    private MediaPlayer mediaPlayer;
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
    @FXML
    private boolean isReproduciendo = false;
    @FXML
    ObservableList<Cliente> clientes;
    @FXML
    ObservableList<SelectVehicle> listaVehiculoSelect;
    @FXML
    ObservableList<AireAcondicionado> listAireAcondicionado;

    @FXML
    public void initialize() {

        mediaPane.setVisible(true);
        imagePause.setVisible(false);
        paneVerVehiculos.setVisible(false);
        paneRegistrarClientes.setVisible(false);

        clientes = FXCollections.observableArrayList(SISTEMAINSTANCE.getSistema().getListaClientes());
        tblClientes.setItems(clientes);

        colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));


        String videoPath = Objects.requireNonNull(getClass().getResource("/videos/videoCarro.mp4")).toExternalForm();
        Media media = new Media(videoPath);
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-border-radius: 5px;");


        if (!mediaPane.getChildren().contains(mediaView)) {
            mediaPane.getChildren().add(mediaView);
        }

        listaVehiculoSelect = FXCollections.observableArrayList(SelectVehicle.values());
        boxSelVehicle.setItems(listaVehiculoSelect);
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
    public void actionLimpiarDatos(ActionEvent e){
            txtNombreCliente.clear();
            txtDocumentoCliente.clear();
    }


    @FXML
    public void playVideo() {
        if (isReproduciendo) {
            mediaPlayer.pause();
            playVideo.setText(" ");
            imagePlay.setVisible(true);
            imagePause.setVisible(false);
        } else {
            mediaPlayer.play();
            playVideo.setText(" ");
            imagePause.setVisible(true);
            imagePlay.setVisible(false);
        }
        isReproduciendo = !isReproduciendo;
    }


    @FXML
    private void launchVentanaLogin() throws IOException {
        MainApp mainApp = new MainApp();
        Stage stage = new Stage();
        mainApp.start(stage);
    }

    @FXML
    public void actionVehiculos(ActionEvent actionEvent) {
        paneRegistrarClientes.setVisible(false);
        paneVerVehiculos.setVisible(true);
        mediaPane.setVisible(false);
        mediaPlayer.stop();
    }

    @FXML
    public void registerVehicle(){
        if(boxSelVehicle.getValue().equals(SelectVehicle.BUSES)){

        }
    }

    @FXML
    public void actionRegistrarClientes(ActionEvent actionEvent) {
        paneVerVehiculos.setVisible(false);
        mediaPane.setVisible(false);
        paneRegistrarClientes.setVisible(true);
        mediaPlayer.stop();
    }


    @FXML
    public void actionSalir(ActionEvent actionEvent) throws IOException {
        launchVentanaLogin();
        Stage currentStage = (Stage) menuSalir.getScene().getWindow();
        currentStage.hide();
        mediaPlayer.stop();
    }


    @FXML
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
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
    private void showConfirmatioAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void showInformationAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
