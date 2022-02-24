package day1;

import java.util.Scanner;

public class Exercise7 {
	
	public static boolean checkNumber(int n) {
		int first = n%10,second;
		n = n/10;
		while(n > 0) {
			second = n%10;
			if(first < second) {
				return false;
			}
			n = n/10;
			first = second;
		}
		return true;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if(checkNumber(n)){
			System.out.println(n + " is an increasing number");
		}
		else
			System.out.println(n + " is not an increasing number");
		
	}

}
