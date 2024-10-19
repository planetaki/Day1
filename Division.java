

/**Write a program that requests two positive numbers from the user and then outputs the quotient and
 the remainder, e.g., if the user enters 7 and 3, your program should output something like “7 divided
 by 3 is 2, remainder 1”. You cannot use the “/” or “%” operators.*/



import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        /**create the variable result assign value 0
         * create variable repetition value 1
         */
        int result = 0;


        /*int repetition = 1;*/

        Scanner scanner = new Scanner(System.in);

        /**take 2 numbers as input and assign them to variables number1 and number2*/
        System.out.print("Enter the first number:");
        int number1 = scanner.nextInt();
        int remainder = number1;

        System.out.print("Enter the second number:");
        int number2 = scanner.nextInt();

        /**close scanner*/
        scanner.close();

        /**enter the while loop
         */
        while (remainder >= number2) {
            remainder = remainder - number2;
            result = result + 1;


        }
        System.out.print(number1 + " divided by " + number2 + " is " + result + " with the remainder of " + remainder);


    }
}
