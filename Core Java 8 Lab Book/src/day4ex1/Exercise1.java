package day4ex1;

import day4ex1.Account;
import day4ex1.Current;
import day4ex1.Savings;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Savings();  // Smith Account
		
		acc1.balance = 2000; // Initial Bal of Smith
		acc1.deposit(2000); // Depositing 2000 to Smith acc
		acc1.setAccNum(234567);
		acc1.accHolder.setName("Smith");
		acc1.accHolder.setAge(20);
		
		System.out.println(acc1);
		
		Account acc2 = new Current();  // Kathy Account
		
		acc2.balance = 3000; // Initial Bal of Kathy
		acc2.setAccNum(234568);
		acc2.accHolder.setName("Kathy");
		acc2.accHolder.setAge(25);
		System.out.println(acc2);
		
		System.out.println("Remaining Balance = " + acc2.withdraw(2000));
		System.out.println("Remaining Balance = " + acc1.withdraw(2000));
	}

}

