package Library;

import java.util.List;

//This class is the main program class responsible for running the library management system.
public class LibraryApp { 

	public static void main(String[]args) {
		
		Library library = new Library();
		
		Book book1 = new Book("A4321","Java Programming","Debasis",2012);
		Book book2 = new Book("M3415","Database Management System","Nida",2015);
		Book book3 = new Book("S7515","Software Engineering","John",2007);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		User user1 = new User(1,"Mamta");
		User user2 = new User(2,"Mona");
		
		System.out.println("Available Books: ");
		
		List<Book> availableBooks = library.getAvailableBooks();
		for (Book book : availableBooks) {
            System.out.println(book);
        }

		library.borrowBooks(book1, user1);
		library.borrowBooks(book2, user1);
		library.borrowBooks(book3, user2);
		library.borrowBooks(book2, user2); //here book is not available
		
		System.out.println("\nBorrowed Books: ");
		
		List<Book> borrowedBooks = library.getBorrowedBooks();
		for(Book book:borrowedBooks) {
			System.out.println(book);
		}
		
		library.returnBook(book3, user2);
		
		System.out.println("\nAfter returning a Book: ");
		
		borrowedBooks = library.getBorrowedBooks();
		for(Book book:borrowedBooks) {
			System.out.println(book);
		}
		
	}
}
