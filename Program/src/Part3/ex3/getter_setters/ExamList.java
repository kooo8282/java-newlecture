package Part3.ex3.getter_setters;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	void inputList() {
		
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
		
//		Exam exam = new Exam();
//		exam.setKor(kor); //exam.kor = kor;
//		exam.setEng(eng);//exam.eng = eng;
//		exam.setMath(math);//exam.math = math;
		Exam exam = new Exam(kor,eng,math);
		
//		Exam[] exams = this.exams;
		int size = current;

		if(exams.length == size) {
			//1. ũ�Ⱑ 5�� ���� �� ū ���ο� �迭�� ����
			Exam[] temp = new Exam[exams.length + 5];
			//2. ���� ���ֽ�Ű��
			for(int i=0;i<size;i++)
				temp[i] = exams[i];
			//3.list.exams�� ���θ��� temp�迭�� �����ϵ��� �Ѵ�.
			exams = temp;
		}
		
		exams[current] = exam;
		current++;		
	}	

	void printList() {
		printList(current);
	}
	
	void printList(int size) {
		System.out.printf("\t---���� ���---\n");
		
//		Exam[] exams = this.exams;
		
		for (int i=0; i<size; i++) {
			Exam exam = exams[i];
			int kor = exam.getKor(); //exam.kor;
			int eng = exam.getEng(); //eng;
			int math = exam.getmath();		
			int total = exam.total();
			float avg = exam.avg();			
			System.out.printf("\t���� : %d\n", kor);
			System.out.printf("\t���� : %d\n", eng);
			System.out.printf("\t���� : %d\n", math);
			System.out.printf("\t���� : %d\n", total);
			System.out.printf("\t��� : %f\n", avg);
			System.out.printf("\t----------\n");		
		}
	}
	
	public ExamList() {
		this(3); // �⺻ ������ �����ε�
	}
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;		
	}

}