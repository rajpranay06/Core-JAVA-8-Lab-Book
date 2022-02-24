package day4;

public abstract class Item {

	String id;
	String title;
	int noOfCopies;
	
	public abstract void setId(String id);
	public abstract String getId();
	public abstract void setTitle(String title);
	public abstract String getTitle();
	public abstract void setNoOfCopies(int n);
	public abstract int getNoOfCopies();
	
}
