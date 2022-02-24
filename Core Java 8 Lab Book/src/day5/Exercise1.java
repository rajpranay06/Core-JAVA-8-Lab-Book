package day5;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try{
			if(age <= 15){
				throw new UnderAgeException("Age should be above 15");
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
