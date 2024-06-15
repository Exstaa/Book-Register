package az.developia.bookregister.controller;

import java.net.URL;
import java.util.ResourceBundle;

import az.developia.bookregister.main.BookRegisterMainClass;
import az.developia.bookregister.model.Book;
import az.developia.bookregister.repository.BookRegisterRepository;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class BookListController implements Initializable {
  static Stage bookListStage;
	
    @FXML
    private Button backButton;
	
    @FXML
    private TableColumn<Book, String> authorCol;

    @FXML
    private TableView<Book> booksTableView;

    @FXML
    private TableColumn<Book, String> categoryCol;

    @FXML
    private TableColumn<Book, Integer> idCol;

    @FXML
    private TableColumn<Book, String> nameCol;

    @FXML
    private TableColumn<Book, Integer> priceCol;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		BookRegisterRepository repository = new BookRegisterRepository();
       	booksTableView.setItems(repository.getBooks());
	    idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
	    nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
	    categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
	    priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
	    authorCol.setCellValueFactory(new PropertyValueFactory<>("author"));
	}
	
    @FXML
    void backButtonClicked(ActionEvent event) {
       bookListStage.hide();
       BookRegisterMainClass.mainStage.show();
    }

}
