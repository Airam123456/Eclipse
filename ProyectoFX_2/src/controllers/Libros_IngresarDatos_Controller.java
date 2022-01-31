package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Libro;

import java.net.URL;
import java.util.ResourceBundle;

import dao.LibroDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class Libros_IngresarDatos_Controller implements Initializable{
	@FXML
	private Button btnGuardarLibro;
	@FXML
	private Button btnCancelarLibro;
	@FXML
	private TextField txtTitulo;
	@FXML
	private TextField txtAutor;
	@FXML
	private TextField txtEditorial;
	@FXML
	private ComboBox <String> cmbEstado;
	
	private Libro l;
	
	private ObservableList<String> items;
	
	private LibroDAO librosDAO;
	

	// Event Listener on Button[#btnGuardarLibro].onAction
	@FXML
	public void guardarLibro(ActionEvent event) {
		
		String titulo = txtTitulo.getText();
		String autor = txtAutor.getText();
		String editorial = txtEditorial.getText();
		//int codigo = librosDAO.selectCodigo() + 1;
		int codigo = 1;
		String estado = cmbEstado.getSelectionModel().getSelectedItem();
		
		l = new Libro (1,titulo, autor, editorial, estado,0);
		
		try {
			librosDAO.insertLibro(l);
			
		}catch (Exception e) {
			Alert alert= new Alert(Alert.AlertType.ERROR);
			alert.initOwner(this.btnCancelarLibro.getScene().getWindow());
			alert.setHeaderText(null);
			alert.setTitle("ERROR");
			alert.setContentText("Error en la creacion del libro");
			alert.showAndWait();
		}
		
		Stage myStage =(Stage) this.btnCancelarLibro.getScene().getWindow();
		myStage.close();
	}
	
	
	public Libro getLibro()	{
		return l;
	}
	
	

	// Event Listener on Button[#btnCancelarLibro].onAction
	@FXML
	public void cancelarLibro(ActionEvent event) {
		Stage myStage =(Stage) this.btnCancelarLibro.getScene().getWindow();
		myStage.close();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		items = FXCollections.observableArrayList();
		items.addAll("Nuevo","Usado nuevo", "Usado seminuevo", "Usado estropeado", "Restaurado");
		cmbEstado.setItems(items);
	}
}
