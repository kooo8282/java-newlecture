package ex7.control1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// Scanner scan = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		kor1 =0;
		kor2 =0;
		kor3 =0;
		
		while(true) { // true: ���ѹݺ�
			// ���� �Է� �κ�
			System.out.print("kor1 : ");
			kor1 = scan.nextInt();					
//			if(!(0<=kor1 && kor1<=100))
//			if(0>kor1 || kor1>100)
			while(kor1<0 || 100<kor1) {
				System.out.println("��������(0-100)�� ������ϴ�.");
				System.out.print("kor1 : ");
				kor1 = scan.nextInt();		
			}
			System.out.print("kor2 : ");
			kor2 = scan.nextInt();
			System.out.print("kor3 : ");
			kor3 = scan.nextInt();
			
			// ���� ��� �κ�
			total = kor1+kor2+kor3;
			avg = total/3;
			System.out.println("--------------------");
			System.out.printf("kor1 : %d\n", kor1);
			System.out.printf("kor2 : %d\n", kor2);
			System.out.printf("kor3 : %d\n", kor3);
			System.out.printf("total : %d\n", total);
			System.out.printf("avg : %6.2f\n", avg);
		}

	}

}
