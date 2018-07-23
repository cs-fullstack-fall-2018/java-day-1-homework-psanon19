import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        // Exercise 2
        //Ask the user to enter a number. If it’s positive, print “POSITIVE”. If it’s negative, print “NEGATIVE”.
        // If it’s zero, print ZERO.
        int userInput = 0;
        Scanner getThe = new Scanner(System.in);

        System.out.println("Enter a number");
        userInput = getThe.nextInt();


        if (userInput == 0) {
            System.out.println("Its 0");
        }
        else if ((userInput & 1) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }

}
