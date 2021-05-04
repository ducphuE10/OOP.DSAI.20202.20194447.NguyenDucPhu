package hust.soict.dsai.aims.media;

public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private String date;

	public Media(String title) {
		this.title = title;
	}

	public Media( String title,String category, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}