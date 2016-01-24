//// Implement Builder pattern or factory
//// Need better constructors

/// Past usage method
package inventory;

import java.util.ArrayList;

public class Item {
	//Required
	private static int itemID = 0;
	private int thisItemID = ++itemID;
	public static ArrayList<Item> masterItemList = new ArrayList<>();
	
	private String name;
	private int quantity;
	//Not necessarily required
	private String location;
	private String description;
	private int quantityAllocated;
	private int quantityBackordered;
	private ArrayList<IncomingShipment> datesReceived = new ArrayList<>();

	public static class Builder{
		private String name;
		private int quantity;
		
		//optional
		private String location="no location set";
		private String description="no description";
		
		public Builder(String name, int quantity){
			this.name=name;
			this.quantity=quantity;
		}
		public Builder location(String value){
			location=value;
			return this;
		}
		public Builder description(String value){
			description=value;
			return this;
		}
		public Item build(){
			return new Item(this);
		}
		
	}private Item(Builder builder){
		name=builder.name;
		quantity=builder.quantity;
		location=builder.location;
		description=builder.description;
		masterItemList.add(this);
		
	}

	public void shipmentReceived(IncomingShipment in) {
		datesReceived.add(in);
	}

	// Probably shouldn't be used
	public void removeShipment(IncomingShipment in) {
		datesReceived.remove(in);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantityAllocated() {
		return quantityAllocated;
	}

	public void setQuantityAllocated(int quantityAllocated) {
		this.quantityAllocated = quantityAllocated;
	}

	public int getQuantityBackordered() {
		return quantityBackordered;
	}

	public void setQuantityBackordered(int quantityBackordered) {
		this.quantityBackordered = quantityBackordered;
	}

	public int getItemID() {
		return thisItemID;
	}
}
