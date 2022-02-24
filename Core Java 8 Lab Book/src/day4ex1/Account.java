package day4ex1;

import day4ex1.Person;

public class Account {
	long accNum;
	double balance, withdrawnMoney = 0;
	Person accHolder = new Person();
	public void deposit(double money){
		balance += money;
		System.out.println("Rs."+ money + " is credited to your bank account");
	}
	public double withdraw(double money){
		withdrawnMoney += money;
		balance -= money;
		System.out.println("Rs."+ money + " is debited from your bank account");
		return balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setAccNum(long accNum){
		this.accNum = accNum;
	}
	public long getAccNum(){
		return accNum;
	}
	public String toString(){
		return ("Account [ Account Number = " + accNum + accHolder + " Balance = " + balance + " ]");
	}
}
