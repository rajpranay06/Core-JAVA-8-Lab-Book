package day3;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		StringBuffer result = new StringBuffer();
		int i;
		for(i=0;i<num.length()-1;i++) {
			int k = Math.abs(Character.getNumericValue(num.charAt(i)) - Character.getNumericValue(num.charAt(i+1)));
			result.append(k);
		}
		result.append(num.charAt(i));
		System.out.println(result);
	}

}
