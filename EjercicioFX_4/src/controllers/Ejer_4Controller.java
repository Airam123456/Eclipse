package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Persona;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

public class Ejer_4Controller implements Initializable{
	@FXML
	private Button btnAgregar;
	@FXML
	private TableView tablaDatos;
	@FXML
	private TableColumn<Persona, String> columNombre;
	@FXML
	private TableColumn<Persona, String> columApellido;
	@FXML
	private TableColumn<Persona, Integer> columEdad;
	
	private ObservableList<Persona> personas;
	
	private Persona p;

	// Event Listener on Button[#btnAgregar].onAction
	@FXML
	public void agregrar(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Ejer_4_IngresarDatos.fxml"));
			Parent root = loader.load();
			Ejer_4_IngresarDatosController controller = loader.getController();
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		personas = FXCollections.observableArrayList();
		tablaDatos.setItems(personas);
		columNombre.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
		columApellido.setCellValueFactory(new PropertyValueFactory<Persona, String>("apellido"));
		columEdad.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("edad"));
		
	}
}
