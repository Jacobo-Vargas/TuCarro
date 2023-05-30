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
import javafx.stage.Stage;
import model.Cliente;
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
    public JFXButton btnVerVehiculos;
    @FXML
    public Pane paneVerVehiculos;
    @FXML
    public Pane paneRegistrarClientes;
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
    private JFXButton btnRegistrarCliente;

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
    private Button brnBorar;
    ObservableList<Cliente> clientes;
    @FXML
    public void initialize() {
        clientes = FXCollections.observableArrayList(SISTEMAINSTANCE.getSistema().getListaClientes());
        mediaPane.setVisible(true);
        colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tblClientes.setItems(clientes);
        brnBorar.setVisible(false);

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

    @FXML
    public void playVideo() {
        if (isReproduciendo) {
            mediaPlayer.pause();
            playVideo.setText("Play");
        } else {
            mediaPlayer.play();
            playVideo.setText("Pause");
        }

        isReproduciendo = !isReproduciendo;
    }
    @FXML
    public void verVehiculos(ActionEvent e) {
        paneRegistrarClientes.setVisible(false);
        paneVerVehiculos.setVisible(true);
        mediaPane.setVisible(false);
    }
    @FXML
    public void actionVehiculos(ActionEvent actionEvent) {
        paneRegistrarClientes.setVisible(false);
        paneVerVehiculos.setVisible(true);
        mediaPane.setVisible(false);
    }
    @FXML
    public void actionRegistrarClientes(ActionEvent actionEvent) {
        paneRegistrarClientes.setVisible(true);
        brnBorar.setVisible(true);

    }
    @FXML
    private void launchVentanaLogin() throws IOException {
        MainApp mainApp = new MainApp();
        Stage stage = new Stage();
        mainApp.start(stage);
    }
    @FXML
    public void borarCliente(){

        String documento = txtDocumentoCliente.getText();
        try {
            System.out.println("cantidad de datos en le arraylist al iniciar ");
            System.out.println(SISTEMAINSTANCE.getSistema().getListaClientes().size());
            SISTEMAINSTANCE.getSistema().borrarCliente(documento);
            txtNombreCliente.clear();
            txtDocumentoCliente.clear();
            ObservableList<Cliente> items=tblClientes.getItems();
            for(int i=items.size()-1;i>=0;i--){
                if(items.get(i).getDocumento().equals(documento)){
                    items.remove(items.get(i));
                }
            }
            tblClientes.refresh();
            System.out.println("cantidad de datos en le arraylist al finalizar");
            System.out.println(SISTEMAINSTANCE.getSistema().getListaClientes().size());

        } catch (IllegalArgumentException e) {
        showErrorAlert("Datos inválidos", e.getMessage());
    }
    }

    @FXML
    public void actionSalir(ActionEvent actionEvent) throws IOException {
        launchVentanaLogin();
        Stage currentStage = (Stage) menuSalir.getScene().getWindow();
        currentStage.hide();
    }
}
