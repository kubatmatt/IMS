package inventory;

import java.util.Date;

public class IncomingShipment {
	private Date date;
	private int quantity;
	private Item item;
	private Customer sender;
	
	public IncomingShipment() {
		
	}
	public IncomingShipment(Date date, int quantity, Item item){
		this.date=date;
		this.quantity=quantity;
		this.item=item;
	}
	public IncomingShipment(Date date, int quantity, Item item, Customer sender){
		this.date=date;
		this.quantity=quantity;
		this.item=item;
		this.sender=sender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	public Customer getSender() {
		return sender;
	}
	public void setSender(Customer sender) {
		this.sender = sender;
	}

}
