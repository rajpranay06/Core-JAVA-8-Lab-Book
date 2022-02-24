package multilevelInheritance;

public class GrandChild extends Child{
	
	String grandChildName = "Jacob";
	int id = 103;
	String collegeId = "T67H0";
	void getName(){
		super.getName();
		System.out.println("This is Grand Child class");
	}
}
