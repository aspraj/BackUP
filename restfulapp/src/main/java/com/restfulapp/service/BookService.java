package com.restfulapp.service;


import java.util.List;

import com.restfulapp.entity.Book;
import com.restfulapp.entity.Employee;
import com.restfulapp.exception.BookNotFoundException;

public interface BookService {
	
	public List<Book> getAllBooks();

	public Book getBook(Integer bookId) throws BookNotFoundException;

	public Book addBook(Book newBook);
	
	public Book getBookByName(String name);

	public void deleteBook(Integer bookId);

	public Book replacebook(Book newBook, Integer bookId);

}