package librarySystem;

import java.util.ArrayList;

public class ȸ�� {
	public ArrayList<���> memBookList;
	private String userID;
	private String name;
	private int phone;
	private int state;  //0 ����Ұ�
						//1 ���Ⱑ��
						//2 ����
	
	public ȸ�� getMemInfo(int barcodeInfo) {
		ȸ�� member = null;
		return member;
	}
	public void updateMemberRentState(int state) {
		
	}
	public void deleteMemRentState(ȸ�� thisMember, int state) {
		
	}
	public void addRecord(��� newRecord) {
		
	}
	public void newMember(String id, String password, String name, int phone, String address) {
		
	}
	public void memberModi(String id, String password, int phone, String address) {
		
	}
	public void memberDel(String id) {
		System.out.println("finish to delete member's information");
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
