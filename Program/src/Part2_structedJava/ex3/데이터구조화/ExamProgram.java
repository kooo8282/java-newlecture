package Part2_structedJava.ex3.데이터구조화;

import java.util.Scanner;

public class ExamProgram {	

	public static void main(String[] args) {
		
		Exam exam = new Exam();
//		exam.kor =30;
//		exam.eng = 40;
//		exam.math = 50;		
//		System.out.printf("kor: %d",exam.kor);
		
		input(exam);
		
		print(exam);
		
	}

	private static void print(Exam exam) {
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = kor+eng+math;
		float avg = total / 3.0f;
		System.out.println("\t-------성적출력--------");
		System.out.printf("\tkor : %3d\n", kor);
		System.out.printf("\teng : %3d\n", eng);
		System.out.printf("\tmath : %3d\n", math);
		System.out.printf("\ttotal : %3d\n", total);
		System.out.printf("\tavg : %6.2f\n", avg);
		System.out.println("\t-------------------");
		
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		System.out.println("\t-------성적입력--------");		
		do {
			System.out.printf("\tkor: ");
			kor = scan.nextInt();
			if(kor<0 || 100<kor)
				System.out.println("성적범위(0-100)를 벗어났습니다.");
		}while(kor<0 || 100<kor);
		do {
			System.out.printf("\teng: ");
			eng = scan.nextInt();
			if(eng<0 || 100<eng)
				System.out.println("성적범위(0-100)를 벗어났습니다.");
		}while(eng<0 || 100<eng);
		do {
			System.out.printf("\tmath: ");
			math = scan.nextInt();
			if(math<0 || 100<math)
				System.out.println("성적범위(0-100)를 벗어났습니다.");
		}while(math<0 || 100<math);
		exam.kor=kor;
		exam.eng=eng;
		exam.math=math;		
		
	}
	
}
