package librarySystem;

public class 도서목록 {
	private String bookID;
	private int state;  //0 대출 불가
						//1 대여가능
						//2 대출중
						//3 예약중
						//4 분실
	
	public 도서목록(String bookID, int state) {
		bookID = this.bookID;
		state = this.state; 
	}
	
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "bookID :"+getBookID()+"\n"
				+"state : "+getState();
	}
}
