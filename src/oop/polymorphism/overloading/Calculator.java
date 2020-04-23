package oop.polymorphism.overloading;

public class Calculator {

    // Method Overloading

    public void doSummation(){
        int number1=45;
        int number2=65;
        int summation=number1+number2;
        System.out.println("Summation of values are "+summation);
    }

    public void doSummation(int num1, int num2){
        int number1=num1;
        int number2=num2;
        int summation=number1+number2;
        System.out.println("Summation of values are "+summation);
    }

    public void doSummation(int num1, int num2, int num3){
        int number1=num1;
        int number2=num2;
        int number3=num3;
        int summation=number1+number2+number3;
        System.out.println("Summation of values are "+summation);
    }

    public void doSummation(int num1, int num2, int num3, int num4){
        int number1=num1;
        int number2=num2;
        int number3=num3;
        int number4=num4;
        int summation=number1+number2+number3+number4;
        System.out.println("Summation of values are "+summation);
    }


}
