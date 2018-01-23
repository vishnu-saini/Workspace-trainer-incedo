package com.bookapp.model.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImp implements BookDao {

	Connection con;

	public BookDaoImp(Connection con) {
		this.con = con;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		// Statement vs PreparedStatement vs CallableSt...
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Book");
			while (rs.next()) {
				books.add(new Book(rs.getInt("id"), rs.getString("isbn"), rs
						.getString("title"), rs.getString("author"), rs
						.getDouble("price")));

			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return books;
	}

	@Override
	public Book getBookById(int bookId) {

		return null;
	}

	@Override
	public Book addBook(Book book) {

		/*
		 * private int id; private String isbn; private String title; private
		 * String author; private double price;
		 */
		try {
			PreparedStatement stmt = con
					.prepareStatement(
							"insert into Book (author, isbn, price, title) values (?, ?, ?, ?)",
							Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, book.getAuthor());
			stmt.setString(2, book.getIsbn());
			stmt.setDouble(3, book.getPrice());
			stmt.setString(4, book.getTitle());
			int noOfrowsEffected = stmt.executeUpdate();
			if (noOfrowsEffected == 1) {
				ResultSet rs = stmt.getGeneratedKeys();
				rs.next();
				book.setId(rs.getInt(1));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		return null;
	}

	@Override
	public void removeBook(int bookId) {

	}
}