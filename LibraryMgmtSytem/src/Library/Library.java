package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books; //a list of all books in the library
	private List<Book> borrowedBooks;  //a list of books that have been borrowed by users
	
	public Library() {
		books = new ArrayList<Book>();  //initializes the books lists when a Library object is created.
		borrowedBooks = new ArrayList<Book>();   //initializes the borrowedBooks lists ,,
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	public void removeBook(Book book) {
		books.remove(book); // Remove if it's borrowed
	}
	
	public List<Book> getAvailableBooks(){  //returns a list of Book objects that are currently available in the library.
		
		List<Book> availableBooks = new ArrayList<Book>();
		
		for(Book book:books) {
			if(book.isAvailable()) {
				availableBooks.add(book);
			}
		}
		return availableBooks;
		
	}
	
	public List<Book> getBorrowedBooks(){  //returns a list of Book objects that have been borrowed by users.
		
		return borrowedBooks;
		
	}
	
	public void borrowBooks(Book book, User user) { //this method allows a user to borrow a book from the library.
		
		if(book.isAvailable()) {
			book.borrow();
			borrowedBooks.add(book);
			user.borrowBook(book);
		}else {
			System.out.println("Sorry, the book is not available for borrowing.");
		       
		}
	}
	public void returnBook(Book book, User user) { //This method allows a user to return a book to the library.
		
		if(borrowedBooks.contains(book) && user.hasBorrowedBook(book)) {
			book.returnBook();
			borrowedBooks.remove(book);
			user.returnBook(book);		
		}else {
			 System.out.println("Invalid book or user. Cannot return the book.");
		       
		}
	}
}
