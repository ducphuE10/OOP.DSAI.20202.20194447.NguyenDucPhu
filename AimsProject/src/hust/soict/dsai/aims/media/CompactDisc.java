package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.Track;
import java.util.ArrayList;



public class CompactDisc extends Disc implements Playable {
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

	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (int i = 0; i < tracks.size();i++) {
			tracks.get(i).play();
		}
	}

	public void getDetail() {
		System.out.printf("CD - "+super.getTitle() +" - "+super.getCategory() + " - "+ artist + " - "+ super.getDirector()
		+" - "+ getLength()+ " - " + super.getCost());
	}
	
}
