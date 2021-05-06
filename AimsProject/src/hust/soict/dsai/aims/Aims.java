package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
		anOrder.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		anOrder.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addMedia(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("OnePiece","Animation",69.96f);
		anOrder.addMedia(dvd4);
		anOrder.addMedia(dvd4);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.addMedia(dvd1, dvd2);
		
	}

}
