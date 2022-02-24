package multilevelInheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		Child child = new Child();
		GrandChild gc = new GrandChild();
		
		System.out.println(parent.familyName);
		System.out.println(child.familyName);
		System.out.println(gc.familyName);
		
		parent.getName();
		child.getName();
		gc.getName();
	}

}
