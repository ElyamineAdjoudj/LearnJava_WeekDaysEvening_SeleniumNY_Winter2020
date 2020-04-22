package string;

public class Pizza {
    // String is a sequence of character
    public static void main(String[] args) {

        String pizzaPrice = "20";
        String pizzaName = "American Pizza";
        double deliveryFee = 2.5;
        char size = 'M';
        boolean isAvailable = true;


        System.out.println("The of string value is "+pizzaName.length());
        System.out.println(pizzaName.concat(pizzaPrice));
        System.out.println(pizzaName.equals("American Pizza"));
        System.out.println(pizzaName.equalsIgnoreCase("American pizza"));
        System.out.println(pizzaName.charAt(4));
        System.out.println(pizzaName.substring(5));
        System.out.println(pizzaName.substring(5,8));


        System.out.println("********************************");
        try {
            System.out.println(pizzaName.charAt(15));

        } catch (Exception e){
            System.out.println("String Index Out Of Bounds Exception");
        }


        // Reverse string:
        // uppercase
        // lower case
        // remove
        // trim


    }


}
