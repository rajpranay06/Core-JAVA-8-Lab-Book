package day6;

import java.util.*;

public class Exercise6 {
	
	public static ArrayList<Integer> votersList(HashMap<Integer, Integer> voters){
		ArrayList<Integer> res = new ArrayList<>();
		for( Map.Entry m : voters.entrySet()){
			Integer key = (Integer) m.getKey(), value = (Integer) m.getValue();
			if(value >= 18)
				res.add(key);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> voters = new HashMap<>();
		int n = sc.nextInt(); // No of voters
		for(int i=0;i<n;i++){
			voters.put(sc.nextInt(), sc.nextInt()); // voterId, voterAge 
		}
		System.out.println(votersList(voters));
	}

}
