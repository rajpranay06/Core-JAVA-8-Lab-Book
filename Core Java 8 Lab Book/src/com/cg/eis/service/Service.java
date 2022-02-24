package com.cg.eis.service;

import com.cg.eis.bean.Employee;

interface EmployeeService{
	
	final double salLevel1 = 40000;
	final double salLevel2 = 20000;
	final double salLevel3 = 5000;
	
	public void setDesignation();
	public void setInsuranceScheme();
}
public class Service extends Employee implements EmployeeService {

	public Service(int id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setDesignation() {
		if(super.salary >= salLevel1){
			super.designation = "System Associate";
		}
		else if(super.salary >= salLevel2){
			super.designation = "Programmer";
		}
		else if(super.salary >= salLevel3){
			super.designation = "Manager";
		}
		else{
			super.designation = "Clerk";
		}
	}

	@Override
	public void setInsuranceScheme() {
		if(super.salary >= salLevel1){
			super.insuranceScheme = "Scheme A";
		}
		else if(super.salary >= salLevel2){
			super.insuranceScheme = "Scheme B";
		}
		else if(super.salary >= salLevel3){
			super.insuranceScheme = "Scheme C";
		}
		else{
			super.insuranceScheme = "No Scheme";
		}
		
	}
	public String toString(){
		return super.toString();
	}
	
	
}
