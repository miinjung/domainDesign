package librarySystem;

import java.util.ArrayList;

public class 도서요청 {
	public ArrayList<도서설명> requestList;
	public void makeReqBookInfo(String name, String author, String publisher, 회원 thisMember) {
		도서설명 book = new 도서설명(name,author, publisher,null,0);
		requestList.add(book);
	}
	public void changedApproveState(회원 thisMember) {
		
	}
}
