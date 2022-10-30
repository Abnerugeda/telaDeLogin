package gui;
import application.Main;
import gui.util.Alerts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class MainControler {
	@FXML
	private TextField usuario;
	@FXML
	private PasswordField senha; 
	@FXML
	private Label error;
	int result;
	@FXML
	protected void btControler(ActionEvent e) {
		if(usuario.getText().toString().equals("a") && senha.getText().toString().equals("a")) {
			Main.changeScreen();
			
		}
		else {
			Alerts.showAlert("Erro", "Usuário ou senha incorreta!", "Tente novamente.", AlertType.ERROR);	
		}
	}
	@FXML 
	private Button fecharTela;

	@FXML
	private void fecharTelaAction(){
	    Stage stage = (Stage) fecharTela.getScene().getWindow();
	    stage.close();
	    }
	}
