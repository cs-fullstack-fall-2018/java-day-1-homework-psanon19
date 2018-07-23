import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        // Exercise 3
        //Enter 3 card numbers. If it equals 21 print BLACKJACK!, if it’s greater than 21 print BUST!, if it’s less
        // than 21 print “The total is [TOTAL]”
        int card3 = 0;
        int card2 = 0;
        int card1 = 0;
        int userInput = card1+card2+card3;
        Scanner getThe = new Scanner(System.in);

        System.out.println("Enter a number");
        card1 = getThe.nextInt();
        System.out.println("Enter a number");
        card2 = getThe.nextInt();
        System.out.println("Enter a number");
        card3 = getThe.nextInt();


        if (userInput == 21) {
            System.out.println("Its Blackjack");
        }
        else if (userInput > 21) {
            System.out.println("Bust");
        }
        else if (userInput < 21) {
            System.out.println("Your Total is: "+userInput);
        }
        else {
            System.out.println("Odd");
        }

    }

}
