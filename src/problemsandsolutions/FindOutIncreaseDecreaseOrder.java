package problemsandsolutions;

import java.util.Scanner;

public class FindOutIncreaseDecreaseOrder {

    /**
     * Write a program that accepts three numbers from the user and prints "increasing"
     * if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order,
     * and "Neither increasing or decreasing order" otherwise.
     * Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321
     *
     */


    public static void main(String[] args) {
        //Call method to check Increase Decrease order
        FindOutIncreaseDecreaseOrder.increaseDescrease();

    }

    /**
     * this method will check Increase and Decrease order
     */
    public static void increaseDescrease() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = in.nextInt();
        System.out.println("Input second number: ");
        int num2 = in.nextInt();
        System.out.println("Input third number: ");
        int num3 = in.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    public static void increaseDecreaseOrder(){
        Scanner stdin=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a=stdin.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b=stdin.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c=stdin.nextInt();

        if(a<b&&b<c) {
            System.out.println("Increasing");
        }else if(a>b&&b>c) {
            System.out.println("Decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}