package day5;

import java.util.*;

public class Exercise3 {
	
	String name;
	double salary;
	
	Exercise3(String name, double salary){
		this.name = name;
		try{
			if(salary < 3000){
				throw new EmployeeException("Salary is below 3000");
			}
			this.salary = salary;
		}
		catch(Exception e){
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise3 emp1 = new Exercise3("John",2500);
		Exercise3 emp2 = new Exercise3("Ram",9000);
	}

}
