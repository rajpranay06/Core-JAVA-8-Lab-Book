package day3;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
		while(stringTokenizer.hasMoreTokens()) {
			int num = Integer.parseInt(stringTokenizer.nextToken());
			sum += num;
			System.out.print(num + " ");
		}
		
		System.out.println("\n" + sum);
	}

}
