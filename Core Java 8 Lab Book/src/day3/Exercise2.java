package day3;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer stringBuffer = new StringBuffer(str);
		stringBuffer.reverse();
		System.out.println(str + "|" + stringBuffer);
	}

}
