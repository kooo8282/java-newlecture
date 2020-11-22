package Part2_structedJava.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructedjavaProgram {
	

	public static void main(String[] args) {	
		int menu;
		int[] korList = new int[3];		
		boolean keepLoop = true;		
		
		while(keepLoop) {
			menu = inputMenu();
			
			switch(menu) {	
			case 1:				
				inputKors(korList);
				break;			
			case 2:			
				printKors(korList);
				break;			
			case 3:
				keepLoop = false;
				break;				
			default:
				System.out.println("입력오류 1~3까지만 입력할 수 있습니다.");			
			}
		}
		System.out.println("good bye~~");
	}
	
	static int inputMenu() {
		Scanner scan = new Scanner(System.in);		
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.종료");
		System.out.print("\t>");
		int menuResult = scan.nextInt();	
		return menuResult;
	}
	
	static void printKors(int[] kors) {
		int total = 0;
		float avg;
		for(int i=0; i<3; i++)
			total += kors[i];
		avg = total/3.0f;
		System.out.println("\t-------성적출력--------");
		for (int i=0; i<3; i++) 
			System.out.printf("\tkor%d : %3d\n",i+1, kors[i]);
		
		System.out.printf("\ttotal : %3d\n", total);
		System.out.printf("\tavg : %6.2f\n", avg);
		System.out.println("\t-------------------");
	}
	
	static void inputKors(int[] kors) {
		Scanner scan = new Scanner(System.in);
		int kor;
		System.out.println("\t-------성적입력--------");
		for (int i=0; i<3; i++) {
			do {
				System.out.printf("\tkor%d : ",i+1);
				kor = scan.nextInt();
				if(kor<0 || 100<kor)
					System.out.println("성적범위(0-100)를 벗어났습니다.");
			}while(kor<0 || 100<kor);
			kors[i]=kor;
		}
	}
	
}
