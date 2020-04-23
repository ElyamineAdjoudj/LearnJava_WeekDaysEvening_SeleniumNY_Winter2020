package oop.abstructions;

public interface Car {

    // Interface: 100% Abstract

     public String seat="2";
    String headlight="4";
    boolean gasTank=true;

    public void start(); // Declared a method
    public void stop();
    public void wheel();
    public void engine();
    public void acceleration();
    public void steering();


    public static int brake(){
        int num=5;
        return num;
    }










}
