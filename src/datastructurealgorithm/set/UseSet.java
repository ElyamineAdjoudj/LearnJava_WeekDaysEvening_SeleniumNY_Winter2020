package datastructurealgorithm.set;

import java.util.HashSet;
import java.util.Set;

public class UseSet {

    // Set is an interface which extends collection. it is an unorder collection of objects in
    // which duplicate values can not be stored.

    // Set is implemented by HashSet, LinkedHashSet or UseTreeSet.


    public static void main(String[] args) {
        Set<String> name=new HashSet<String>();

        name.add("Sami");
        name.add("Denys");
        name.add("Anas");
        name.add("Karim");
        name.add("Hakim");
        name.add("Anas");

        System.out.println(name);
        name.remove("Karim");
        System.out.println(name);
        System.out.println( name.contains("Den"));



    }






}
