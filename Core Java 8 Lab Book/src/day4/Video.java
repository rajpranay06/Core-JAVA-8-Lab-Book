package day4;

public class Video extends MediaItem{
	
	private String director,genre;
	private int year;

	@Override
	public void setRuntime(int runtime) {
		super.runtime = runtime;
		
	}

	@Override
	public int getRuntime() {
		return super.runtime;
		
	}
	
	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	public String getGenre(){
		return genre;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	

}
