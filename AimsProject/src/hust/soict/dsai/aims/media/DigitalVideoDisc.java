package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc {
	private String director;
	private int length;
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
		super(title,category,cost);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.director = director;
		
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,cost);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.director = director;
		this.length = length;

		
	}
	public void setTitle(String title) {
		super.setTitle(title);
	}
	public String getDirector() {
		return director;
	}


	public int getID() {
		return id;
	}
	public void getDetail() {
		System.out.printf("DVD -  %s - %s - %s - %d: %f $\n",super.getTitle(),
				super.getCategory(),director,length,super.getCost());
	}
	
	public boolean search(String title) {
        return super.getTitle().contains(title);
    }
		
	
}

