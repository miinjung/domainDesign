package librarySystem;

import java.util.ArrayList;

public class �������� {
	private String bookName;
	private String publisher;
	private String author;
	public ArrayList<�������> bookID = new ArrayList<�������>();
	public ��������(String bookName, String publisher, String author,String bookID, int state){
		bookName = this.bookName;
		publisher = this.publisher;
		author = this.author;
		������� ID = new �������(bookID,state);
		this.bookID.add(ID);
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
	
	
	@Override
	public String toString() {
		return "bookName : "+getBookName()+"\n"
				+"author : "+getAuthor()+"\n"
				+"publisher : "+getPublisher();
	}
}
