package Part2_structedJava.ex3.데이터구조화;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		Exam[] exams = new Exam[3];
		int current = 0;
		
		boolean loop = true;
		while(loop) {
			int menu = inputMenu();
			switch(menu) {
			case 1:
				inputList(exams, current);
				break;
			case 2:
				printList(exams, current);
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

	private static void inputList(Exam[] exams, int current) {
		
			int kor, eng, math;			
			Scanner scan = new Scanner(System.in);
			System.out.printf("\t---성적 입력---\n");		
			do {
				System.out.printf("국어: ");
				kor = scan.nextInt();				
			}while(0<=kor && kor>=100);
			do {
				System.out.printf("영어: ");
				eng = scan.nextInt();				
			}while(0<=eng && eng>=100);
			do {
				System.out.printf("수학: ");
				math = scan.nextInt();				
			}while(0<=math && math>=100);
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			exams[current] = exam;
			current++;		
	}
	
	private static void printList(Exam[] exams, int size) {
		System.out.printf("\t---성적 출력---\n");
		for (int i=0; i<size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;		
			int total = kor + eng + math;
			float avg = total / 3.0f;
			System.out.printf("\t----------\n");
			System.out.printf("\t국어 : %d\n", kor);
			System.out.printf("\t영어 : %d\n", eng);
			System.out.printf("\t수학 : %d\n", math);
			System.out.printf("\t총점 : %d\n", total);
			System.out.printf("\t평균 : %f\n", avg);
			System.out.printf("\t----------\n");		
		}
	}

	private static int inputMenu() {
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
