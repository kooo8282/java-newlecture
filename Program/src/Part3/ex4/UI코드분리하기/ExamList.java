package Part3.ex4.UI코드분리하기;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	void inputList() {
		
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
		
//		Exam exam = new Exam();
//		exam.setKor(kor); //exam.kor = kor;
//		exam.setEng(eng);//exam.eng = eng;
//		exam.setMath(math);//exam.math = math;
		Exam exam = new Exam(kor,eng,math);
		
//		Exam[] exams = this.exams;
		int size = current;

		if(exams.length == size) {
			//1. 크기가 5개 정도 더 큰 새로운 배열을 생성
			Exam[] temp = new Exam[exams.length + 5];
			//2. 값을 이주시키기
			for(int i=0;i<size;i++)
				temp[i] = exams[i];
			//3.list.exams가 새로만든 temp배열을 참조하도록 한다.
			exams = temp;
		}
		
		exams[current] = exam;
		current++;		
	}	

	void printList() {
		printList(current);
	}
	
	void printList(int size) {
		System.out.printf("\t---성적 출력---\n");
		
//		Exam[] exams = this.exams;
		
		for (int i=0; i<size; i++) {
			Exam exam = exams[i];
			int kor = exam.getKor(); //exam.kor;
			int eng = exam.getEng(); //eng;
			int math = exam.getmath();		
			int total = exam.total();
			float avg = exam.avg();			
			System.out.printf("\t국어 : %d\n", kor);
			System.out.printf("\t영어 : %d\n", eng);
			System.out.printf("\t수학 : %d\n", math);
			System.out.printf("\t총점 : %d\n", total);
			System.out.printf("\t평균 : %f\n", avg);
			System.out.printf("\t----------\n");		
		}
	}
	
	public ExamList() {
		this(3); // 기본 생성자 오버로드
	}
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;		
	}

}
