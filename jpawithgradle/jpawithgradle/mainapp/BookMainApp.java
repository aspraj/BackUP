package jpawithgradle.mainapp;

import jpawithgradle.data.Book;
import jpawithgradle.service.BookService;
import jpawithgradle.service.BookServiceImpl;

public class BookMainApp {
	public static void main(String args[]) {
	
		BookService bookService = new BookServiceImpl();
	
//	Book book = new Book();
//	book.setId(1L);
//	book.setAuthor("Chetan Bhagat");
//	book.setBookTitle("ABCD");
//	book.setPrice(1555.55);
//	
//	Book book2 = new Book();
//	book.setId(2L);
//	book.setAuthor("Amish Trivedi");
//	book.setBookTitle("ABCDEFGH");
//	book.setPrice(555.55);
//	
//	Book book3 = new Book();
//	book.setId(3L);
//	book.setAuthor("Amish Trivedi");
//	book.setBookTitle("Shiva");
//	book.setPrice(455.55);
//	
//	Book book4 = new Book();
//	book.setId(4L);
//	book.setAuthor("Robert C Martin");
//	book.setBookTitle("Clean Code");
//	book.setPrice(655.55);
//	
////	BookService bookService =new BookServiceImpl();
//	bookService.addBook(book);
//	bookService.addBook(book2);
//	bookService.addBook(book3);
//	bookService.addBook(book4);
	
	System.out.println(bookService.getAllBooks());
	System.out.println(bookService.getBookByAuthor("Amish Trivedi"));
	System.out.println(bookService.getBookByTitle("Clean Code"));
	
	}
}