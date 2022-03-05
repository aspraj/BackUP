package Query.service;

import java.util.List;

import Query.dao.BookDAO;
import Query.dao.BookDAOImpl;
import Query.data.Book;

public class BookServiceImpl implements BookService {
	BookDAO bookDAO = new BookDAOImpl();

	@Override
	public List<Book> getAllBooks() {

		return bookDAO.getAllBooks();
	}

	@Override
	public List<Book> getBookByAuthor(String author) {

		return bookDAO.getBookByAuthor(author);
	}

	@Override
	public Book getBookByTitle(String title) {

		return bookDAO.getBookByTitle(title);
	}

	@Override
	public void addBook(Book book) {
		bookDAO.addBook(book);
		
	}

}