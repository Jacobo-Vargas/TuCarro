package view;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Cliente;
import model.Empleado;
import model.Vehiculo;

import java.io.IOException;
import java.util.List;

import static model.SistemaInstance.SISTEMAINSTANCE;

public class AdminController {
    @FXML
    public TextField documentoEmpleado;
    @FXML
    public TextField passEmpleado;
    @FXML
    public TextField nombreEmpleado;
    @FXML
    public JFXButton botonGuardar;
    @FXML
    public JFXButton botonLimpiar;
    @FXML
    public JFXButton botonBorrar;
    @FXML
    public JFXButton botonBuscar;
    @FXML
    public TableView<Empleado> tablaEmpleado;
    @FXML
    public TableColumn<Empleado,String> columNombre;
    @FXML
    public TableColumn<Empleado,String> columDocumento;
    @FXML
    public TableColumn<Empleado,String> columPass;
    @FXML
    public Button botonRestablecer;
    @FXML
    public JFXButton menuSalir;
    @FXML
    public Pane registroEmpleado;
    @FXML
    public Pane registroVentas;
    @FXML
    public JFXButton registraEmpleado;
    @FXML
    public TableView tablaRegistroVentas;
    @FXML
    public TableColumn<Vehiculo,String> columDocumentoVentas;
    @FXML
    public TableColumn<Vehiculo,String> columValorVentas;
    @FXML
    public TextField documentoBuscarTabla;
    @FXML
    public TextField precioBuscarTabla;
    ObservableList<Empleado> empleados;

    public void initialize(){

        llenarTabla(SISTEMAINSTANCE.getTuCarro().buscarEnTabla(null, null));
        columDocumentoVentas.setCellValueFactory(new PropertyValueFactory<>("vendedor"));
        columValorVentas.setCellValueFactory(new PropertyValueFactory<>("precio"));
        registroEmpleado.setVisible(true);
        registroVentas.setVisible(false);


        empleados= FXCollections.observableArrayList(SISTEMAINSTANCE.getSistema().getListaEmpleados());
        columNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        columPass.setCellValueFactory(new PropertyValueFactory<>("passEmpleado"));
        tablaEmpleado.setItems(empleados);

//        tablaRegistroVentas.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> llenarCampos(newValue));
//        columDocumentoVentas.setTextFormatter(new TextFormatter<>(TextFormatterUtil::integerFormat));
//        columValorVentas.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));

    }
    public void lanzarVentanaRegistro(){
        registroEmpleado.setVisible(false);
        registroVentas.setVisible(true);
    }
    public void lanzarVentanaRegsitroEmpleado(){
        registroEmpleado.setVisible(true);
        registroVentas.setVisible(false);
    }
    private void llenarTabla(List<Vehiculo> vehiculo){
        tablaRegistroVentas.setItems(FXCollections.observableArrayList(vehiculo));
        tablaRegistroVentas.refresh();

    }
    private void llenarCampos(Vehiculo vehiculo){
        documentoBuscarTabla.setText(vehiculo.getVendedor());
//        precioBuscarTabla.setText(vehiculo.getPrecio());

    }

    public void GuardarEmpleador() throws Exception {
        String nombre=nombreEmpleado.getText();
        String documento=documentoEmpleado.getText();
        String pass=passEmpleado.getText();
        try {
            var empleado = new Empleado(documento,nombre,pass);
            boolean registrado = SISTEMAINSTANCE.getSistema().registrarEmpleado(empleado);
            nombreEmpleado.clear();
            documentoEmpleado.clear();
            passEmpleado.clear();

            if (registrado) {
                empleados.add(empleado);
                tablaEmpleado.refresh();
                showInformationAlert("Emplado registrado", "El empleado se ha registrado correctamente.");
            } else {
                showWarningAlert("Registro fallido", "No se pudo registrar el empleado, verfique los datos ingresados.");
            }
        } catch (IllegalArgumentException e) {
            showErrorAlert("Datos inválidos", e.getMessage());
        } catch (Exception e) {
            showErrorAlert("Error", "Se produjo un error al registrar el empleado.");
        }

    }
    public void botonLimpiar(){
        nombreEmpleado.clear();
        documentoEmpleado.clear();
        passEmpleado.clear();
    }
    public void botonBuscar(){
        String documento=documentoEmpleado.getText();
        FilteredList<Empleado> filtrar = new FilteredList<>(tablaEmpleado.getItems());
        filtrar.setPredicate(Empleado->Empleado.getDocumento().equals(documento));
        SortedList<Empleado> sortedList = new SortedList<>(filtrar);
        tablaEmpleado.setItems(sortedList);
    }
    public void botonRestablecer(){
        tablaEmpleado.setItems(empleados);
        documentoEmpleado.clear();
    }
    public void borrarEmpleado() {
        String documento = documentoEmpleado.getText();
        SISTEMAINSTANCE.getSistema().borrarEmpleado(documento);
        documentoEmpleado.clear();
        ObservableList<Empleado> items = tablaEmpleado.getItems();
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getDocumento().equals(documento)) {
                items.remove(items.get(i));
            }
        }
    }
    public void lanzarLogin() throws IOException {
        var mainApp=new MainApp();
        Stage stage = new Stage();
        mainApp.start(stage);
    }
    public void botonVolver() throws IOException {
        lanzarLogin();
        Stage currentStage = (Stage) menuSalir.getScene().getWindow();
        currentStage.hide();
        System.out.println(SISTEMAINSTANCE.getSistema().listaEmpleados.size());
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

    public void refrescarDatosBoton(ActionEvent actionEvent) {
    }
}
