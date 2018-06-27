package librarySystem;

public class 요청도서 {
	private int state;
	private String bookName;
	private String publisher;
	private String author;
	
	public void addBook(도서설명 reqBookInfo, 회원 thisMember) {
		
	}
	public void approveState(int state) {
		
	}
	public void searchRequestBook(도서설명 BookInfo) {
		
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
