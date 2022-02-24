package day1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select one of the below lights: \n 1. Green \n 2. Red \n 3. Yellow \n");
		int select = sc.nextInt();
		switch(select) {
			case 1:
				System.out.println("Go");
				break;
			case 2:
				System.out.println("Stop");
				break;
			case 3:
				System.out.println("Ready");
				break;
			default:
				System.out.println("");
				break;
		}

	}

}