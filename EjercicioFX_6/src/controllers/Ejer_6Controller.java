package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.TableView;

import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Persona;
import javafx.scene.control.TableColumn;

public class Ejer_6Controller implements Initializable{
	@FXML
	private GridPane lblFiltrar;
	@FXML
	private Button btnAgregar;
	@FXML
	private TableView <Persona> tablaDatos;
	@FXML
	private TableColumn<Persona, String> columNombre;
	@FXML
	private TableColumn<Persona, String> columApellido;
	@FXML
	private TableColumn<Persona, Integer> columEdad;
	@FXML
	private Button btnModificar;
	@FXML
	private Button btnEliminar;
	
	private ObservableList<Persona> personas;
	
	private Persona p;
	
	private int posicion;
	@FXML
	private TextField txtFiltro;

	
	// Event Listener on Button[#btnAgregar].onAction
	@FXML
	public void agregrar(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Ejer_6_IngresarDatos.fxml"));
			Parent root = loader.load();
			Ejer_6_IngresarDatosController controller = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
			stage.initOwner(myStage);
			stage.setScene(scene);
			stage.setTitle("Nuevo Usuario");
			stage.showAndWait();
			p = controller.getPersona();
			if (!personas.contains(p)) {
				personas.add(p);
			}
			else {
				Alert alert= new Alert(Alert.AlertType.ERROR);
				alert.initOwner(this.btnAgregar.getScene().getWindow());
				alert.setHeaderText(null);
				alert.setTitle("ERROR");
				alert.setContentText("Esa persona ya existe");
				alert.showAndWait();
			}
		} catch (IOException e) {
			e.printStackTrace();
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
	}
	// Event Listener on TableView[#tablaDatos].onMouseClicked
	@FXML
	public void extraerDatos(MouseEvent event) {
		if (tablaDatos.getSelectionModel().getSelectedItem() != null) {
			posicion = tablaDatos.getSelectionModel().getSelectedIndex();
			btnModificar.setDisable(false);
			btnEliminar.setDisable(false);
			p = tablaDatos.getSelectionModel().getSelectedItem();
		}
	}
	// Event Listener on Button[#btnModificar].onAction
	@FXML
	public void modificar(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Ejer_6_IngresarDatos.fxml"));
			Parent root = loader.load();
			Ejer_6_IngresarDatosController controller = loader.getController();
			controller.setPersona(p);
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			Stage myStage = (Stage) this.btnModificar.getScene().getWindow();
			stage.initOwner(myStage);
			stage.setScene(scene);
			stage.setTitle("Modificar Usuario");
			stage.showAndWait();
			p = controller.getPersona();
			if (!personas.contains(p)) {
				personas.set(posicion, p);
			}
			
			btnModificar.setDisable(true);
			btnEliminar.setDisable(true);
			
		} catch (IOException e) {
			e.printStackTrace();
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText(e.getMessage());
			alert.showAndWait();
		}
	}
	// Event Listener on Button[#btnEliminar].onAction
	@FXML
	public void eliminar(ActionEvent event) {
		personas.remove(posicion);
		btnModificar.setDisable(true);
		btnEliminar.setDisable(true);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		personas = FXCollections.observableArrayList();
		tablaDatos.setItems(personas);
		columNombre.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
		columApellido.setCellValueFactory(new PropertyValueFactory<Persona, String>("apellido"));
		columEdad.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("edad"));
		btnModificar.setDisable(true);
		btnEliminar.setDisable(true);
		
		
		// Esta parte a continuacion esta copiada de: https://code.makery.ch/blog/javafx-8-tableview-sorting-filtering/
		
		// 1. Wrap the ObservableList in a FilteredList (initially display all data).
		FilteredList<Persona> filteredData = new FilteredList<>(personas, p -> true);
		
		// 2. Set the filter Predicate whenever the filter changes.
		txtFiltro.textProperty().addListener((observable, oldValue, newValue) -> {
			filteredData.setPredicate(person -> {
				// If filter text is empty, display all persons.
				if (newValue == null || newValue.isEmpty()) {
					return true;
				}
				
				// Compare first name and last name of every person with filter text.
				String lowerCaseFilter = newValue.toLowerCase();
				
				if (person.getNombre().toLowerCase().contains(lowerCaseFilter)) {
					return true; // Filter matches first name.
				} else if (person.getApellido().toLowerCase().contains(lowerCaseFilter)) {
					return true; // Filter matches last name.
				}
				return false; // Does not match.
			});
		});
		
		// 3. Wrap the FilteredList in a SortedList. 
		SortedList<Persona> sortedData = new SortedList<>(filteredData);
		
		// 4. Bind the SortedList comparator to the TableView comparator.
		sortedData.comparatorProperty().bind(tablaDatos.comparatorProperty());
		
		// 5. Add sorted (and filtered) data to the table.
		tablaDatos.setItems(sortedData);
		
	}
}
