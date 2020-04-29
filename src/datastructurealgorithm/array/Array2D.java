package datastructurealgorithm.array;

public class Array2D {

    // MultiDimensional Array/ 2D Array

    //dataType[1st Dimension][2nd Dimension] =new dataType[size1][size2]

    static String [][] stName = new String[4][4];

    static String [][] stName1 = new String[100][10];

    // Declare and Initialize 2D Array
    static String [][] stAddress={
            // Row 3
            // Column
            {"Sl","firstName","lastName","stAddress"},
            {"1","James","william","Queens,NY"},
            {"2","Jack"," mazii","Jamaica,NY"},
            {"3","Alex","Zillan","Bronx,NY"},
    };



    public static void main(String[] args) {
        System.out.println(stName.length);
        System.out.println(stAddress.length);

        stName[0][0]="SL";
        stName[0][1]="firstName";
        stName[0][2]="lastName";
        stName[0][3]="Address";

        stName[1][0]="1";
        stName[1][1]="James";
        stName[1][2]="William";
        stName[1][3]="Queens,NY";

        stName[2][0]="2";
        stName[2][1]="Alex";
        stName[2][2]="Black";
        stName[2][3]="Jamaica,NY";

//        stName[3][0]="3";
//        stName[3][1]="Anika";
//        stName[3][2]="Islam";
//        stName[3][3]="Brooklyn,NY";


        System.out.println(stName[2][0]);
        System.out.println("**************");

        for (String[] std:stName) {
            for (String st:std) {
                System.out.println(st);
            }
        }


        System.out.println(stAddress[2][2]);



    }






}
