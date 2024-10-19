package src; /** Write a program that reads three numbers and prints them in order, from lowest to highest.*/

import java.util.Scanner;

public class NaiveSorting {
    public static void main(String[] args) {
        int lowest = 0;
        int middle = 0;
        int biggest = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number:");
        int number1 = scanner.nextInt();


        System.out.print("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number:");
        int number3 = scanner.nextInt();

        /**close scanner*/
        scanner.close();

        /**find biggest number*/

        if (number1>number2 && number1>number3) {
            biggest = number1;

        }
        else if (number2>number1 && number2>number3) {
            biggest = number2;
        }
        else if (number3>number1 && number3>number2) {
            biggest = number3;
        }


        /**find lowest number*/
        if (number1<number2 && number1<number3) {
            lowest = number1;
        }
        else if (number2<number1 && number2<number3) {
            lowest = number2;
        }
        else if (number3<number1 && number3<number2) {
            lowest = number3;
        }


        /** find middle number */
        if ((number3>number1 && number3<number2) || (number3<number1 && number3>number2)) {
            middle = number3;
        }
        else if ((number2>number1 && number2<number3) || (number2<number1 && number2>number3)) {
            middle = number2;
        }
        else if ((number1>number2 && number1<number3) || (number1<number2 && number1>number3)) {
            middle = number1;
        }


        System.out.print(lowest + ", " + middle + ", " + biggest);


    }
}

