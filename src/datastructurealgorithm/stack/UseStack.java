package datastructurealgorithm.stack;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {


    // Stack : LIFO Last in First Out
    // Pushing element on top of the stack: push()
    // Popping element from the top of the stack: pop()


    public static void main(String[] args) {
        Stack<String> stID = new Stack<>();
        stID.push("st101");
        stID.push("st102");
        stID.push("st103");
        stID.push("st104");
        stID.push("st105");
        stID.push("st106");

        System.out.println(stID);
        System.out.println(stID.pop());
        System.out.println(stID);

        System.out.println("****************************************");


        Stack<String> ssn = new Stack<>();

        for (int i = 0; i < 8; i++) {
            ssn.push("ssnNumber" + i);
        }

        Iterator it = ssn.iterator();
        while (it.hasNext()) {
            System.out.println(ssn.pop());
        }


        Stack<Integer> stMobileNumber = new Stack<>();
        stMobileNumber.push(873478453);
        stMobileNumber.push(873475453);
        stMobileNumber.push(873476453);
        stMobileNumber.push(873477453);
        stMobileNumber.push(873479453);

        stackSearch(stMobileNumber,873476453);

    }


    public static void stackSearch(Stack<Integer> stack, int element) {
        Integer pos=stack.search(element);
        if (pos == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at position "+pos);
        }

    }


}
