package singleton;

public class Pizza {
    // Singleton class: we are allowed to create one instance of a class at a time.
    // Using private constructor we can ensure that no more than one object can be created at a time.


    public String pizzaPrice="20";
    public String pizzaName="American Pizza";
    public double deliveryFee=2.5;
    private char size='M';
    private boolean isAvailable=true;

    private Pizza() {
        // private constructor
    }

    // create a instance variable/ object
    private static Pizza instance=new Pizza();

    public static Pizza getInstance(){
        return instance;
    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaPrice, String pizzaName) {
        this.pizzaPrice = pizzaPrice;
        this.pizzaName = pizzaName;
    }




}
