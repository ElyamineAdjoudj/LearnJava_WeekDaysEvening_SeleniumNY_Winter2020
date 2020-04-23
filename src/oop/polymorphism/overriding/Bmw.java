package oop.polymorphism.overriding;

public class Bmw extends Car {

        // Override : keep method name same

    @Override
    public void start(){
        System.out.println("BMW has start feature");

    }

    @Override
    public void stop(){
        System.out.println("BMW has stop feature");
    }


}
