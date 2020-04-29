package datastructurealgorithm.array;

import java.util.ArrayList;

public class UseArrayList {

    // ArrayList: No need to declare Array size/ Dynamic Array

    // ArrayList type Array object
    static ArrayList<String> stName=new ArrayList<String>();

    static String[] studentName=new String[5000];

    public static void main(String[] args) {
        stName.add("Anika Islam"); //0
        stName.add("James William"); //1
        stName.add("Syed Nafis");// 2
        stName.add("Anas Chikh"); //3
        stName.add("Denys Myronenko"); //4 // 3
        stName.add("Denys Myronenko");//5 // 4

        System.out.println(stName.get(1));
        System.out.println("********* Before  Remove************");
        for (String st:stName) {
            System.out.println(st);
        }


        System.out.println("*********After Remove************");
        stName.remove(3);

        for (String st:stName) {
            System.out.println(st);
        }






    }







}
