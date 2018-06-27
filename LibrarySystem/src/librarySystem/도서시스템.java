package librarySystem;

import java.util.Scanner;

public class 도서시스템 {
	도서	book = new 도서();
	public static void main(String[] args) {
		int position;
		System.out.println("what is your position.(1.member 2. manager)");
		Scanner input = new Scanner(System.in);
		position = input.nextInt();
		
		if(position == 1)
			choiceMem();
		else if(position == 2)
			choiceManager();
		else
			System.out.println("Input is wrong.");
	}
	public static void choiceMem() {
		int choiceNum;
		System.out.println("choice the number.");
		System.out.println("1. 도서 검색\n"
				+ "2. 도서 요청\n"
				+ "3. 회원 관리");
		Scanner input = new Scanner(System.in);
		choiceNum = input.nextInt();
	}
	public static void choiceManager() {
		int choiceNum;
		System.out.println("choice the number.");
		System.out.println("1. 대출\n"
				+ "2. 반납\n"
				+ "3. 도서 신청\n"
				+ "4. 도서 관리\n"
				+ "5. 회원 관리\n"
				+ "6. 도서예약\n"
				+ "7. 도서 검색");
		Scanner input = new Scanner(System.in);
		choiceNum = input.nextInt();
		
		switch (choiceNum) {
		case 1:
			
			break;

		default:
			break;
		}
	}
}
