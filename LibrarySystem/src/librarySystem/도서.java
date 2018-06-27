package librarySystem;

import java.util.ArrayList;
import java.util.Random;

public class 도서{
	public ArrayList<도서설명> bookList = new ArrayList<도서설명>();
	
	public 도서설명 getBookInfo(int barcodeInfo) {
		int index = barcodeInfo;
		int IDListsize = bookList.get(index).bookID.size();
		
		if(index == -1)
			return null;
		
		System.out.println(bookList.get(index).toString());
		for(int i =0; i<IDListsize;i++)
			System.out.println(bookList.get(index).bookID.get(i).toString());
		
		return bookList.get(index);
	}
	
	public int updateBookRentState(String bookName, String bookID) {
		int index = findBook(bookName,null,null);
		int IDListsize = bookList.get(index).bookID.size();
		int i;
		
		if(index == -1)
			return -1;
		
		for(i =0; i<IDListsize;i++){
			if(bookList.get(index).bookID.get(i).getBookID().equals(bookID))
					bookList.get(index).bookID.get(i).setState(2);
		}
		
		if(i == IDListsize)
			return -1;
		
		return 1;
	}
	
	public int deleteBookRentState(도서설명 book, int state) {
		int index = findBook(book.getBookName(),book.getAuthor(),book.getPublisher());
		int IDListsize = bookList.get(index).bookID.size();
		int i;
		String bookID = book.bookID.get(index).getBookID();
		
		if(index == -1)
			return -1;
		
		for(i =0; i<IDListsize;i++){
			if(bookList.get(index).bookID.get(i).getBookID().equals(bookID))
					bookList.get(index).bookID.get(i).setState(1);
		}
		
		if(i == IDListsize)
			return -1;
		
		return 1;
	}
	
	public int updateBRsrvState(도서설명 book,int state) {
		int index = findBook(book.getBookName(),book.getAuthor(),book.getPublisher());
		int IDListsize = bookList.get(index).bookID.size();
		int i;
		String bookID = book.bookID.get(index).getBookID();
		
		if(index == -1)
			return -1;
		
		for(i =0; i<IDListsize;i++){
			if(bookList.get(index).bookID.get(i).getBookID().equals(bookID))
					bookList.get(index).bookID.get(i).setState(state);
		}
		
		if(i == IDListsize)
			return -1;
		
		return 1;
	}
	
	public void recordReserveMember(회원 thisManager, date date) {
		
	}
	
	public int findBook(String bookName, String author, String publisher) {
		int index =0;
		int i = 0;
		int listsize = bookList.size();
		int IDListsize = bookList.get(index).bookID.size();
		
		for(i=0; i<listsize;i++) {
			if(bookList.get(i).getBookName().equals(bookName)) {
				index = i;	
			}
		}
		if(i == listsize)
			return -1;
		
		return index;	
	}
	
	public void addNewBook(String name, String author, String publisher, int barcodeInfo) {
		String bookID = addBookID();
		도서설명 book = new 도서설명(name, author, publisher,bookID,1);
	}
	public String addBookID() {
		Random random = new Random();
		
		int bookID = random.nextInt();
		return Integer.toString(bookID);
	}
	public void modifyBookInfo(String bookID) {
		
	}
	public void modifyBookInfo(int state) {
		
	}
	public void deleteBook(도서설명 thisBook) {
		int index = findBook(thisBook.getBookName(),thisBook.getAuthor(),thisBook.getPublisher());
		bookList.remove(index);
	}
}
