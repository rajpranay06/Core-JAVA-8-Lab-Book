package lab9;

import java.util.*;

@FunctionalInterface
interface SetName{
	public void setName(String name);
	
}

@FunctionalInterface
interface SetId{
	public void setId(int id);
}

@FunctionalInterface
interface GetName{
	public String getName();
}

@FunctionalInterface
interface GetId{
	public int getId();
}

class Employee{
	
	String name;
	int id;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
}



public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		// InstanceMethodReference to set name
		SetName empSetName = emp :: setName;
		empSetName.setName("Rohit");
		
		// InstanceMethodReference to get name
		GetName empGetName = emp :: getName;
		System.out.println(empGetName.getName());
		
		// InstanceMethodReference to set id
		SetId empSetId = emp :: setId;
		empSetId.setId(101);
		
		// InstanceMethodReference to get id
		GetId empGetId = emp :: getId;
		System.out.println(empGetId.getId());
	}

}
