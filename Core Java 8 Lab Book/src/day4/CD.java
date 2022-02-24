package day4;

public class CD extends MediaItem{
	
	private String artist,genre;

	@Override
	public void setRuntime(int runtime) {
		super.runtime = runtime;
		
	}

	@Override
	public int getRuntime() {
		return super.runtime;
		
	}
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	public String getArtist(){
		return artist;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	public String getGenre(){
		return genre;
	}
}
