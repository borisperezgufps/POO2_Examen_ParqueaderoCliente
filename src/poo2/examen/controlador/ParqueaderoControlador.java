package poo2.examen.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import poo2.examen.modelo.Parqueadero;

public class ParqueaderoControlador {

	@FXML private TextField txtNombreParqueadero, txtIDParqueadero;
	@FXML private TextField txtPlacaIngreso, txtPlacaSalida;
	@FXML private CheckBox chkDescuento;
	@FXML private TextField txtHoraIngreso, txtPagar;
	@FXML private Label lblError;
	
	private Parqueadero parqueaderoObjeto;
	
	public ParqueaderoControlador() {
		parqueaderoObjeto = new Parqueadero();
	}
	
	@FXML public void registrar(ActionEvent e) {
		String nombreParqueadero = txtNombreParqueadero.getText();
		String idParqueadero = txtIDParqueadero.getText();
		String placa = txtPlacaIngreso.getText();
		boolean tieneDescuento = chkDescuento.isSelected();
		
		try {
			
			
		}catch(Exception ex) {
			lblError.setText(ex.getMessage());
		}
		
	}
	
	@FXML public void limpiar(ActionEvent e) {
		limpiar();
	}
	
	@FXML public void buscar(ActionEvent e) {
		String placa = txtPlacaIngreso.getText();
		try {
			
			
		}catch(Exception ex) {
			lblError.setText(ex.getMessage());
		}
	}

	@FXML public void pagar(ActionEvent e) {
		String placa = txtPlacaIngreso.getText();
		try {
			
			
		}catch(Exception ex) {
			lblError.setText(ex.getMessage());
		}
	}
	
	private void limpiar() {
		txtPlacaIngreso.clear();
		chkDescuento.setSelected(false);
		txtHoraIngreso.clear();
		txtPlacaSalida.clear();
		txtPagar.clear();
	}
}
