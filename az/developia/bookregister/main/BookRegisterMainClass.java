package az.developia.bookregister.main;

import java.io.IOException;

import az.developia.bookregister.database.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BookRegisterMainClass extends Application {
	public static Stage mainStage;

	public static void main(String[] args) {
		launch(args);
		Database.connect();
	}

	@Override
	public void start(Stage stage1) {
		try {
			mainStage = stage1;
			AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("az/developia/bookregister/view/book.fxml"));
			Scene scene = new Scene(pane);
			stage1.setScene(scene);
			stage1.setTitle("Book Register Application");
			stage1.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void hide() {
		mainStage.hide();
	}
}
