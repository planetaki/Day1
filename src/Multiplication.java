package src; /**
 * src.Multiplication
 * Write a program that requests two numbers from the user and then outputs their product. You cannot use the “*” operator.
 * Can you make your program work correctly also if one or both numbers are negative?
 */


import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        /**create the variable result assign value 0
         * create variable repetition value 1
         */
        int result =0 ;
        int repetition = 1;

        Scanner scanner = new Scanner(System.in);

        /**take 2 numbers as input and assign them to variables number1 and number2*/
        System.out.print("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        int number2 = scanner.nextInt();
        /**close scanner*/
        scanner.close();

        /**enter the while loop
         */
        while (repetition<=number2) {
            repetition=repetition+1;
            result=result+number1;
        }
        System.out.print(result);


    }


}

