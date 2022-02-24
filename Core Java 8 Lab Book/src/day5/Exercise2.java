package day5;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		try{
			if(firstName.isEmpty() || lastName.isEmpty()){
				throw new EmployeeException("First Name and Last Name should not be blank");
			}
		} catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
