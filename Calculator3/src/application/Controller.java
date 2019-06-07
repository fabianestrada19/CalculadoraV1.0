package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {
	@FXML private Button igual;
	@FXML private Button uno;
	@FXML private Button dos;
	@FXML private Button tres;
	@FXML private Button cuatro;
	@FXML private Button cinco;
	@FXML private Button seis;
	@FXML private Button siete;
	@FXML private Button ocho;
	@FXML private Button nueve;
	@FXML private Button cero;
	@FXML private Button resta;
	@FXML private Button suma;
	@FXML private Button multi;
	@FXML private Button division;
	@FXML private Button punto;
	@FXML private Button limpiar;
	
	@FXML private TextField valores;
	
	float dato, dato2, result;
	int operacion;
	public void resultado(MouseEvent event) {
		if (event.getSource() == cero) {
			valores.setText(valores.getText()+ "0");
		}else if (event.getSource() == uno) {
			valores.setText(valores.getText()+ "1");
		}else if (event.getSource() == dos) {
			valores.setText(valores.getText()+ "2");
		}else if (event.getSource() == tres) {
			valores.setText(valores.getText()+ "3");
		}else if (event.getSource() == cuatro) {
			valores.setText(valores.getText()+ "4");
		}else if (event.getSource() == cinco) {
			valores.setText(valores.getText()+ "5");
		}else if (event.getSource() == seis) {
			valores.setText(valores.getText()+ "6");
		}else if (event.getSource() == siete) {
			valores.setText(valores.getText()+ "7");
		}else if (event.getSource() == ocho) {
			valores.setText(valores.getText()+ "8");
		}else if (event.getSource() == nueve) {
			valores.setText(valores.getText()+ "9");
		}else if (event.getSource() == suma) {
			dato = Float.parseFloat(valores.getText());
			valores.setText("");
			operacion = 1;
		}else if (event.getSource() == resta) {
			if (valores.getText().equals("")) {
				valores.setText("-");
			}else {
			dato = Float.parseFloat(valores.getText());
			valores.setText("");
			operacion = 2;
			}
		}else if (event.getSource() == multi) {
			dato = Float.parseFloat(valores.getText());
			valores.setText("");
			operacion = 3;
		}else if (event.getSource() == division) {
			dato = Float.parseFloat(valores.getText());
			valores.setText("");
			operacion = 4;
		}else if (event.getSource() == igual) {
			dato2 = Float.parseFloat(valores.getText());
			
			switch(operacion) {
				case 1:
					result = dato + dato2;
					valores.setText(String.valueOf(result));
					break;
				case 2:
					result = dato - dato2;
					valores.setText(String.valueOf(result));
					break;
				case 3:
					result = dato * dato2;
					valores.setText(String.valueOf(result));
					break;
				case 4:
					result = dato / dato2;
					valores.setText(String.valueOf(result));
					break;
			}
		}else if (event.getSource() == limpiar) {
			valores.setText("");
		}else if (event.getSource() == punto) {
			valores.setText(valores.getText() + ".");
		}
	} 
}
