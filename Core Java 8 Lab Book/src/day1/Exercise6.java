package day1;

import java.util.Scanner;

public class Exercise6 {

	public static int calculateDifference(int n) {
		int sumOfSquares = n*(n+1)*((2*n)+1)/6;
		int totalSum = n*(n+1)/2;
		return Math.abs((totalSum * totalSum) - sumOfSquares);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		System.out.println("Difference between the sum of the squares of the first " + n + " natural numbers and the square of their sum "+ calculateDifference(n));
	}

}