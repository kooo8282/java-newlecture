package ex5.io.scanner;

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
		
		
		// 己利 涝仿 何盒
		System.out.print("kor1 : ");
		kor1 = scan.nextInt();
		System.out.print("kor2 : ");
		kor2 = scan.nextInt();
		System.out.print("kor3 : ");
		kor3 = scan.nextInt();
		
		// 己利 免仿 何盒
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
