package task4;

import java.util.Scanner;

public class Program5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		
		if(n<=1) {
			System.out.println("Not a primer number");
		}
		else if(n==2) {
			System.out.println("Primer number");
		}
		else
		{
			for(int i=2; i<n;i++) {
				if(n%i==0) {
					flag = false;
					break;
				}
			}
			
			if(flag == true) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not a Primer Number");
			}
			
		}
		
		
	}

}
