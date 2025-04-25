package task4;

import java.util.Scanner;

public class Program4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for input 1: ");
		int a = sc.nextInt();
		System.out.println("Enter the value for input 2: ");
		int b = sc.nextInt();
		
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping Value of a: "+a);
		System.out.println("After Swapping Value of b: "+b);
	}

}
