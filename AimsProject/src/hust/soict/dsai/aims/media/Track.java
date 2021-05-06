package hust.soict.dsai.aims.media;

public class Track implements Playable{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	private String title;
	private int length;
	public Track(String title) {
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public int getLength() {
		return length;
	}
	
}
