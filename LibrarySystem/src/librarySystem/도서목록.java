package librarySystem;

public class ������� {
	private String bookID;
	private int state;  //0 ���� �Ұ�
						//1 �뿩����
						//2 ������
						//3 ������
						//4 �н�
	
	public �������(String bookID, int state) {
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
