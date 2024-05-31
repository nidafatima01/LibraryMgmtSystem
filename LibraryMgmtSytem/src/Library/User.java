package Library;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
	private String userName;
    private List<Book> borrowedBooks; //initializes an empty list to store the borrowed books.
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
		borrowedBooks = new ArrayList<>();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
	
	public boolean hasBorrowedBook(Book book) {
		return borrowedBooks.contains(book);
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", borrowedBooks=" + borrowedBooks + "]";
	}   
    
}
