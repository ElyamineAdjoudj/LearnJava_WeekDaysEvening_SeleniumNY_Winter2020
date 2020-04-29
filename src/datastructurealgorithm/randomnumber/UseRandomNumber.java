package datastructurealgorithm.randomnumber;

import java.util.Random;

public class UseRandomNumber {


    public static void main(String[] args) {
        // based on Array size it will generate Random Number
        double[] stID = new double[10];

        Random random=new Random( 1);

        for (int i=0;i<stID.length;i++){
            stID[i]= random.nextInt(30);
            System.out.println(stID[i]);
        }

        System.out.println(Math.random());


    }


}
