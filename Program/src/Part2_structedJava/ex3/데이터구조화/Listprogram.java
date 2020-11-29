package Part2_structedJava.ex3.데이터구조화;
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
				System.out.println("입력은 1~3까지만 가능합니다.");				
			}		
		}
		System.out.println("good bye~~");		
	}

	private static void inputList(ExamList list) {
		
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
			
			Exam[] exams = list.exams;
			int size = list.current;

			if(exams.length == size) {
				//1. 크기가 5개 정도 더 큰 새로운 배열을 생성
				Exam[] temp = new Exam[exams.length + 5];
				//2. 값을 이주시키기
				for(int i=0;i<size;i++)
					temp[i] = exams[i];
				//3.list.exams가 새로만든 temp배열을 참조하도록 한다.
				list.exams = temp;
			}
			
			list.exams[list.current] = exam;
			list.current++;		
	}
	
	static void printList(ExamList list) {
		printList(list, list.current);
	}
	
	static void printList(ExamList list, int size) {
		System.out.printf("\t---성적 출력---\n");
		
//		int size = list.current;
		Exam[] exams = list.exams;
		
		for (int i=0; i<size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;		
			int total = kor + eng + math;
			float avg = total / 3.0f;			
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
