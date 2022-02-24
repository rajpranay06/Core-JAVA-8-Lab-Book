package multilevelInheritance;

public class Child extends Parent{

	String childName = "Robb";
	int id = 102;
	String status = "Employeed";
	void getName(){
		super.getName();
		System.out.println("This is Child class");
	}
}
