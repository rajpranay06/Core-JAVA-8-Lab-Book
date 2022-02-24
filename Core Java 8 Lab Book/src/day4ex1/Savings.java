package day4ex1;

import day4ex1.Account;

public class Savings extends Account{

	final double minBalance = 500.00;
	public double withdraw(double money){
		System.out.println(super.balance);
		if(money <= (super.balance - minBalance)){
			return super.withdraw(money);
		}
		System.out.println("Not enough balance to withdraw");
		return balance;
	}
}