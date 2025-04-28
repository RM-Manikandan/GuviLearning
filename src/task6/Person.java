package task6;

import java.util.Scanner;

public class Person {
	
	private String name;
	private int age;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		p.setName(name);
		p.setAge(age);
		System.out.println("Output from the getter method for Name: "+p.getName());
		System.out.println("Output from the getter method for age: "+p.getAge());
	}

}
