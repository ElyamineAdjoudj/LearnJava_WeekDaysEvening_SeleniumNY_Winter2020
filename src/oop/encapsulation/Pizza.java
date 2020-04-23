package oop.encapsulation;

public class Pizza {


    // Encapsulation: Data Hiding
    // Getter and Setter

    public String pizzaName="American Pizza";

    private String pizzaPrice="60";
    private String pizzaType;
    private String sauceType;
    private String topping;
    private int size;
    private boolean isAvaialble;

    public Pizza() {

    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, String pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType, String sauceType) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
    }


    public Pizza(String pizzaName, String pizzaPrice, String pizzaType, String sauceType, String topping) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
        this.topping = topping;
    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType, String sauceType, String topping, int size) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
        this.topping = topping;
        this.size = size;
    }

    public Pizza(String pizzaName, String pizzaPrice, String pizzaType, String sauceType, String topping, int size, boolean isAvaialble) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
        this.topping = topping;
        this.size = size;
        this.isAvaialble = isAvaialble;
    }


    public String getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(String pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvaialble() {
        return isAvaialble;
    }

    public void setAvaialble(boolean avaialble) {
        isAvaialble = avaialble;
    }
}
