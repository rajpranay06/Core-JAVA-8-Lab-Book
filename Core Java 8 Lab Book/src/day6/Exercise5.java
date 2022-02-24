package day6;

import java.util.*;

public class Exercise5 {
	
	public static int getSecondSmallest(int[] arr){
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			res.add(arr[i]);
		}
		Collections.sort(res);
		return res.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
	}

}
