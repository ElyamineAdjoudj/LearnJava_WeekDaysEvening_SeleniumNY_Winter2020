package datastructurealgorithm.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {


    public static void main(String[] args) {

        List<String> stList=new LinkedList<>();

        stList.add("NY");
        stList.add("NJ");
        stList.add("VA");
        stList.add("NC");
        stList.add("FL");
        stList.add("CA");

        // Alternative of For Each Loop

        Iterator it=stList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(" After Remove");
        stList.remove(3);

        Iterator itt=stList.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }

        System.out.println(stList.size());
        System.out.println(stList.get(4));





    }















}
