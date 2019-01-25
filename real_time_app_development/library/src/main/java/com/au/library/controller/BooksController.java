package com.au.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.au.library.Book;
import com.au.library.Cart;
import com.au.library.repository.BookDAO;

@RestController
public class BooksController {
	
	@Autowired
	BookDAO booksDao;
	
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public List<Book> getAll() {
		List<Book> books=new ArrayList<Book>();
//		books.add(new Book("1","Marvel comics","Stanlee",200D,"This book describe all the super heros"));
		return booksDao.All();
	}
	

	@RequestMapping(value="/books/1/get",method=RequestMethod.GET)
	public Book getBookById() {
		
		return (new Book(1,"Marvel comics","Stanlee",200,"This book describe all the super heros"));
		
	}
	
	@GetMapping(value="/books/{bookId}/get")
	public String getBookById(@PathVariable(value="bookId") String bookId) {
		return booksDao.get(bookId);
	}
	
	@PostMapping(value="/books")
	public Book createBook(@RequestBody Book book) {
		return booksDao.create(book);
	}
	
	@RequestMapping(value="/carts",method=RequestMethod.POST)
	public Book Addtocart(@RequestBody Book book) {
		
		return booksDao.Addtocart(book);
		
		
	}
	
	@GetMapping(value="/getcart")
	public List<Cart> getthecart() {
		
		return booksDao.cartget();
	}
}
