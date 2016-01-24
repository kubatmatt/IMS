package inventory;

import java.util.Date;
import java.util.HashMap;

public class Sale {
	private Date date;
	private Customer customer;
	private HashMap<Item, Integer> itemsSold;
	public Sale(Date date, Customer customer) {
		this.setDate(date);
		this.setCustomer(customer);
	}
	public void addItemSold(Item item, int quantity){
		itemsSold.put(item, quantity);
	}
	public void removeItem(Item item){
		itemsSold.remove(item);
	}
	public void changeQuantity(Item item, int quantity){
		itemsSold.replace(item, quantity);
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
