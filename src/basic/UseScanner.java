package basic;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {

		// Scanner

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name");

		String name = input.nextLine();

		System.out.println("My Name is " + name);

		System.out.println("Enter Student ID");
		int stID = input.nextInt();
		System.out.println(stID);

		input.close();

	}

}
