package day4;

public abstract class WrittenItem extends Item{
	
	private String author;

	public abstract void setId(String id);

	public abstract String getId();

	public abstract void setTitle(String title);

	public abstract String getTitle();

	public abstract void setNoOfCopies(int n);

	public abstract int getNoOfCopies();

	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return author;
	}
	
}
