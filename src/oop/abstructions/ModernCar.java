package oop.abstructions;

public abstract class ModernCar {

    // Abstract class: Not fully Abstract

    public String modernCarName="Tesla";
    public String modernCarSuggestedPrice;

    public abstract void gprs();

    public abstract void carDisplay();

    public abstract void pushStart();

    public abstract void twinTurbo();

    public abstract void cameras();

    public abstract void autoGear();

    // Non abstract method
    public void recline() {
        System.out.println("Modern car has Recline feature");
    }


}
