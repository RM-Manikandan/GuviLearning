package task5;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				
				if(i == j || j==k) {
				System.out.print("*"+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			k--;
			System.out.println();
		}
	}

}
