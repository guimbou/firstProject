//2.0 version for git tests

package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		boolean isRun = true;
		
		System.out.println("Enter the account number: ");
		int accountNumber = in.nextInt();
		
		System.out.println("Enter the holder name: ");
		in.nextLine();
		String holder = in.nextLine();
		
		System.out.println("Enter the initial balance: ");
		double balance = in.nextDouble();
		
		Account c1 = new Account(accountNumber, holder, balance);
		
		System.out.println(c1.toString());
		
		while(isRun) {
		
			System.out.println("Enter an option:");
			System.out.println("\t2 - Deposit");
			System.out.println("\t3 - Withdraw");
			System.out.println("\t4 - Balance");
			System.out.println("\t5 - Exit");
			
			switch(in.nextInt()) {
				
			case 2:
				System.out.println("Enter a value for deposit: ");
				c1.deposit(in.nextDouble());
				break;
			case 3:
				System.out.println("Enter a value for withdraw: ");
				c1.withdraw(in.nextDouble());
				break;
			case 4:
				System.out.println(c1.getSaldo());
				in.nextLine();
				in.nextLine();
				break;
			case 5:
				isRun = false;
				break;
			default:
				System.out.println("Invalid option!");
				in.nextLine();
				in.nextLine();
			}
		
		}
		in.close();

	}
	

}
