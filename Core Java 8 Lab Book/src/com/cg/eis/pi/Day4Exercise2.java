package com.cg.eis.pi;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class Day4Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, ArrayList> employees = new HashMap<Integer, ArrayList>(); // mapping with employee id
		
		boolean stop = false; // using variable to stop adding employees
		
		while(!stop){
			System.out.println("Select an option \n 1.Add employee details\n 2.Enter insurance scheme to view employee details\n 3.Delete an employee\n 4.Stop");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter employee id:");
				int id = sc.nextInt();
				if(employees.containsKey(id)){
					System.out.println("Employee already present\n");
					break;
				}
				System.out.println("Enter employee name");
				String name = sc.next();
				System.out.println("Enter Salary");
				double salary = sc.nextDouble();
				
				Service emp = new Service(id,name,salary); 
				emp.setDesignation();
				emp.setInsuranceScheme();
				
				ArrayList employeeDetails = new ArrayList(); // list to add employee details
				employeeDetails.add(name);
				employeeDetails.add(salary);
				employeeDetails.add(emp.designation);
				employeeDetails.add(emp.insuranceScheme);
				
				employees.put(id, employeeDetails); // putting id and employee details into hashmap
				System.out.println(employees);
				break;
				
			case 2:
				try{
				System.out.println("Enter Insurance Scheme");
				String enteredInsuranceScheme = sc.next();
				enteredInsuranceScheme += " " + sc.next(); // taking space input
				for(Map.Entry m: employees.entrySet()){
					ArrayList searchList = (ArrayList) m.getValue(); // Array list to search for insurance scheme
					if(searchList.contains(enteredInsuranceScheme))
						System.out.println(m.getKey() + " " + m.getValue());
				}
				break;
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			case 3:
				System.out.println("Enter emp id to delete the employee");
				int enteredID = sc.nextInt();
				employees.remove(enteredID);
				System.out.println("Removed employee Successfully");
				System.out.println(employees);
				break;
				
			case 4:
				System.out.println("Thank you!!");
				stop = true;
			}	
		}
	}

}
