package oop.abstructions;

public class Test {


    public static void main(String[] args) {
        //  Car myCar=new Car();

        Toyota sameerToyota=new Toyota();
        String sameerCarModel=sameerToyota.toyotaCarModelNumber="M4";
        System.out.println("Sameer Car Model is "+sameerCarModel);
        sameerToyota.start();
        sameerToyota.wheel();
        sameerToyota.engine();
        sameerToyota.acceleration();
        sameerToyota.carema360View();
        sameerToyota.stop();
        sameerToyota.gprs();
        sameerToyota.twinTurbo();



        Tesla foud=new Tesla();
        foud.airBag();
        foud.autoGear();
        foud.cameras();
        foud.boostEngine();
        foud.carDisplay();
        foud.autoGear();
        foud.flyingFeature();



        // Return type will be class type

        Car myCar=new Toyota();
        myCar.start();
        ((Toyota) myCar).pushStart();

        FlyingCar myFlyingCar=new Tesla();


        ModernCar myModernCar=new Toyota();
















    }
}
