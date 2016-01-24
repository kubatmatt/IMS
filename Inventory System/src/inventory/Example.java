package inventory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import inventory.Item;;

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
		
		Item item = new Item();
		item.setName("DPH82");
		item.setLocation("BIN10");
		item.setQuantity(20);
		
		System.out.println(item.getItemID());
		
		Item item1 = new Item.masterItemList.get(0);
	}

}
