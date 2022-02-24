package day1;

import java.util.Scanner;

public class Exercise4 {
	
	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		System.out.println("Prime numbers from upto " + num + " are:");
		for(int i=1;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
