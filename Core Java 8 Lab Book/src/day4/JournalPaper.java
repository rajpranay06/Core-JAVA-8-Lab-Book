package day4;

public class JournalPaper extends WrittenItem{

	private String publishedYear;
	String title ;
	
	public void setPublishedYear(String year){
		publishedYear = year;
	}
	public String getPublishedYear(){
		return publishedYear;
	}
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
		return id;
	}
	@Override
	public void setNoOfCopies(int n) {}
	@Override
	public int getNoOfCopies() {
		return -1;
	}
}
