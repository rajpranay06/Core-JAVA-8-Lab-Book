package day6;

import java.util.*;

public class Exercise7 {
	
	public static ArrayList<Integer> getSorted(int[] arr){
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			StringBuilder str = new StringBuilder();
			str.append(Integer.toString(arr[i]));
			str.reverse();
			res.add(Integer.parseInt(str.toString()));
		}
		Collections.sort(res);
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
		System.out.println(getSorted(arr));
	}

}
