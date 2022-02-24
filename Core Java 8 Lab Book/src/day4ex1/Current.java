package day4ex1;

import day4ex1.Account;

public class Current extends Account{
	final double overdraftLimit = 50000.00;
	public double withdraw(double money){
		if(super.withdrawnMoney <= overdraftLimit){
			return super.withdraw(money);
		}
		System.out.println("Money withdrawal limit reached");
		return balance;
	}
}
