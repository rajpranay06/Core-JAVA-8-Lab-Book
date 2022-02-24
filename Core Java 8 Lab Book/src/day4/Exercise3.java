package day4;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();
		book.setId("12BL4H9");
		book.setAuthor("J.K Rowling");
		book.setNoOfCopies(1000);
		book.setTitle("Harry Potter");
		
		JournalPaper jp = new JournalPaper();
		jp.setId("89JLP67");
		jp.setAuthor("Kiran");
		jp.setPublishedYear("2020");
		jp.setTitle("Covid19");
		
		System.out.println(book.getId() + " " + book.getAuthor() + " " + book.getTitle() + " " + book.getNoOfCopies());
		System.out.println(jp.getId() + " " + jp.getAuthor() + " " + jp.getTitle() + " " + jp.getPublishedYear() );
	
		Video video = new Video();
		video.setDirector("Christopher Nolan");
		video.setGenre("Fantasy");
		video.setRuntime(220);
		video.setYear(2020);
		
		CD cd = new CD();
		cd.setArtist("Anurag");
		cd.setGenre("Melody");
		cd.setRuntime(5);
		
		System.out.println(video.getDirector() + " " + video.getGenre() + " " + video.getYear() + " " + video.getRuntime());
		System.out.println(cd.getArtist() + " " + cd.getGenre() + " " + cd.getRuntime());
		
	}

}
