package basic;

public class UseConcatenation {

	public static void main(String[] args) {
		UseDataType use = new UseDataType();
		// con-cat-e-nate: concatenate +
		System.out.println("Full Name is " + use.fullName);
		System.out.println("Fouad Full name is " + use.fouadName);

		String fName = "James";
		String lName = "William";
		String fullName = fName + " " + lName;

		System.out.println("Full Name is " + fullName);

	}
}
