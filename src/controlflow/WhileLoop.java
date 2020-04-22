package controlflow;

public class WhileLoop {

	// While loop is used in situations where we do not know how many times loop
	// needs to be excuted beforehand.
	// For loop is used where we already know about the number of times loop needs
	// to be excuted. Typically for a index used in iteration.

	// While Loop: pre condition check
	// while(condition){ ++ or -- }

	public static void main(String[] args) {

		int x = 45;
		int y = 20;

		// while(condition){ ++ or -- }

		while (x > 40) {
			System.out.println("We are learning While Loop");
			x--;

			while (y < 25) {
				System.out.println("Nested while loop");
				y++;
			}
		}

	}

}
