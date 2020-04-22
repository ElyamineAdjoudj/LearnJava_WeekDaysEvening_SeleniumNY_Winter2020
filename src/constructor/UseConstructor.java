package constructor;

public class UseConstructor {

	// Constructor Name will be same as Class Name.
	// Constructor Has no Return Type
	// Constructors are used to initialize the object.
	// Before creating Parameterize constructor we must have to create Default
	// constructor

	// Deafult/ non Parametarized Constructor
	// Parametarized Constructor

	// AccessModifier className(){ }

	// Declare Variable
	String name;
	String address;
	int id;

	public UseConstructor() {
		// default constructor
		// System.out.println("Hello World");
	}

	public UseConstructor(String name) {
		// Signature pattern/ Parameter: Single Parametarized constructor
		// Dynamic constructor
		this.name = name;
		System.out.println("Name is " + this.name);
	}

	public UseConstructor(String newName, String address) {
		// Signature pattern/ Parameter: Multiple Parametarized constructor
		this.name = newName;// assign value by calling local variable
		this.address = address;
		System.out.println("Name is " + this.name + " " + "Address is " + this.address);

	}

	public static void main(String[] args) {

		// Create a object of UseConstructor class

		// className objectName= new constructorOfClass
		UseConstructor obj = new UseConstructor();

		UseConstructor samirObj = new UseConstructor("Samir");

		UseConstructor aghilesObj = new UseConstructor("Aghilesh", "Queens,NY"); // Argument passing

	}

}
