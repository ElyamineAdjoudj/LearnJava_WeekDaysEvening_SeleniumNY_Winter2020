package operators;

public class EqualityAndRelationalOperator {

	// == Equal to
	// != not Equal
	// > Grater than
	// >= Grater than Equal
	// < Less than
	// <= Less than Equal

	public static void main(String[] args) {

		int number1 = 39;
		int number2 = 49;

		if (number1 == number2) {
			System.out.println("Number1 and Number2 are Equal");
		}

		if (number1 != number2) {
			System.out.println("Number1 and Number2 are Not Equal");
		}

		if (number1 > number2) {
			System.out.println("Number1 is Grater than Number2");
		}

		if (number1 >= number2) {
			System.out.println("Number1 is Grater than Equal Number2");
		}

		if (number1 < number2) {
			System.out.println("Number1 is Less than Number2");
		}

		if (number1 <= number2) {
			System.out.println("Number1 is Less than Equal Number2");
		}

	}

}
