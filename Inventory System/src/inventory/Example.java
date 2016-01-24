package inventory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Example {

	public Example() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<String>();
		x.add("one");
		x.add("two");
		
		System.out.println(x.get(x.size()-1));
		
		
		
		//Use this for date formatting
		DateFormat format = new SimpleDateFormat("MM/dd/yy");
		Date date = new Date();
		System.out.println(format.format(date));
		
		
		//OLD constructor VVVV
		
//		//Testing arraylist updating
		
//		Item item = new Item("DPH");
////		item.setName("DPH82");
//		item.setLocation("BIN10");
//		item.setQuantity(20);
//		
//		Item item1 = new Item();
//		item1 =Item.masterItemList.get(0);
//		System.out.println(item1.getName());
//		System.out.println(item1.getItemID());
		
		Item item = new Item.Builder("DPH", 100).location("A10").build();
		Item item1 = new Item.Builder("DPH1", 100).location("A10").description("1 inch phenolic wheel").build();
		Item item2 = new Item.Builder("DPH2", 100).location("A10").description("2 inch phenolic wheel").build();
		System.out.println(item.getDescription());
		System.out.println(item.getItemID());
		System.out.println(Item.masterItemList.get(0).getItemID());
		System.out.println(item1.getDescription());
		System.out.println(item1.getItemID());
		System.out.println(Item.masterItemList.get(1).getItemID());
		System.out.println(item2.getDescription());
		System.out.println(item2.getItemID());
		System.out.println(Item.masterItemList.get(2).getItemID());
	}

}
