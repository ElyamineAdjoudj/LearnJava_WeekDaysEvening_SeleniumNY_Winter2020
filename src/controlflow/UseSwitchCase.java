package controlflow;

public class UseSwitchCase {

	public static void main(String[] args) {

		int foodSeries = 9;
		String foodName;

		switch (foodSeries) {
		case 1:
			foodName = "Pizza";
			break;
		case 2:
			foodName = "Coffee";
			break;
		case 3:
			foodName = "Cookie";
			break;
		case 4:
			foodName = "Ice Cream";
			break;
		case 5:
			foodName = "Steak";
			break;
		case 6:
			foodName = "Burger";
			break;
		default:
			foodName = "Invalid Food Item";
			break;
		}
		System.out.println("Selected Food : " + foodName);

	}

}
