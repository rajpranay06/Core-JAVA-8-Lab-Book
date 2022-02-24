package day6;

import java.util.*;

public class Exercise2 {
	
	public static HashMap<Character, Integer> countChars(char[] arr){
		HashMap<Character, Integer> res = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(res.containsKey(arr[i])){
				res.replace(arr[i], res.get(arr[i])+1);
			}
			else{
				res.put(arr[i], 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		for( Map.Entry m : countChars(arr).entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
