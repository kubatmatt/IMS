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
	}

}
