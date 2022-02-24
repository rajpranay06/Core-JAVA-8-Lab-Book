package day2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercise4 {
	
	public static LinkedHashSet<Integer> modifyArray(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int ele : arr) {
			set.add(ele);
		}
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int ele : modifyArray(arr)) {
			System.out.print(ele + " ");
		}
	}


}