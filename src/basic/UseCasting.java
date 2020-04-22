package basic;

public class UseCasting {

	public static void main(String[] args) {

		// Casting: converting Data type

		double salary = 5000.500;

		int newSalary = (int) salary;
		System.out.println(newSalary);

		int aprilSalary = (int) salary;

		int number1 = 420;
		int number2 = 500;

		int number3 = number2; // Dynamically Assign from number2

		int number4 = number3 + number1;
		int number5 = number4 * 5;

		System.out.println("Number5 Value is " + number5);

	}

}
