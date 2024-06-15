package az.developia.bookregister.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import az.developia.bookregister.database.Database;
import az.developia.bookregister.model.Book;
import javafx.collections.*;

public class BookRegisterRepository {
	private Connection conn;

	public void addBook(Book b) {
		try {
			conn = Database.connect();
			String query = "INSERT INTO books(name,category,price,author) VALUES (?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, b.getName());
			st.setString(2, b.getCategory());
			st.setInt(3, b.getPrice());
			st.setString(4, b.getAuthor());
			st.execute();
			st.close();
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public ObservableList<Book> getBooks() {
		ObservableList<Book> books = FXCollections.observableArrayList();
		
		conn = Database.connect();

		try {
			PreparedStatement st = conn.prepareStatement("SELECT * FROM books");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setCategory(rs.getString("category"));
				book.setPrice(rs.getInt("price"));
				book.setAuthor(rs.getString("author"));
				books.add(book);
			}
			conn.close();
			st.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}
}
