package lab9;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeRepository emp = new EmployeeRepository();
		
		//Adding employee Details
		emp.setEmployeeDetails();
		
		// Converting collection to stream
		Stream employees = emp.employeeDB.stream();
		
		// Sum of salary of all employees using stream API
		System.out.println(employees);
	}

}
