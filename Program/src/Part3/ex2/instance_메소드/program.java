package Part3.ex2.instance_�޼ҵ�;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		ExamList list = new ExamList();		
		
		boolean loop = true;
		while(loop) {
			int menu = inputMenu();
			switch(menu) {
			case 1:
				list.inputList();
				break;
			case 2:
				list.printList();
				break;
			case 3:
				loop = false;
				break;
			default:
				System.out.println("�Է��� 1~3������ �����մϴ�.");				
			}		
		}
		System.out.println("good bye~~");		
	}

	

	static int inputMenu() {
		Scanner scan  = new Scanner(System.in);
		System.out.println("\t----�޴�----");
		System.out.println("\t1.�����Է�");
		System.out.println("\t2.�������");
		System.out.println("\t3.����");
		System.out.println("\t-----------");
		System.out.print("\t>");
		int menuResult = scan.nextInt();	
		return menuResult;		
	}	
}
