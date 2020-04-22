package basic;

public class UseDataType {

	/*
	 * Data Type: Premitive boolean char
	 * 
	 * byte int short long
	 * 
	 * double float
	 * 
	 * 
	 * 
	 * Non-Premitive Stings Arrays Objects
	 * 
	 */

	byte age = 127;
	int number = 45;
	private int number1 = 46;
	short dailySale = 5987;
	long annualSale = 111811111184909080l;

	double salary = 5000.500;
	float courseFee = 4500.500f;

	boolean isInStock = true;
	char nameStartWith = 'S';

	// Non Premitive Data type
	String fullName = "James William 654654683516846 654896641";
	String samirfullName = "Samir";
	String nafisfullName = "Nafis";
	String aghilesfullName = "Aghiles";
	String fouadName = "Fouad";

	public static void main(String[] args) {
		UseDataType use = new UseDataType();
		// con-cat-e-nate: concatenate +
		System.out.println("Full Name is " + use.fullName);
		System.out.println("Fouad Full name is " + use.fouadName);

	}

}
