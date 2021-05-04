package hust.soict.dsai.aims.media;

import java.util.ArrayList;

class Track{
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

public class CompactDisc extends Disc {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title) {
		super(title);
	}
	
	public void addTrack(Track t) {
		boolean check = true;
		for (int i = 0; i < tracks.size();i++) {
			if (t.getTitle().equals(tracks.get(i).getTitle())) {
				check = false;
				break;
			}
		}
		if (check =true) tracks.add(t);
		else System.out.println("already in");
	}
	
	public void removeTrack(Track t) {
		boolean check = true;
		for (int i = 0; i < tracks.size();i++) {
			if (t.getTitle().equals(tracks.get(i).getTitle())) {
				check = false;
				break;
			}
		}
		if (check =false) tracks.remove(t);
		else System.out.println("not exits");
	}
	public int getLength() {
		int sum = 0;
		for (int i = 0; i < tracks.size();i++) {
			sum += tracks.get(i).getLength();
		}
		return sum;
	}
	
}
