package libpack;

public class Author 
{
	private String authorName;
	private int authorId;
	static int totalBooks=0;
	private Book book;
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getTotalBooks() {
		return totalBooks;
	}
	public void setTotalBooks(int noOfBooks) {
		this.totalBooks = noOfBooks;
	}
	
	
public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	//	public Author() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Author(String authorName, int authorId) {
		super();
		this.authorName = authorName;
		this.authorId = authorId;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorId=" + authorId + ", TotalBooks=" + totalBooks + "]";
	}
	
	
}

