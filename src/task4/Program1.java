package task4;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for input 1: ");
		int a = sc.nextInt();
		System.out.println("Enter the value for input 2: ");
		int b = sc.nextInt();
		System.out.println("Enter the value for input 3: ");
		int c = sc.nextInt();
		System.out.println("Enter the value for input 4: ");
		int d = sc.nextInt();
		
		int sum1 = a+b;
		int sum2 = c+d;
		
		if(sum1>sum2) {
			System.out.println("Sum of a & b is greater than sum of c & d");
		}
		else
		{
			System.out.println("Sum of c & d is greater than sum of a & b");
		}
		
	}

}
