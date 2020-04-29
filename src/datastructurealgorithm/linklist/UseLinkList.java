package datastructurealgorithm.linklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseLinkList {

    // ArrayList vs LinkList

    public static void main(String[] args) {
        List<String> fruitesName=new ArrayList<>();
        fruitesName.add("Apple");
        fruitesName.add("Orange");
        fruitesName.add("Mango");
        fruitesName.add("Grape");
        fruitesName.add("Peach");
        fruitesName.add("Strawberry");

        // Retrieve Data from ArrayList
        for (String fl:fruitesName) {
            System.out.println(fl);
        }

        List<String> mobileBrand=new LinkedList<>();
        mobileBrand.add("Apple");
        mobileBrand.add("Samsung");
        mobileBrand.add("LG");
        mobileBrand.add("Nokia");

        for (String mb:mobileBrand) {
            System.out.println(mb);
        }


        pizzaListDetails();

    }

    static List<String> pizzaList=new LinkedList<>();


    public static void pizzaListDetails(){
        pizzaList.add("American Pizza");
        pizzaList.add("Italian Pizza");
        pizzaList.add("Mexican Pizza");

        for (String pl:pizzaList) {
            System.out.println(pl);
        }

    }




}
