package lab9;

import java.time.LocalDate;
import java.util.*;

public class EmployeeRepository {
	
	// Collection which stores all the employee details
	static ArrayList<ArrayList> employeeDB = new ArrayList<>();
			
	// Collection to store Departments Details
	static HashSet<ArrayList> departmentDB = new HashSet<>();
	
	public static void setEmployeeDetails() {
		// TODO Auto-generated method stub
		
		Employee_Lab9 emp1 = new Employee_Lab9();
		
		emp1.setEmp_id(101);
		emp1.setFirstName("Rohit");
		emp1.setLastName("Sharma");
		emp1.setEmail("rohitsharma45@gmail.com");
		emp1.setPhoneNumber("9976543670");
		emp1.setHireDate(LocalDate.of(2017, 5, 25));
		emp1.setDesignation("Team Lead");
		emp1.setSalary(200000);
		emp1.setManagerId(501);
		emp1.department.setDepartmentId(1200);
		emp1.department.setDepartmentName("Product Development");
		emp1.department.setManagerId(501);
		
		Employee_Lab9 emp2 = new Employee_Lab9();
		
		emp2.setEmp_id(102);
		emp2.setFirstName("Virat");
		emp2.setLastName("Kohli");
		emp2.setEmail("viratkohli18@gmail.com");
		emp2.setPhoneNumber("9815265101");
		emp2.setHireDate(LocalDate.of(2019, 11, 5));
		emp2.setDesignation("Team Lead");
		emp2.setSalary(100000);
		emp2.department.setDepartmentId(1300);
		emp2.department.setDepartmentName("Learning & Development");
		
		Employee_Lab9 emp3 = new Employee_Lab9();
		
		emp3.setEmp_id(103);
		emp3.setFirstName("Jasprit");
		emp3.setLastName("Bumrah");
		emp3.setEmail("jaspritbumrah93@gmail.com");
		emp3.setPhoneNumber("9815269027");
		emp3.setHireDate(LocalDate.of(2020, 8, 25));
		emp3.setDesignation("Developer");
		emp3.setSalary(120000);
		emp3.setManagerId(501);
		emp3.department.setDepartmentId(1200);
		emp3.department.setDepartmentName("Product Development");
		emp3.department.setManagerId(501);
		
		Employee_Lab9 emp4 = new Employee_Lab9();
		
		emp4.setEmp_id(501);
		emp4.setFirstName("Sachin");
		emp4.setLastName("Tendulkar");
		emp4.setEmail("sachinTendulkar@gmail.com");
		emp4.setPhoneNumber("9815243682");
		emp4.setHireDate(LocalDate.of(2014, 4, 24));
		emp4.setDesignation("Manager");
		emp4.setSalary(2000000);
		emp4.department.setDepartmentId(1200);
		emp4.department.setDepartmentName("Product Development");
		
		Employee_Lab9 emp5 = new Employee_Lab9();
		
		emp5.setEmp_id(107);
		emp5.setFirstName("Surya");
		emp5.setLastName("Kumar");
		emp5.setEmail("sky77@gmail.com");
		emp5.setPhoneNumber("9675326111");
		emp5.setHireDate(LocalDate.of(2021, 8, 15));
		emp5.setDesignation("Contract");
		emp5.setSalary(120000);
		emp5.setManagerId(501);
		emp5.department.setManagerId(501);
		
		Department dept1 = new Department();
		
		dept1.setDepartmentId(1500);
		dept1.setDepartmentName("Testing");
		dept1.setManagerId(901);
		
		// Array list which stores individual employee details
		ArrayList individualEmployee1 = new ArrayList();
		
		individualEmployee1.add(emp1.getEmp_id());
		individualEmployee1.add(emp1.getManagerId());
		individualEmployee1.add(emp1.getFirstName());
		individualEmployee1.add(emp1.getLastName());
		individualEmployee1.add(emp1.getEmail());
		individualEmployee1.add(emp1.getDesignation());
		individualEmployee1.add(emp1.getPhoneNumber());
		individualEmployee1.add(emp1.getSalary());
		individualEmployee1.add(emp1.getHireDate());
		individualEmployee1.add(emp1.department.getDepartmentId());
		individualEmployee1.add(emp1.department.getManagerId());
		individualEmployee1.add(emp1.department.getDepartmentName());
		
		employeeDB.add(individualEmployee1);
		
		ArrayList individualEmployee2 = new ArrayList();
		
		individualEmployee2.add(emp2.getEmp_id());
		individualEmployee2.add(emp2.getManagerId());
		individualEmployee2.add(emp2.getFirstName());
		individualEmployee2.add(emp2.getLastName());
		individualEmployee2.add(emp2.getEmail());
		individualEmployee2.add(emp2.getDesignation());
		individualEmployee2.add(emp2.getPhoneNumber());
		individualEmployee2.add(emp2.getSalary());
		individualEmployee2.add(emp2.getHireDate());
		individualEmployee2.add(emp2.department.getDepartmentId());
		individualEmployee2.add(emp2.department.getManagerId());
		individualEmployee2.add(emp2.department.getDepartmentName());
		
		employeeDB.add(individualEmployee2);
		
		ArrayList individualEmployee3 = new ArrayList();
		
		individualEmployee3.add(emp3.getEmp_id());
		individualEmployee3.add(emp3.getManagerId());
		individualEmployee3.add(emp3.getFirstName());
		individualEmployee3.add(emp3.getLastName());
		individualEmployee3.add(emp3.getEmail());
		individualEmployee3.add(emp3.getDesignation());
		individualEmployee3.add(emp3.getPhoneNumber());
		individualEmployee3.add(emp3.getSalary());
		individualEmployee3.add(emp3.getHireDate());
		individualEmployee3.add(emp3.department.getDepartmentId());
		individualEmployee3.add(emp3.department.getManagerId());
		individualEmployee3.add(emp3.department.getDepartmentName());
		
		employeeDB.add(individualEmployee3);
		
		ArrayList individualEmployee4 = new ArrayList();
		
		individualEmployee4.add(emp4.getEmp_id());
		individualEmployee4.add(emp4.getManagerId());
		individualEmployee4.add(emp4.getFirstName());
		individualEmployee4.add(emp4.getLastName());
		individualEmployee4.add(emp4.getEmail());
		individualEmployee4.add(emp4.getDesignation());
		individualEmployee4.add(emp4.getPhoneNumber());
		individualEmployee4.add(emp4.getSalary());
		individualEmployee4.add(emp4.getHireDate());
		individualEmployee4.add(emp4.department.getDepartmentId());
		individualEmployee4.add(emp4.department.getManagerId());
		individualEmployee4.add(emp4.department.getDepartmentName());
		
		employeeDB.add(individualEmployee4);
		
		ArrayList individualEmployee5 = new ArrayList();
		
		individualEmployee5.add(emp5.getEmp_id());
		individualEmployee5.add(emp5.getManagerId());
		individualEmployee5.add(emp5.getFirstName());
		individualEmployee5.add(emp5.getLastName());
		individualEmployee5.add(emp5.getEmail());
		individualEmployee5.add(emp5.getDesignation());
		individualEmployee5.add(emp5.getPhoneNumber());
		individualEmployee5.add(emp5.getSalary());
		individualEmployee5.add(emp5.getHireDate());
		individualEmployee5.add(emp5.department.getDepartmentId());
		individualEmployee5.add(emp5.department.getManagerId());
		individualEmployee5.add(emp5.department.getDepartmentName());
		
		employeeDB.add(individualEmployee5);
		
		// Array List to store individual department details
		ArrayList individualDepartment1 = new ArrayList<>();
		
		individualDepartment1.add(emp1.department.getDepartmentId());
		individualDepartment1.add(emp1.department.getManagerId());
		individualDepartment1.add(emp1.department.getDepartmentName());
		
		departmentDB.add(individualDepartment1);

		ArrayList individualDepartment2 = new ArrayList<>();
		
		individualDepartment2.add(emp2.department.getDepartmentId());
		individualDepartment2.add(emp2.department.getManagerId());
		individualDepartment2.add(emp2.department.getDepartmentName());
		
		departmentDB.add(individualDepartment2);

		ArrayList individualDepartment3 = new ArrayList<>();
		
		individualDepartment3.add(dept1.getDepartmentId());
		individualDepartment3.add(dept1.getManagerId());
		individualDepartment3.add(dept1.getDepartmentName());
		
		departmentDB.add(individualDepartment3);
		
//		employeeDB.forEach(s -> System.out.println(s));
//		System.out.println();
//		departmentDB.forEach(s -> System.out.println(s));
	}

}
