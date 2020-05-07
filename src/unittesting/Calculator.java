package unittesting;

public class Calculator {

    // Unit
    public static int doSummation(int num1, int num2){
        int number1=num1;
        int number2=num2;
        int sum=number1+number2;
        System.out.println("Summation value is "+sum);
        return sum;

    }

    public static int doSummation(int num1, int num2, int num3){
        int number1=num1;
        int number2=num2;
        int number3=num3;
        int sum=number1+number2+number3;
        System.out.println("Summation value is "+sum);
        return sum;

    }


}
