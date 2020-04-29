package datastructurealgorithm.array;

public class Array3D {
    // 3D Array= 1D Array+2D Array

    // DataType[Size][Row][Column]=new DataType[Size][Row][Column]


    static String[][][] pizza = new String[4][5][5];

    public static void main(String[] args) {

        pizza[0][0][0] = "Sl";
        pizza[0][0][1] = "pizza Type";
        pizza[0][0][2] = "price";
        pizza[0][0][3] = "qty";
        pizza[0][0][4] = "Amount";

        pizza[0][1][0] = "1";
        pizza[0][1][1] = "American Pizza";
        pizza[0][1][2] = "60";
        pizza[0][1][3] = "5";
        pizza[0][1][4] = "300";

        pizza[0][2][0] = "2";
        pizza[0][2][1] = "Italian Pizza";
        pizza[0][2][2] = "50";
        pizza[0][2][3] = "4";
        pizza[0][2][4] = "200";

        pizza[0][3][0] = "3";
        pizza[0][3][1] = "Mexican Pizza";
        pizza[0][3][2] = "40";
        pizza[0][3][3] = "3";
        pizza[0][3][4] = "120";


        System.out.println(pizza[0][3][1]);

        System.out.println("*****************************************************");
        for (String [][] pizzza:pizza) {
            for (String [] pizz:pizzza) {
                for (String piz:pizz) {
                    System.out.println(piz+" ");
                }
            }


        }



    }


}
