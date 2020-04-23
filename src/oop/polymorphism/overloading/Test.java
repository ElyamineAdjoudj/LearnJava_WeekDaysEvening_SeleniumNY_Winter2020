package oop.polymorphism.overloading;

public class Test {


    public static void main(String[] args) {


        Calculator calculator=new Calculator();
        calculator.doSummation();

        calculator.doSummation(30,40);
        calculator.doSummation(40,50,60);
        calculator.doSummation(40,50,60,70);




    }
}
