package basic;

public class UseNestedClass {

	// Parent class

	public static void main(String[] args) {
		System.out.println(Computer.name);
		Computer.display();

	}

	public static class Computer {
		// Nested class/ child class

		static String name = "Nafis";

		public static void display() {
			System.out.println("Dispaly is Good");
		}

//		public static void main(String[] args) {
//
//		}

	}

	public class Car {
		// Nested class/ child class

	}

}
