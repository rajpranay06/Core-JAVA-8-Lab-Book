package day4;

public class Book extends WrittenItem{
	
	String title;

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	@Override
	public void setId(String id) {
		super.id = id;
		
	}
	@Override
	public String getId() {
		return super.id;
	}
	@Override
	public void setNoOfCopies(int n) {
		super.noOfCopies = noOfCopies;
		
	}
	@Override
	public int getNoOfCopies() {
		return super.noOfCopies;
	}
}
