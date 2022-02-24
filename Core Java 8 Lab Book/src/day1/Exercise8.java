package day1;

import java.util.Scanner;

public class Exercise8 {

	public static boolean checkNumber(int n) {
		return n!=0 && ((n&(n-1)) == 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(checkNumber(n))
			System.out.println(n + " is a power of 2");
		else
			System.out.println(n + " is not a power of 2");
	}

}
