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
import model.*;

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
    private ComboBox<SelectVehicle> boxSelVehicle;
    @FXML
    private ComboBox<Disponibilidad> boxDisponibilidad;
    @FXML
    private ComboBox<CombustibleEnum> boxCombustible;
    @FXML
    private ComboBox<AireAcondicionado> boxAire;
    @FXML
    private ComboBox<CamaraReversa> boxCamReversa;
    @FXML
    private ComboBox<AsistenciaPermanencia> boxAsistencia;
    @FXML
    private ComboBox<TipoCamion> boxTipoCamion;
    @FXML
    private ComboBox<ABS> boxABS;
    @FXML
    private ComboBox<SensorColision> boxSenColision;
    @FXML
    private ComboBox<SensorTrafico> boxSenTrafico;
    @FXML
    private ComboBox<FrenoAire> boxFrenoAire;
    @FXML
    private ComboBox<CuatroPorCuatro> boxCuatroPorCuatro;
    @FXML
    private JFXButton btnLimpiar;
    @FXML
    private JFXButton btnGuardar;
    @FXML
    private TextField tfCapacidadCarga;
    @FXML
    private TextField tfNumPuertas;
    @FXML
    private TextField tfNumPasajeros;
    @FXML
    private TextField tfMarca;
    @FXML
    private TextField tfSalEmergencia;
    @FXML
    private TextField tfNumEjes;
    @FXML
    private TextField tfVelCrucero;
    @FXML
    private TextField tfBolsasAire;
    @FXML
    private TextField tfCapacidadMaletero;
    @FXML
    private TextField tfPrecio;
    @FXML
    private TextField tfCilindraje;
    @FXML
    private TextField tfVelMaxima;
    @FXML
    private TextField tfPlaca;
    @FXML
    private TextField tfCambios;
    @FXML
    private TextField tfModelo;
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
    ObservableList<Disponibilidad> listDisponibilidad;
    @FXML
    ObservableList<CombustibleEnum> listCombustible;
    @FXML
    ObservableList<AireAcondicionado>listAireAcondicionado;
    @FXML
    ObservableList<CamaraReversa>listCamReversa;
    @FXML
    ObservableList<AsistenciaPermanencia> listAsistencia;
    @FXML
    ObservableList<TipoCamion>  listTipoCamion;
    @FXML
    ObservableList<ABS> listABS;
    @FXML
    ObservableList<SensorColision> listSensorCol;
    @FXML
    ObservableList<SensorTrafico> listSensorTra;
    @FXML
    ObservableList<FrenoAire> listFrenoAire;
    @FXML
    ObservableList<CuatroPorCuatro> listCuatroPorCuatro;



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

        listABS = FXCollections.observableArrayList(ABS.values());
        boxABS.setItems(listABS);

        listDisponibilidad = FXCollections.observableArrayList(Disponibilidad.values());
        boxDisponibilidad.setItems(listDisponibilidad);

        listCombustible = FXCollections.observableArrayList(CombustibleEnum.values());
        boxCombustible.setItems(listCombustible);

        listAireAcondicionado = FXCollections.observableArrayList(AireAcondicionado.values());
        boxAire.setItems(listAireAcondicionado);

        listCamReversa = FXCollections.observableArrayList(CamaraReversa.values());
        boxCamReversa.setItems(listCamReversa);

        listAsistencia = FXCollections.observableArrayList(AsistenciaPermanencia.values());
        boxAsistencia.setItems(listAsistencia);

        listTipoCamion= FXCollections.observableArrayList(TipoCamion.values());
        boxTipoCamion.setItems(listTipoCamion);

        listSensorCol = FXCollections.observableArrayList(SensorColision.values());
        boxSenColision.setItems(listSensorCol);

        listSensorTra = FXCollections.observableArrayList(SensorTrafico.values());
        boxSenTrafico.setItems(listSensorTra);

        listFrenoAire = FXCollections.observableArrayList(FrenoAire.values());
        boxFrenoAire.setItems(listFrenoAire);

        listCuatroPorCuatro = FXCollections.observableArrayList(CuatroPorCuatro.values());
        boxCuatroPorCuatro.setItems(listCuatroPorCuatro);

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
