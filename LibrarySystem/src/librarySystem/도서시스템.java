package librarySystem;

import java.util.Scanner;

public class �����ý��� {
	����	book = new ����();
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
		System.out.println("1. ���� �˻�\n"
				+ "2. ���� ��û\n"
				+ "3. ȸ�� ����");
		Scanner input = new Scanner(System.in);
		choiceNum = input.nextInt();
	}
	public static void choiceManager() {
		int choiceNum;
		System.out.println("choice the number.");
		System.out.println("1. ����\n"
				+ "2. �ݳ�\n"
				+ "3. ���� ��û\n"
				+ "4. ���� ����\n"
				+ "5. ȸ�� ����\n"
				+ "6. ��������\n"
				+ "7. ���� �˻�");
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
