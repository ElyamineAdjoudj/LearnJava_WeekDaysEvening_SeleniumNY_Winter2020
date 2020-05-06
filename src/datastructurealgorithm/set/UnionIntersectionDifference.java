package datastructurealgorithm.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {


    public static void main(String[] args) {
        int[] num1={1,3,5,7,9};
        int[] num2={2,4,5,6,8,7,9,10};


        Set<Integer>number1=new HashSet<Integer>();
        number1.addAll(Arrays.asList(new Integer[] {1,3,5,7,9} ));

        Set<Integer>number2=new HashSet<Integer>();
        number2.addAll(Arrays.asList(new Integer[] {2,4,5,6,8,7,9,10} ));

        // To Do Union set
        Set<Integer> union=new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union set");
        System.out.println(union);

        // To do Intersection
        Set<Integer> intersection=new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of two set");
        System.out.println(intersection);

        // To find symmetric Difference
        Set<Integer> difference=new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two set");
        System.out.println(difference);







    }








}
