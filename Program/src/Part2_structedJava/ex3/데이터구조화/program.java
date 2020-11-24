package Part2_structedJava.ex3.데이터구조화;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		Exam[] exams = new Exam[3];
		
		inputList(exams);
		printList(exams);	

	}

	private static void inputList(Exam[] exams) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적입력");
		int kor,eng,math;
		for(int i=0; i<exams.length; i++) {
			System.out.print("국어 : ");
			kor = scan.nextInt();
			System.out.print("영어 : ");
			eng = scan.nextInt();
			System.out.print("수학 : ");
			math = scan.nextInt();
			
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			exams[i] = exam;
		}
		
		
	}

	private static void printList(Exam[] exams) {
		for(int i=0; i<3; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = kor+eng+math;
			float avg = total / 3.0f;
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("총합 : %d\n", total);
			System.out.printf("평균 : %f\n", avg);
			System.out.print("---------------\n");
		}
	}

}
