package controlflow;

public class DoWhileLoop {

	// Post condition check:

	// Do while loop execute at least one time then it will check condition.
	// do{} while()

	public static void main(String[] args) {
		// first it will execute one time then it will check the condition
		int x = 20;
		do {
			System.out.println("we are learning Do while Loop");
			x++;
		} while (x < 25);
	}

}
