package day3;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				result += str.charAt(i);
			}
			else {
				char c = str.charAt(i);
				if(c == 'z')
					c = 'a';
				else if(c == 'Z')
					c = 'A';
				else
					c++;
				result += (c);
			}
		}
		System.out.println(result);
	}

}
