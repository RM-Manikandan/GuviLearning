package task6;

import java.util.Scanner;

public class Circle {
	
	private double radiusC;

	public Circle(int radius) {	
		this.radiusC = radius;
	}

	public Circle() {
		this.radiusC = 1.0;
	}
	
	public double circumferenceCircle() {		
		double output = 2*3.14*radiusC;
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		Circle c2 = new Circle(radius);
		
		System.out.println(c1.circumferenceCircle());
		System.out.println(c2.circumferenceCircle());

	}

}
