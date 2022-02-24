package day1;

import java.util.Scanner;

public class Exercise5 {
	
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i=3;i<=n;i++) {
			if(i%3 == 0 || i%5 ==0)
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		System.out.println("Sum of numbers from 1 to " + n + " which are divisble by 3 or 5 is " + calculateSum(n));
	}

}
