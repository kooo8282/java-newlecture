package ex4.io.printf;
public class Program {
	public static void main(String[] args) {		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1+kor2+kor3;
		avg = total/3;
		//-------score print-------
		System.out.println("Score report");
		System.out.println("--------------");
		System.out.printf("kor1 : %3d\n", kor1);
		System.out.printf("kor2 : %3d\n", kor2);
		System.out.printf("kor3 : %3d\n", kor3);
		System.out.printf("total : %3d\n", total);
		System.out.printf("avg : %6.2f\n", avg);
		System.out.println("--------------");
		
	
	}
}
