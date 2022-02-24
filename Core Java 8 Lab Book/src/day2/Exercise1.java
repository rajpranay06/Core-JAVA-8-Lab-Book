package day2;

import java.util.Scanner;

public class Exercise1 {

	public static int getSecondSmallest(int[] arr) {
		int first = Integer.MAX_VALUE, second = Integer.MIN_VALUE;
		if(arr.length < 2)
			return -1;
		for(int i=0;i<arr.length;i++) {
			// If the current element is less than the first element assign first to second and arr[i] to first
			if(arr[i] < first) {
				second = first;
				first = arr[i];
			}
			// If the current element is in between first and second assign it to second
			else if(arr[i] < second && first != arr[i]) {
				second = arr[i];
			}
		}
		if(second != Integer.MAX_VALUE)
			return second;
		// If there is no second element return -1;
		else
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
	}

}
