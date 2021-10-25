module EjercicioFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
	opens controllers to javafx.graphics, javafx.fxml;	
}
