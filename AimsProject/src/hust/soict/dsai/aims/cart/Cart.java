package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMS_ORDERED = 20;
	private static float cost = 0.0f;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private static int qtyOrdered;
	
	public void addMedia(Media media) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered.add(media);
			System.out.println("The media has been added");
			qtyOrdered ++;
		}
	}


	public void addMedia(Media...media) {
		if (qtyOrdered + media.length >= 21) {
			System.out.println("Exceeds the permitted limits");
		}
		else {
			for (int i = 0;i<media.length;i++) {
				System.out.println("The media has been added");
				itemsOrdered.add(media[i]);
				qtyOrdered ++;
				}
			}
		}

	public void  removeMedia(Media media) {
		boolean check = true;
		ArrayList<Media> copy = new ArrayList<Media>();
		if (qtyOrdered == 0) {
			System.out.println("No media in cart");
			return;
		}
		
		for (int i = 0; i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i).getID() == media.getID() && itemsOrdered.get(i).getTitle().equals(media.getTitle())) {
				System.out.println(media.getTitle());
				check = false;
				itemsOrdered.set(i,null);
				qtyOrdered -=1;
				for (int j = 0;j<itemsOrdered.size();j++) {
					if (itemsOrdered.get(j) != null) {
						copy.add(itemsOrdered.get(j));
					}
				}
				itemsOrdered = new ArrayList<Media>();
				for (int m = 0; m < copy.size();m++) {
					itemsOrdered.add(copy.get(m));
				}
				
				System.out.println("The media has been removed");
				break;
				}
			
			}
		
		if (check == true) {
			System.out.println("The media is not in cart");
		}
	}
	
	public float totalCost() {
		for (int i = 0; i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i) != null)
				cost += itemsOrdered.get(i).getCost();
		}
		return cost;
	}

	public void print() {
		int stt = 0;
		System.out.println("***********************CART***********************");
		for (int i = 0; i <itemsOrdered.size();i++ ) {
			if (itemsOrdered.get(i) != null) {
				stt++;
				System.out.print(stt+". ");
				itemsOrdered.get(i).getDetail();
			}
		}
		System.out.println("Total Cost: "+totalCost());
		System.out.println("***************************************************");
	}
	
	public void search(int id) {
		boolean check = false;
		for (int i =0;i< itemsOrdered.size();i++) {
			if (itemsOrdered.get(i).getID() == id) {
				check = true;
				itemsOrdered.get(i).getDetail();
				break;
			}
		}
		if (check == false) {
			System.out.println("no match is found");
		}
	}
	
	public void search(String title) {
		boolean check = false;
		for (int i =0;i< itemsOrdered.size();i++) {
			if(itemsOrdered.get(i) != null) {
			if (itemsOrdered.get(i).search(title)) {
				check = true;
				itemsOrdered.get(i).getDetail();
				break;
			}
		}
	}
		if (check == false) {
			System.out.println("no match is found");
		}
	}
	
}
