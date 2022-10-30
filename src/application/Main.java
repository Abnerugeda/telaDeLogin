package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	private static Scene telaPrincipal;
	private static Stage stage_0;
	@Override
	public void start(Stage stage) {
		try {
			stage_0  = stage;
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			Scene scene = new Scene(parent);
			Parent telaP = FXMLLoader.load(getClass().getResource("/gui/TelaPrincipal.fxml"));
			telaPrincipal = new Scene(telaP);
			stage.setScene(scene);
			//stage.setMaximized(true);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void changeScreen() {
		stage_0.setScene(telaPrincipal);
		stage_0.setMaximized(true);
	}
	public static void main(String[] args) {
		launch(args);
	}
}

