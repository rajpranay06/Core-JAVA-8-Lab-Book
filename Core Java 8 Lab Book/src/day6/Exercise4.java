package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise4 {

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> students){
		HashMap<Integer, String> res = new HashMap<>();
		for( Map.Entry m : students.entrySet()){
			Integer key = (Integer) m.getKey(), value = (Integer) m.getValue();
			if(value >= 90){
				res.put(key, "Gold");
			}
			else if(value >= 80)
				res.put(key, "Silver");
			else if(value >= 70)
				res.put(key, "Bronze");
			else
				res.put(key, "No medal");
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> students = new HashMap<>();
		for(int i=0;i<n;i++){
			students.put(sc.nextInt(),sc.nextInt());	
		}
		for( Map.Entry m : getStudents(students).entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}


}
