package hasARelationship;

public class Person {

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Address add = new Address("Mumbai", "Maharastra");
	public String toString(){
		return "Person [ name : " + name + " age : " + age + add + " ]";
	}
}
