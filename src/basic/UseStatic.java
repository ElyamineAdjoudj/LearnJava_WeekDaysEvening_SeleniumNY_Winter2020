package basic;

public class UseStatic {

	public static void main(String[] args) {
		UseStatic.display();// call by class name

		// Create a object
		UseStatic myObject = new UseStatic();
		myObject.TvDisplay();

	}

	public static void display() {
		System.out.println("Display is good");
	}

	public void TvDisplay() {
		System.out.println("TV Display is FHD");
	}

}
