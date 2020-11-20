package ex12.control3.switch_;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;
		
		// Scanner scan = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		kor1 =0;
		kor2 =0;
		kor3 =0;
		exit:
		while(true) {
			// 메인 메뉴
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
	
			case 1:
				System.out.println("------성적입력------");
				do {
					System.out.print("kor1 : ");
					kor1 = scan.nextInt();
					if(kor1<0 || 100<kor1)
						System.out.println("성적범위(0-100)를 벗어났습니다.");
				}while(kor1<0 || 100<kor1);
				
				do {
					System.out.print("kor2 : ");
					kor2 = scan.nextInt();
					if(kor2<0 || 100<kor2)
						System.out.println("성적범위(0-100)를 벗어났습니다.");
				}while(kor2<0 || 100<kor2);
				
				do {
					System.out.print("kor3 : ");
					kor3 = scan.nextInt();
					if(kor3<0 || 100<kor3)
						System.out.println("성적범위(0-100)를 벗어났습니다.");
				}while(kor3<0 || 100<kor3);
				break;
			
			case 2:			
				total = kor1+kor2+kor3;
				avg = total/3;
				System.out.println("\t-------성적출력--------");		
				System.out.printf("\ttotal : %d\n", total);
				System.out.printf("\tavg : %6.2f\n", avg);		
				break;
			
			case 3:
				break exit; //switch만 벗어남. while은 계속됨...
				
			default:
				System.out.println("입력오류 1~3까지만 입력할 수 있습니다.");			
			}
		}//while end
		System.out.println("good bye~~");
	}
}
