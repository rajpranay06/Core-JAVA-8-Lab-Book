package day1;

import java.util.Scanner;

import day1.Exercise1;
//Program to print sum of cubes of all digits of a number
public class Exercise1 {

	public int sumOfTheCubes(int num) {
		int sum = 0;
		int remainder;
		while(num > 0) {
			remainder = num%10;
			num /= 10;
			sum += Math.pow(remainder, 3); 
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		Exercise1 exercise = new Exercise1();
		System.out.println("Sum of cubes of all digits of " + num + " is " + exercise.sumOfTheCubes(num));
	}

}
