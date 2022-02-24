package com.cg.eis.bean;

public class Employee {
	
	public int id;
	public String name, designation, insuranceScheme;
	public double salary;
	
	public Employee(int id,String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString(){
		return ("Employee [ name = " + name + ", designation = "+ designation + ", salary = "+ salary +", insurance scheme = "+ insuranceScheme +" ]");
	}
}
