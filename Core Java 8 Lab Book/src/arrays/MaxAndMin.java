package arrays;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE; 
		for(int i=0;i<n;i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		System.out.print(max+ " " + min);
		sc.close();
	}

}