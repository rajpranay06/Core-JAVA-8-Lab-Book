package day1;

import java.util.Scanner;

public class Exercise3 {

	public int recursiveFibonacci(int num) {
		if (num <= 1)
			return num;
		return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
				
	}
	public int Fibonacci(int num) {
		int a = 0,b = 1,c = 1;
		for(int i=2;i<=num;i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		Exercise3 exercise = new Exercise3();
		System.out.println(num + "th value in a fibonacci series using recursion " + exercise.recursiveFibonacci(num));
		System.out.println(num + "th value in a fibonacci series without using recursion " + exercise.Fibonacci(num));
	
	}

}
