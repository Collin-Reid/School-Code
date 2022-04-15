/**
 * Author:		Collin Reid
 * Date:		Apr 14, 2022
 * File:		SavingsAccount.java
 * Description:	Insert description here
 */

/**
 * @author Collin.Reid
 *
 */

import java.util.*;
public class SavingsAccount {
	int id;
	double balance;
	double annualIntRate;
	Date dateEstablished;
	
	public SavingsAccount() {
		id=0;
		balance=0;
		annualIntRate=0;
		dateEstablished=new Date();
	}
	
	public SavingsAccount(int id,double balance) {
		this.id=id;
		this.balance=balance;
	}
	
	void setId(int id) {
		this.id=id;
	}
	
	int getId() {
		return this.id;
	}

	void setBalance(double balance) {
		this.balance=balance;
	}
	
	double getBalance() {
		return this.balance;
	}
	
	void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate=annualIntRate;
	}
	
	double getAnnualIntRate() {
		return this.annualIntRate;
	}
	
	double getWeeklyIntRate() {
		double weeklyIntRate=(this.annualIntRate/100)/52;
		return this.balance*weeklyIntRate;
	}
	
	void deposit(double amount) {
		this.balance+=amount;
		System.out.println("New Balance: $"+this.getBalance());
	}
	
	Date getDate() {
		return this.dateEstablished;
	}
	
	void getAccountDetails() {
		System.out.println();
		System.out.println("Account ID: "+this.getId());
		System.out.println("Account Creation Date/Time: "+this.getDate());
		System.out.println("Balance: "+this.getBalance());
		System.out.println("Weekly Interest Acount: $"+Math.round(this.getWeeklyIntRate()*100.0)/100.0);
		System.out.println();
	}
	
}
