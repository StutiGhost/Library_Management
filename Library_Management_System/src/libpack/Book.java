package libpack;
public class Book {

	private String bookName;
	private int bookId;
	private int bookNum;
	private boolean bookAvailability;
	private Author author;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	public boolean isBookAvailability() {
		return bookAvailability;
	}
	public void setBookAvailability(boolean bookAvailability) {
		this.bookAvailability = bookAvailability;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	public Book(String bookName, int bookId, int bookNum,boolean bookAvailability, Author author) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookNum=bookNum;
		this.bookAvailability = bookAvailability;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", bookNum=" + bookNum + ",bookAvailability=" + bookAvailability
				+ ", author=" + author + "]";
	}
	
	
	
}
