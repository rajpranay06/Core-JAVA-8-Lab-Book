package day3;

import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean isPositive = true;
		for(int i=0;i<str.length() - 1;i++) {
			char first = str.charAt(i);
			char second = str.charAt(i+1);
			if(second < first) {
				isPositive = false;
				break;
			}
		}
		if(isPositive)
			System.out.println(str + " is a Positive String");
		else
			System.out.println(str + " is not a Positive String");
	}

}
