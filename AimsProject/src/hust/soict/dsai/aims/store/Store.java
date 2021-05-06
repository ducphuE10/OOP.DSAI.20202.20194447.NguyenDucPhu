package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		itemsInStore.add(media);
		System.out.println("The media has been added");
	}
	public void addMedia(Media...medium){
		for (int i = 0; i < medium.length;i++) {
			itemsInStore.add(medium[i]);
		}
		System.out.println("The medium has been added");
		}

	public void  removeMedia(Media media) {
		if (itemsInStore.size() == 0) {
			System.out.println("No item in Store");
		}
		else {
			boolean check = true;
			ArrayList<Media> copy = new ArrayList<Media>();
			
			for (int i = 0; i<itemsInStore.size();i++) {
				if (itemsInStore.get(i).getID() == media.getID() && itemsInStore.get(i).getTitle().equals(media.getTitle())) {
					System.out.println(media.getTitle());
					check = false;
					itemsInStore.set(i,null);
					for (int j = 0;j<itemsInStore.size();j++) {
						if (itemsInStore.get(j) != null) {
							copy.add(itemsInStore.get(j));
						}
					}
					
					itemsInStore = new ArrayList<Media>();
					for (int m = 0; m < copy.size();m++) {
						itemsInStore.add(copy.get(m));
					}
					System.out.println("The media has been removed");
					break;
					}
				
				}
			
			if (check == true) {
				System.out.println("The media is not in store");
			}
		}
	}
}
