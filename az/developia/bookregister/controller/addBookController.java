package az.developia.bookregister.controller;

import az.developia.bookregister.main.BookRegisterMainClass;
import az.developia.bookregister.model.Book;
import az.developia.bookregister.repository.BookRegisterRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addBookController {
	 static Stage addBookStage;
	@FXML
	private Button addBookButton;

	@FXML
	private TextField authorTF;

	@FXML
	private TextField nameTF;

	@FXML
	private TextField priceTF;

	@FXML
	private TextField typeTF;

	@FXML
	private Button backButton;
	
	@FXML
	void backButtonClicked(ActionEvent event) {
		changeToIndexPage();
	}
	
	void changeToIndexPage() {
		addBookStage.hide();
		BookRegisterMainClass.mainStage.show();
	}
	
	@FXML
	void addBookButtonClicked(ActionEvent event) {
        String name = nameTF.getText();
        String category = typeTF.getText();
        Integer price = Integer.parseInt(priceTF.getText());
        String author = authorTF.getText();
        
        Book book1 = new Book(name,category,price,author);
        BookRegisterRepository repo = new BookRegisterRepository();
        repo.addBook(book1);
	}
}
