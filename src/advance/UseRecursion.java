package advance;

public class UseRecursion {

	// Recursion: process in which a method calls itself continuously.
	// must call itself
	// must have a base case
	// must change its state and move toward the base case

	static int count = 0;

	public static void pizzaInfo() {
		count++;

		if (count <= 10) {
			System.out.println("Pizza is Amazing");
			pizzaInfo(); // Reursion
		}

	}

	public static void main(String[] args) {

		UseRecursion.pizzaInfo();

	}

}
