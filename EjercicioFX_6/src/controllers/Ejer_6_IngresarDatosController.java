package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Persona;
import javafx.event.ActionEvent;

public class Ejer_6_IngresarDatosController {
	@FXML
	private Button btnGuardar;
	@FXML
	private Button btnCancelar;
	@FXML
	private TextField txtNombre;
	@FXML
	private TextField txtApellidos;
	@FXML
	private TextField txtEdad;

	private Persona p;

	// Event Listener on Button[#btnGuardar].onAction
	@FXML
	public void guardar(ActionEvent event) {
		String nombre = txtNombre.getText();
		String apellidos = txtApellidos.getText();
		
		try {
			int edad = Integer.parseInt (txtEdad.getText());
			p = new Persona(nombre, apellidos, edad);
			//Comprobar el rago de la edad
			if(p.getEdad() > 120 || p.getEdad() < 0) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.initOwner(this.btnGuardar.getScene().getWindow());
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("Edad fuera de rango");
				alert.showAndWait();
			}			
			
			// Asegurarse de que el nombre no esta vacio
			else if(p.getNombre().isEmpty()) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.initOwner(this.btnGuardar.getScene().getWindow());
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("El nombre no puede estar vacio");
				alert.showAndWait();
			}
			
			//Asegurarse de que el apellido no esta vacio
			else if(p.getApellido().isEmpty()) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.initOwner(this.btnGuardar.getScene().getWindow());
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("El apellido no puede estar vacio");
				alert.showAndWait();
			}
			else {
				p = new Persona (nombre, apellidos, edad);
				Stage myStage =(Stage) this.btnCancelar.getScene().getWindow();
				myStage.close();
			}	

		//Asegurarse de que la edad es un entero
		}catch (Exception e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.initOwner(this.btnGuardar.getScene().getWindow());
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("La edad tiene que ser un entero");
			alert.showAndWait();
		}
	}

	public Persona getPersona () {
		return p;
	}
	
	public void setPersona (Persona persona) {
		p = persona;
		txtNombre.setText(p.getNombre());
		txtApellidos.setText(p.getApellido());
		txtEdad.setText(p.getEdad() + "");
	}

	// Event Listener on Button[#btnCancelar].onAction
	@FXML
	public void cancelar(ActionEvent event) {
		Stage myStage =(Stage) this.btnCancelar.getScene().getWindow();
		myStage.close();
		
	}
}
