/**
 * Author:		Collin Reid
 * Date:		Apr 14, 2022
 * File:		SavingsAccountRunner.java
 * Description:	Insert description here
 */

/**
 * @author Collin.Reid
 *
 */

import java.util.*;
public class SavingsAccountRunner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SavingsAccount account=new SavingsAccount();
		System.out.println("Welcome to your Savings Account App!");
		System.out.print("Enter your account number: ");
		account.setId(sc.nextInt());
		System.out.print("Enter your intial balance: ");
		account.setBalance(sc.nextDouble());
		System.out.print("Enter your annual interest rate: ");
		account.setAnnualIntRate(sc.nextDouble());
		boolean exit=true;
		do{
			System.out.println("\n=========================================");
			System.out.println("= 		OPTIONS			=");
			System.out.println("=========================================\n");
			System.out.println("1.Deposit");
			System.out.println("2.View Weekly Interest Rate");
			System.out.println("3.View Account Details");
			System.out.println("4.Exit");
			System.out.print("Enter your selection: ");
			int selection=sc.nextInt();
			switch(selection) {
			case 1:System.out.print("Enter your deposit amount: ");
			double amount=sc.nextDouble();
			if(amount<=0) {
				System.out.println("Amount needs to be greater than 0");
				break;
			}
			else {
				account.deposit(amount);
			}
			break;
			case 2: System.out.println("Your Weekly Interest Amount is $"+ Math.round(account.getWeeklyIntRate()*100.0)/100.0);
			break;
			case 3:account.getAccountDetails();
			break;
			case 4: exit=false;
			System.out.println("Thank you - Goodbye !");
			break;
			default:System.out.println("INVALID SELECTION - TRY AGAIN");
			break;
					
	}	
	}while(exit);
	}

}
