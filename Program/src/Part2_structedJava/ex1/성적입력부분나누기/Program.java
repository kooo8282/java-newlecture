package Part2_structedJava.ex1.�����Էºκг�����;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int[] kors = new int[3];
		int total;
		float avg;
		int menu;

		Scanner scan = new Scanner(System.in);
	
		for(int i=0 ;i<3 ;i++)
			kors[i]=0;
		
		exit:
		while(true) {

			System.out.println("\t1.�����Է�");
			System.out.println("\t2.�������");
			System.out.println("\t3.����");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {	
			case 1:				
				for (int i=0; i<3; i++)
					do {
						System.out.printf("\tkor%d : ",i+1);
						kors[i] = scan.nextInt();
						if(kors[i]<0 || 100<kors[i])
							System.out.println("��������(0-100)�� ������ϴ�.");
					}while(kors[i]<0 || 100<kors[i]);	
				break;
			
			case 2:			
				total = kors[0]+kors[1]+kors[2];
				avg = total/3;
				System.out.println("\t-------�������--------");
				for (int i=0; i<3; i++)
					System.out.printf("\tkor%d : %3d\n",i+1, kors[i]);				
				
				System.out.printf("\ttotal : %3d\n", total);
				System.out.printf("\tavg : %6.2f\n", avg);
				System.out.println("\t-------------------");
				break;
			
			case 3:
				break exit;
				
			default:
				System.out.println("�Է¿��� 1~3������ �Է��� �� �ֽ��ϴ�.");			
			}
		}
		System.out.println("good bye~~");
	}
}
