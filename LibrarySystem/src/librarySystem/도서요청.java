package librarySystem;

import java.util.ArrayList;

public class ������û {
	public ArrayList<��������> requestList;
	public void makeReqBookInfo(String name, String author, String publisher, ȸ�� thisMember) {
		�������� book = new ��������(name,author, publisher,null,0);
		requestList.add(book);
	}
	public void changedApproveState(ȸ�� thisMember) {
		
	}
}
