package controlflow;

public class ForLoop {

	// Loop is allowing us to Execute a statement or group of statements multiple
	// times.
	// For Loop
	// While Loop
	// Do..While loop
	// For Each Loop

	public static void main(String[] args) {

		// System.out.println("Hello world");

		// For Loop
		// for(Declaration: Expression){ //Statements }
		// for(Initialization; Condition;Iteration){ }
		// Initialization=StartPoint; Condition=EndPoint; Iteration=Looping/AgainNAgain

		for (int i = 0; i <= 5; i++) {
			System.out.println("We are learning For Loop");

		}

		// Nested For Loop

		for (int i = 0; i <= 3; i++) {
			// parent for loop
			System.out.println("We are learning Nested For Loop");
			// child for loop
			for (int j = 0; j < 2; j++) {
				System.out.println("Nested loop");
			}

		}

	}

}
