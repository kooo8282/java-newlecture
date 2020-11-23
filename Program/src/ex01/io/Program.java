package ex01.io;
public class Program {
	public static void main(String[] args) {	
		
		float x = 1;
		float pResult = power(x);
		System.out.print(pResult+"\n");
		
		print(2, 3.0f, 'a');
	}

	private static void print(int i, float f, char c) {
		System.out.printf("%d, %f, %c\n",i, f, c);		
	}

	private static float power(float x) {
		return (x+3)*(x+3)+x/3*(x-2);		
	}
}
