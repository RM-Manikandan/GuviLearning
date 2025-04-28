package task6;

import java.util.Scanner;

public class Account {
	
	private long savingAmount;

	public Account(long savingAmount) {
		
		this.savingAmount = savingAmount;
	}

	public Account() {
		
		this.savingAmount = 1000;
	}
	
	private long withdraw(long amount) {
		
		savingAmount = savingAmount - amount;
		return savingAmount;
		

	}
	
	private long deposit(long amount) {
		
		savingAmount = savingAmount + amount;
		return savingAmount;
		
		

	}
	private void checkBalance() {
		
		System.out.println("Available return Balance: "+savingAmount);

	}

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		System.out.println("Available balance after withdraw with balance of 100000: "+a1.withdraw(100));
		System.out.println("Available balance after deposit with balance of 100000: "+a1.deposit(200));
		a1.checkBalance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Saving Amount if any");
		long savingAmount = sc.nextLong();
		Account a2 = new Account(savingAmount);
		
		System.out.println("Available balance after withdraw with balance of 100000: "+a2.withdraw(1000));
		System.out.println("Available balance after deposit with balance of 100000: "+a2.deposit(3000));
		a2.checkBalance();
		
		

	}

}
