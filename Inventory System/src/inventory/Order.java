package inventory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Order {
	static ArrayList<Order> masterOrderList = new ArrayList<Order>();
	
	//add functionality to this^^^^^^^^^^^^^
	private HashMap<Item, Integer> itemMap = new HashMap<Item, Integer>();
	private Customer customer;
	private Date datePlaced;
	private Date releaseDate;
	private boolean hasShipped;
	private static int currentOrderNumber=0;
	private int orderNumber=currentOrderNumber++;

	public Order(Customer customer, Date datePlaced) {
		this.customer = customer;
		this.datePlaced = datePlaced;
	}

	public void addItem(Item item, int quantity) {
		itemMap.put(item, quantity);
	}

	public void removeItem(Item item) {
		itemMap.remove(item);
	}

	public void changeQuantity(Item item, int quantity) {
		if (quantity > 0) {
			itemMap.replace(item, quantity);
		} else {
			removeItem(item);
		}
	}
	public Customer getCustomer(){
		return this.customer;
	}
	public Date getDatePlaced(){
		return this.datePlaced;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isHasShipped() {
		return hasShipped;
	}

	public void setHasShipped(boolean hasShipped) {
		this.hasShipped = hasShipped;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

}
