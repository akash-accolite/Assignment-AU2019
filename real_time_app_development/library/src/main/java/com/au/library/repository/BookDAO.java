package com.au.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.Book;
import com.au.library.Cart;

@Repository
public class BookDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Book> All() {
		return jdbcTemplate.query("select * from book", (rs, i) -> {
			return new Book(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getInt("price"),
					rs.getString("description"));

		});
	}

	public String get(String id) {
		return jdbcTemplate.queryForObject("select title from book where id = " + id, String.class);
	}

	public Book create(Book book) {
		jdbcTemplate.update("insert into book values (?, ?, ?, ?, ?);", book.getId(), book.getDescription(),
				book.getBookName(), book.getAuthorName(), book.getPrice());
		return book;
	}
	
	public Book Addtocart(Book book) {
		jdbcTemplate.update("insert into book1 values(?,?,?);", book.getId(),book.getBookName(),book.getAuthorName());
		return book;
	}
	
	public List<Cart> cartget(){

		return jdbcTemplate.query("select * from book1", (rs, i) -> {
			return new Cart(rs.getInt("id"), rs.getString("title"), rs.getString("author"));

		});

	}

}
