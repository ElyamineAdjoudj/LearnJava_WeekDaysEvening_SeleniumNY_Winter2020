package basic;

public class UseObject {

	// Object:

	public static void main(String[] args) {
		// ClassName objectName = new ConstructorOfClass();

		UseDataType dataType = new UseDataType();
		System.out.println(dataType.salary);
		dataType.salary = 4800.50;

		UseAccessModifier uam = new UseAccessModifier();
		System.out.println(uam.mobileNumber);

	}

}
