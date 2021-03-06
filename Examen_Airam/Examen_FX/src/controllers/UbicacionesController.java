package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.UbicacionesDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import modelo.Ubicacion;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

public class UbicacionesController implements Initializable{
	@FXML
	private TableView <Ubicacion> tablaDatos;
	@FXML
	private TableColumn <Ubicacion, String> columSeccion;
	@FXML
	private TableColumn <Ubicacion, String> columProductos;
	@FXML
	private ImageView imgPasillo;
	
	private ObservableList<Ubicacion> ubicacionesList;
	
	private int posicion = -1;

	private void cargarDatos() {
		ArrayList<Ubicacion> ubicaciones = new UbicacionesDAO().selectUbicacion();
		for (Ubicacion ubicacion: ubicaciones) {
			ubicacionesList.add(ubicacion);
		}
	}
	
	// Event Listener on TableView[#tablaDatos].onMouseClicked
	@FXML
	public void abrirFoto(MouseEvent event) {
		
		posicion = tablaDatos.getSelectionModel().getFocusedIndex();
		
		Ubicacion ubi = tablaDatos.getSelectionModel().getSelectedItem();
		
		if (posicion != -1) {
			File file = new File ("images/" + ubi.getImagen());
			try {
				
				InputStream imagen = (InputStream) new FileInputStream(file);
				imgPasillo.setImage(new Image(imagen));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	// Event Listener on ImageView[#imgPasillo].onMouseClicked
	@FXML
	public void ampliar(MouseEvent event) {
		// TODO Autogenerated
	}
	

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cargarDatos();
		ubicacionesList = FXCollections.observableArrayList();
		tablaDatos.setItems(ubicacionesList);
		columSeccion.setCellValueFactory(new PropertyValueFactory<Ubicacion, String>("seccion"));
		columProductos.setCellValueFactory(new PropertyValueFactory<Ubicacion, String>("ubicacion"));
		
	}
}
