package task4;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age>=60) {
			System.out.println("Senior Citizen");
		}
		else
		{
			System.out.println("Not a senior citizen");
		}

	}

}
