package task5;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				k = k + 1;

				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}
