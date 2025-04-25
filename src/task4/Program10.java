package task4;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while (n!=0) {
			n=n/10;
			count++;
		}
		
		System.out.println("Count of digits in number:"+count);
	}

}
