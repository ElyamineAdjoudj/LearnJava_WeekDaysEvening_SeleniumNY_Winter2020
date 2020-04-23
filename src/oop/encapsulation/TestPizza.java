package oop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {

        Pizza aghilesPizza=new Pizza("Italian Pizza");
        aghilesPizza.setPizzaPrice("55");
        System.out.println(aghilesPizza.getPizzaPrice());

        Pizza foudPizza=new Pizza("Italian Pizza","40");
        foudPizza.setAvaialble(true);
        System.out.println(foudPizza.isAvaialble());






    }






}
