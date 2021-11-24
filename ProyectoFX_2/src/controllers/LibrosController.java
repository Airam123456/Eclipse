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
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.LibrosDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;

import javafx.scene.control.MenuBar;

import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Libro;
import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class LibrosController implements Initializable{
	@FXML
	private TableView <Libro> tablaLibros;
	@FXML
	private TableColumn <Libro, String> columTitulo;
	@FXML
	private TableColumn <Libro, String> columAutor;
	@FXML
	private TableColumn <Libro, String> columEditorial;
	@FXML
	private TableColumn <Libro, String> columEstado;
	@FXML
	private MenuBar menu;
	@FXML
	private TextField txtBuscarLibro;
	@FXML
	private Button btnAltasLibros;
	@FXML
	private Button btnBajasLibros;
	@FXML
	private Button btnModificacionesLibros;
	@FXML
	private Button btnPrestarLibro;
	@FXML
	private ImageView imgLibros;
	
	private ObservableList<Libro> dataLibro;
	
	private Libro l;
	
	private LibrosDAO librosDAO;
	
	public void cargarDatos() {
		columTitulo.setCellValueFactory(new PropertyValueFactory<Libro, String>("Titulo"));
		columAutor.setCellValueFactory(new PropertyValueFactory<Libro, String>("Autor"));
		columEditorial.setCellValueFactory(new PropertyValueFactory<Libro, String>("Editorial"));
		columEstado.setCellValueFactory(new PropertyValueFactory<Libro, String>("Estado"));
		
		librosDAO = new LibrosDAO();
		ArrayList<Libro> listadoLibros = librosDAO.selectLibro();
		dataLibro.addAll(listadoLibros);
	}
	
	public void filtro() {
		// Esta parte a continuacion esta copiada de: https://code.makery.ch/blog/javafx-8-tableview-sorting-filtering/
		
				// 1. Wrap the ObservableList in a FilteredList (initially display all data).
				FilteredList<Libro> filteredData = new FilteredList<>(dataLibro, p -> true);
				
				// 2. Set the filter Predicate whenever the filter changes.
				txtBuscarLibro.textProperty().addListener((observable, oldValue, newValue) -> {
					filteredData.setPredicate(person -> {
						// If filter text is empty, display all persons.
						if (newValue == null || newValue.isEmpty()) {
							return true;
						}
						
						// Compare first name and last name of every person with filter text.
						String lowerCaseFilter = newValue.toLowerCase();
						
						if (person.getTitulo().toLowerCase().contains(lowerCaseFilter)) {
							return true; // Filter matches first name.
						} else if (person.getAutor().toLowerCase().contains(lowerCaseFilter)) {
							return true; // Filter matches last name.
						} else if (person.getEditorial().toLowerCase().contains(lowerCaseFilter)) {
							return true; // Filter matches last name.
						} else if (person.getEstado().toLowerCase().contains(lowerCaseFilter)) {
							return true; // Filter matches last name.
						}
						return false; // Does not match.
					});
				});
				
				// 3. Wrap the FilteredList in a SortedList. 
				SortedList<Libro> sortedData = new SortedList<>(filteredData);
				
				// 4. Bind the SortedList comparator to the TableView comparator.
				sortedData.comparatorProperty().bind(tablaLibros.comparatorProperty());
				
				// 5. Add sorted (and filtered) data to the table.
				tablaLibros.setItems(sortedData);
	}

	// Event Listener on Button[#btnAltasLibros].onAction
	@FXML
	public void altasLibros(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Libros_IngresarDatos.fxml"));
			Parent root = loader.load();
			Libros_IngresarDatos_Controller controller = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			Stage myStage = (Stage) this.btnAltasLibros.getScene().getWindow();
			stage.initOwner(myStage);
			stage.setScene(scene);
			stage.setTitle("Nuevo Libro");
			stage.showAndWait();
			l = controller.getLibro();
			if (!dataLibro.contains(l)) {
				dataLibro.add(l);
			}
			else {
				Alert alert= new Alert(Alert.AlertType.ERROR);
				alert.initOwner(this.btnAltasLibros.getScene().getWindow());
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
	
	// Event Listener on Button[#btnBajasLibros].onAction
	@FXML
	public void bajasLibros(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnModificacionesLibros].onAction
	@FXML
	public void modificacionesLibros(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btnPrestarLibro].onAction
	@FXML
	public void prestarLibro(ActionEvent event) {
		// TODO Autogenerated
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		dataLibro =	FXCollections.observableArrayList();
		tablaLibros.setItems(dataLibro);
		
		btnBajasLibros.setDisable(true);
		btnModificacionesLibros.setDisable(true);
		
		cargarDatos();
		filtro();
	}
}
