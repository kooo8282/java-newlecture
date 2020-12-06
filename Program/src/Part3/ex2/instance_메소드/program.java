package Part3.ex2.instance_메소드;
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
				System.out.println("입력은 1~3까지만 가능합니다.");				
			}		
		}
		System.out.println("good bye~~");		
	}

	

	static int inputMenu() {
		Scanner scan  = new Scanner(System.in);
		System.out.println("\t----메뉴----");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.println("\t-----------");
		System.out.print("\t>");
		int menuResult = scan.nextInt();	
		return menuResult;		
	}	
}
