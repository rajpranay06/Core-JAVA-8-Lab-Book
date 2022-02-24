package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static String[] sortString(String arr[]) {
		Arrays.sort(arr);
		int k = arr.length - arr.length/2;
		for(int i=0;i<k;i++) {
			arr[i] = arr[i].toUpperCase();
		}
		for(int i=k;i<arr.length;i++) {
			arr[i] = arr[i].toLowerCase();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		for(String s : sortString(arr)) {
			System.out.print(s + " ");
		}
	}

}
