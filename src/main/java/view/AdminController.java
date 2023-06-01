package view;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Empleado;

import java.io.IOException;

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
    public Pane registroVentas;
    @FXML
    public Pane registroEmpleado;
    @FXML
    public JFXButton registraEmpleado;
    ObservableList<Empleado> empleados;

    public void initialize(){
        registroEmpleado.setVisible(true);
        registroVentas.setVisible(false);
        empleados= FXCollections.observableArrayList(SISTEMAINSTANCE.getSistema().getListaEmpleados());
        columNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        columPass.setCellValueFactory(new PropertyValueFactory<>("passEmpleado"));
        tablaEmpleado.setItems(empleados);
    }
    public void lanzarVentanaRegistro(){
        registroEmpleado.setVisible(false);
        registroVentas.setVisible(true);
    }


    public void GuardarEmpleador() throws Exception {
        String nombre=nombreEmpleado.getText();

        String documento=documentoEmpleado.getText();
        String pass=passEmpleado.getText();
        var empleado=new Empleado(documento,nombre,pass);
        SISTEMAINSTANCE.getSistema().registrarEmpleado(empleado);
        empleados.add(empleado);
        tablaEmpleado.refresh();
        nombreEmpleado.clear();
        documentoEmpleado.clear();
        passEmpleado.clear();
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
}
