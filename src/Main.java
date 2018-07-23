import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            // Exercise 1
            //Create a program that prints “CORRECT” if 1, 2, or 3 is entered. Else it will give ERROR. Afterwards make all
            // elif if statements and ask the class why the “correct” entry of 1 is also printing ERROR
            int userInput = 0;
            Scanner getThe = new Scanner(System.in);

            System.out.println("Enter a number");
            userInput = getThe.nextInt();


            if (userInput==1) {
                System.out.println("Correct");
            }
            else if (userInput==2) {
                System.out.println("Correct");
            }
            else if (userInput==3) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Error");
            }

        }
    }
