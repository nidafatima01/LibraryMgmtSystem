package Library;

class Book {

	private String bookNumber;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookNumber, String title, String author, int publicationYear) {
		this.bookNumber = bookNumber;
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
        this.isAvailable = true; //Additionally, it sets isAvailable to true because when a book is initially added to the library, it is available.
	}

	public String getBookNumber() {
		return bookNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", title=" + title + ", author=" + author + ", publicationYear="
				+ publicationYear + "]";
	}

	public void borrow() {
		isAvailable=false;
	}
    public void returnBook() {
    	isAvailable=true;
    }
    
}
