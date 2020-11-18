package ex10.control3.for_example;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {		
		int total = 0;
		// 3~7 гу = n(a+l)/2
		for(int i=0;i<5;i++)
			total += i+3;			
		
		System.out.printf("total : %d\n", total);
	}
}
