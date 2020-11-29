package Part2_structedJava.ex3.�����ͱ���ȭ;
import java.util.Scanner;
public class Listprogram {

	public static void main(String[] args) {
		ExamList list = new ExamList();		
		list.exams = new Exam[3];
		list.current = 0;
		
		boolean loop = true;
		while(loop) {
			int menu = inputMenu();
			switch(menu) {
			case 1:
				inputList(list);
				break;
			case 2:
				printList(list);
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

	private static void inputList(ExamList list) {
		
			int kor, eng, math;			
			Scanner scan = new Scanner(System.in);
			System.out.printf("\t---���� �Է�---\n");		
			do {
				System.out.printf("����: ");
				kor = scan.nextInt();				
			}while(0<=kor && kor>=100);
			do {
				System.out.printf("����: ");
				eng = scan.nextInt();				
			}while(0<=eng && eng>=100);
			do {
				System.out.printf("����: ");
				math = scan.nextInt();				
			}while(0<=math && math>=100);
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			Exam[] exams = list.exams;
			int size = list.current;

			if(exams.length == size) {
				//1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭�� ����
				Exam[] temp = new Exam[exams.length + 5];
				//2. ���� ���ֽ�Ű��
				for(int i=0;i<size;i++)
					temp[i] = exams[i];
				//3.list.exams�� ���θ��� temp�迭�� �����ϵ��� �Ѵ�.
				list.exams = temp;
			}
			
			list.exams[list.current] = exam;
			list.current++;		
	}
	
	static void printList(ExamList list) {
		printList(list, list.current);
	}
	
	static void printList(ExamList list, int size) {
		System.out.printf("\t---���� ���---\n");
		
//		int size = list.current;
		Exam[] exams = list.exams;
		
		for (int i=0; i<size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;		
			int total = kor + eng + math;
			float avg = total / 3.0f;			
			System.out.printf("\t���� : %d\n", kor);
			System.out.printf("\t���� : %d\n", eng);
			System.out.printf("\t���� : %d\n", math);
			System.out.printf("\t���� : %d\n", total);
			System.out.printf("\t��� : %f\n", avg);
			System.out.printf("\t----------\n");		
		}
	}

	private static int inputMenu() {
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
