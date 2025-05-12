package task7;

import java.util.Scanner;

public class Program03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age<18) {
			try {
				throw new Exception("Invalid Exception");
			}
			catch(Exception e){
				System.out.println("Exception found - "+e.getMessage());
			}
		}
	}

}
