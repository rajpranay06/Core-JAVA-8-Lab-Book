package day6;

import java.util.*;

public class Exercise3 {

	public static HashMap<Integer, Integer> getSquares(int[] arr){
		HashMap<Integer, Integer> res = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			res.put(arr[i], arr[i]*arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for( Map.Entry m : getSquares(arr).entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}


}
