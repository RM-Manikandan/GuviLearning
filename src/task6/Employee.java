package task6;

import java.util.Scanner;

public class Employee {
	
	public int id;
	public String name;
	public int salary;
	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public double raiseSalary(int Percent, int salary) {
		
		double percentageCal = salary * Percent/100;
		//System.out.println(percentageCal);
		double raiseSalary = 0;
		raiseSalary = salary + percentageCal;
		return raiseSalary;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of the Employee");
		int id = sc.nextInt();
		e.setId(id);
		System.out.println("Enter the salary of the Employee");
		int salary = sc.nextInt();
		e.setSalary(salary);
		System.out.println("Enter the hike percentage of the Employee");
		int percent = sc.nextInt();
		System.out.println("Enter the name of the Employee");
		String name = sc.next();
		e.setName(name);
		
		System.out.println("The raise salary of an Employee after hike: " +e.raiseSalary(percent, salary));
	}

}
