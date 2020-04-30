package problemsandsolutions;

import java.util.Scanner;

public class CheckEligibilityForVote {
    /**
     *  Write Java program to allow the user to input his/her age.
     *  Then the program will show if the person is eligible to vote.
     *  A person who is eligible to vote must be older than or equal to 18 years old.
     *  Enter your age: 18 .You are eligible to vote.
     *
     */
    
    
    public static void main(String[] args) {
        CheckEligibilityForVote.eligibility();
    }


    // Document commenting
    /**
     *
     * This method will check the Eligibility of the voter Age
     *
     */
    public static void eligibility(){
        Scanner stdin=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=stdin.nextInt();

        if(age>=18) {
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }stdin.close();
    }


}
