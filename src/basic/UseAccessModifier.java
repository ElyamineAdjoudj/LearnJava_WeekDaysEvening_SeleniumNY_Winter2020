package basic;

public class UseAccessModifier {

	// Access Modifier/ Access Specifier: class,variable,method
	// Private: only we can call or use within the class where it is located.
	// Public: we can call or use within the class where it is located and from any
	// other class.
	// Protected: only accessible from all the class of that particular package.

	// Access modifier:

	// Public
	// Private
	// Protected
	// Default

	// AccessModier DataType varaibleName = varaibleValue
	public static String name = "James William";
	private static String ssn = "567-232-457";
	protected static int mobileNumber = 466856988;

	String fName = "James";

	public static void main(String[] args) {
		// ctrl+space >> Hit Enter

		System.out.println(UseAccessModifier.ssn);

	}

}
