package task4;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fct = 1;
		
		for (int i=n; i>=1; i--) {
			 fct = fct*i;
		}
		System.out.println(fct);

	}

}
