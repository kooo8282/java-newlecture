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
			// ���� �޴�
			System.out.println("\t1.�����Է�");
			System.out.println("\t2.�������");
			System.out.println("\t3.����");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
	
			case 1:
				System.out.println("------�����Է�------");
				do {
					System.out.print("kor1 : ");
					kor1 = scan.nextInt();
					if(kor1<0 || 100<kor1)
						System.out.println("��������(0-100)�� ������ϴ�.");
				}while(kor1<0 || 100<kor1);
				
				do {
					System.out.print("kor2 : ");
					kor2 = scan.nextInt();
					if(kor2<0 || 100<kor2)
						System.out.println("��������(0-100)�� ������ϴ�.");
				}while(kor2<0 || 100<kor2);
				
				do {
					System.out.print("kor3 : ");
					kor3 = scan.nextInt();
					if(kor3<0 || 100<kor3)
						System.out.println("��������(0-100)�� ������ϴ�.");
				}while(kor3<0 || 100<kor3);
				break;
			
			case 2:			
				total = kor1+kor2+kor3;
				avg = total/3;
				System.out.println("\t-------�������--------");		
				System.out.printf("\ttotal : %d\n", total);
				System.out.printf("\tavg : %6.2f\n", avg);		
				break;
			
			case 3:
				break exit; //switch�� ���. while�� ��ӵ�...
				
			default:
				System.out.println("�Է¿��� 1~3������ �Է��� �� �ֽ��ϴ�.");			
			}
		}//while end
		System.out.println("good bye~~");
	}
}
