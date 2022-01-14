module Formulario1 {
	requires javafx.controls;
	requires jasperreports;
	opens application to javafx.graphics, javafx.fxml;
	
	

	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires java.sql;

	opens controllers to javafx.graphics, javafx.fxml;
	opens modelo to javafx.base;
	
}
