package inventory;

public class PhoneNumber {
	private long numericNumber;
	private String stringNumber;
	public PhoneNumber(String number) {
		String temp = number.replaceAll("[^0-9]", "");
		this.stringNumber=temp;
		this.numericNumber = Long.parseLong(temp);
	}
	public long getNumericNumber() {
		return numericNumber;
	}
	public void setNumericNumber(int intNumber) {
		this.numericNumber = intNumber;
	}
	public String getStringNumber() {
		return stringNumber;
	}
	public void setStringNumber(String stringNumber) {
		this.stringNumber = stringNumber;
	}

}
