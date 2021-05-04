package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}

	
	
}