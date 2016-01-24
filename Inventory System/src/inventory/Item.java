//// Implement Builder pattern or factory
//// Need better constructors


/// Past usage method
package inventory;

import java.util.ArrayList;


public class Item {
	private String name;
	private static ArrayList<Item> masterItemList;
	private int itemID;
	private String location;
	private String description;
	private int quantity;
	private int quantityAllocated;
	private int quantityBackordered;
	private ArrayList<IncomingShipment> datesReceived;
	
	
	public Item(String name) {
		this.name = name;
	}

	public Item(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public Item(String name, String location, String description) {
		this.name = name;
		this.location = location;
		this.description = description;
	}
	public void shipmentReceived(IncomingShipment in){
		datesReceived.add(in);
	}
	//Probably shouldn't be used
	public void removeShipment(IncomingShipment in){
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

}
