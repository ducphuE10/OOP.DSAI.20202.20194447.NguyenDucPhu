public class Cart {
	public static final int MAX_NUMS_ORDERED = 20;
	private static float cost = 0.0f;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMS_ORDERED];
	private static int qtyOrdered;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
	}
	public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean check = true;
		DigitalVideoDisc copy[] = new DigitalVideoDisc[MAX_NUMS_ORDERED];
		if (qtyOrdered == 0) {
			System.out.println("No disc in cart");
			return;
		}
		for (int i = 0; i<itemsOrdered.length;i++) {
			if (itemsOrdered[i] == disc) {
				check = false;
				itemsOrdered[i] = null;
				qtyOrdered -=1;
				for (int j = 0,k=0;j<copy.length;j++) {
					if (itemsOrdered[j] != null) {
						copy[k++] = itemsOrdered[j];
					}
				}
				itemsOrdered = copy;
				System.out.println("The disc has been removed");
				break;
				}
			}
		if (check == true) {
			System.out.println("The disc is not in cart");
		}
	}
	public float totalCost() {
		for (int i = 0; i<itemsOrdered.length;i++) {
			if (itemsOrdered[i] != null)
				cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
	
	
}
