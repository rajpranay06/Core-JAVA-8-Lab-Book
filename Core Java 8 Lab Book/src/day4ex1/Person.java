package day4ex1;

public class Person {
	String name;
	int age;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public String toString(){
		return ( " Person [ Name = " + name + " Age = " + age + " ]");
	}
}
