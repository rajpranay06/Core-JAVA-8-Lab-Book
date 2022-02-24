package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	
	public static int[] getSorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			String k = String.valueOf(arr[i]);
			StringBuilder str = new StringBuilder();
			str.append(k);
			str.reverse();
			arr[i] = Integer.parseInt(str.toString());
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int ele : getSorted(arr)) {
			System.out.print(ele + " ");
		}
	}

}

