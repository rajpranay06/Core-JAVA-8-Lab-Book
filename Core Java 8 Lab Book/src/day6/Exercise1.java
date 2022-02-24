package day6;

import java.util.*;

public class Exercise1 {
	
	public static List<Integer> getValues(HashSet<Integer> arr){
		List<Integer> res = new ArrayList<>(arr);
		Collections.sort(res);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> arr = new HashSet<>();
		int n = sc.nextInt();  // No of elements in the hash set
		for(int i=0;i<n;i++){
			arr.add(sc.nextInt());
		}
		System.out.println(getValues(arr));
	}

}
