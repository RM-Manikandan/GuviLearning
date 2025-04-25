package task5;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number");
		int n2 = sc.nextInt();
		System.out.println("Enter Third number");
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("N1 is Greater");
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("N2 is Greater");
		}
		else if(n3 > n1 && n3 > n2) {
			System.out.println("N3 is Greater");
		}
		else if(n1 == n2 && n1 > n3) {
			System.out.println("N1 & N2 is Greater");
		}
		else if(n1 == n2 && n1 < n3) {
			System.out.println("N3 is Greater");
		}
		else if(n2 == n3 && n2 > n1) {
			System.out.println("N2 & N3 is Greater");
		}
		else if(n2 == n3 && n2 < n1) {
			System.out.println("N1 is Greater");
		}
		else if(n3 == n1 && n3 > n2) {
			System.out.println("N1 & N3 is Greater");
		}
		else if(n2 == n1 && n3 < n2) {
			System.out.println("N2 is Greater");
		}
		else if(n1 == n2 && n2==n3) {
			System.out.println("All values are equal");
		}
	}
}
