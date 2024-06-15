package az.developia.bookregister.controller;

import java.io.IOException;

import az.developia.bookregister.main.BookRegisterMainClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BookRegisterController {
	@FXML
	private Button addBooksButton;

	@FXML
	private Button adminButton;

	@FXML
	private Button booksButton;

	@FXML
	void addBooksButtonClicked(ActionEvent event) {
		Stage addBookStage = new Stage();
		try {
			AnchorPane addBookPane = FXMLLoader
					.load(getClass().getClassLoader().getResource("az/developia/bookregister/view/add-book.fxml"));
			Scene addBookScene = new Scene(addBookPane);
			addBookStage.setScene(addBookScene);
			addBookStage.setTitle("Add Book Stage");
			BookRegisterMainClass.hide();
			addBookController.addBookStage = addBookStage;
			addBookStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void adminButtonClicked(ActionEvent event) {

	}

	@FXML
	void booksButtonClicked(ActionEvent event) {
       Stage booksStage = new Stage();
       
       try {
		AnchorPane booksPane = FXMLLoader.load(getClass().getClassLoader().getResource("az/developia/bookregister/view/book-list.fxml"));
	    Scene booksScene = new Scene(booksPane);
	    booksStage.setScene(booksScene);
	    booksStage.setTitle("Books page");
	    booksStage.show();
	    booksStage.setResizable(false);
	    BookListController.bookListStage = booksStage;
	    BookRegisterMainClass.mainStage.hide();
       } catch (IOException e) {
		e.printStackTrace();
	}
	}
}
