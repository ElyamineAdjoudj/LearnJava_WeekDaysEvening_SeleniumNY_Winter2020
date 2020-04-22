package basic;

public class UseVariable {

	// Variable: varaible is a container which can hold value

	// Variable Type:
	/**
	 * Variable: Local variable: inside of a method Global variable/ Instance
	 * variable/ Reference variable: inside of a class but outside of method Class
	 * Variable: static keyword is used
	 * 
	 */

	// if variable and method is static then you can call those variable and method
	// by its class name.
	// if variable and method is non-static then you can call those variable and
	// method by its object name.

	// Integer is a data type

	// DataType variableName = value;

	// Non static Gloabal variable
	int x = 5;
	int p = 7;

	// class variable
	static int z = 10;

	// Declare variable
	int a;
	// Declare and Initialize value
	int b = 80;

	// Constant variable:
	String MAX_WIDTH = "44";
	final String MIN_WIDTH = "36";

	public static void main(String[] args) {
		// local variable
		int y = 6;
		System.out.println(UseVariable.z);

		// Always Need to create a object then call it by object name

		// ClassName objectName = new constructorOfClass();

		UseVariable obj = new UseVariable();
		// obj.p = 14;
		System.out.println(obj.p); // call by object name
		obj.p = 33; // Re-Assign/ Re-Initialize value
		System.out.println(obj.p); // 33
		obj.a = 55;
		System.out.println(obj.a);
		obj.p = 34;
		System.out.println(obj.p); // 34

		obj.MAX_WIDTH = "46";
		System.out.println(obj.MAX_WIDTH);

		// obj.MIN_WIDTH="32"; // we can not re-Initialize

	}

}
