package librarySystem;

import java.util.ArrayList;

public class 회원 {
	public ArrayList<기록> memBookList;
	private String userID;
	private String name;
	private int phone;
	private int state;  //0 대출불가
						//1 대출가능
						//2 직원
	
	public 회원 getMemInfo(int barcodeInfo) {
		회원 member = null;
		return member;
	}
	public void updateMemberRentState(int state) {
		
	}
	public void deleteMemRentState(회원 thisMember, int state) {
		
	}
	public void addRecord(기록 newRecord) {
		
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
