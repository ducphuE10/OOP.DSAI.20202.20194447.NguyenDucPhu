package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Disc implements Playable {
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		
	}
	public DigitalVideoDisc(String title,String category, float cost) {
		super(title,category,cost);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;

	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,director,cost);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;

	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,director,length,cost);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
	}
	
	public int getID() {
		return id;
	}

	public void getDetail() {
		System.out.printf("DVD -  %s - %s - %s - %d: %f $\n",super.getTitle(),
				super.getCategory(),super.getDirector(),super.getLength(),super.getCost());
	}
	public boolean search(String title) {
        return super.getTitle().contains(title);
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}

