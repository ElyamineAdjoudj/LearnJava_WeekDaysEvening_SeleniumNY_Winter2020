package datastructurealgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class UseMap {


    // Map: <Key,Value>
    // Map<String, String>
    // name is key
    // "Denys"


    public static void main(String[] args) {

        Map<String,String> stateMap=new HashMap<>();
        stateMap.put("USA","NY");
        stateMap.put("CANADA","ON");
        stateMap.put("JAPAN","TOKYO");
        stateMap.put("INDIA","DELHI");
        stateMap.put("BANGLADESH","DHAKA");
        // Retrive Value from Map

        for (  Map.Entry<String,String> entry :  stateMap.entrySet() ) {

            System.out.println(entry.getKey()+" : "+entry.getValue());

        }

        System.out.println(stateMap.get("USA"));

        System.out.println("Another Approach to get value");

        for (String st:stateMap.keySet() ) {
            System.out.println(st+" :"+stateMap.get(st));
        }







    }








}
