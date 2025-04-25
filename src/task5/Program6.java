package task5;

import java.util.Scanner;

public class Program6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month when you're visiting");
		int month = sc.nextInt();
		System.out.println("Enter the roomPrice");
		double roomPrice = sc.nextDouble();
		System.out.println("Enter the No Of Rooms");
		int noOfRooms = sc.nextInt();
		double totalPrice;
		
		if((month >= 4 && month<= 6) ||(month>=11 && month<=12)) {
			double additionalCharges = roomPrice * 0.20;
			roomPrice = additionalCharges + roomPrice;
			
			totalPrice = roomPrice*noOfRooms;
			
		}
		else
		{
			totalPrice = roomPrice*noOfRooms;
		}
		
		System.out.println("Room Rent Calculation - "+totalPrice);
	}

}
