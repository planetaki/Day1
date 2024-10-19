/**
 * Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point,
 * print “Yes” if the numbers were consecutive and increasing and “No” otherwise. For example, the
 * sequences “1,2,3,4,-1” and “5,6,7,8,9,10,11,-1” should lead to the output “Yes”, but “2,3,5,6,7,-1”,
 * “10,9,8,7,-1”, and “1,1,2,3,4,5,-1” should lead to the output ”No”.*/

package src;

import java.util.Scanner;

public class GoingUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number(last one should be -1):");
        int input = scanner.nextInt();
        int previous =input;
        String result = "yes";

        while (input!=-1) {
            System.out.print("Enter the first number(last one should be -1):");
             input = scanner.nextInt();

            if (input == -1) {
                break;
            }


            if (input>=previous) {
                previous=input;
            }


            else {

                result="no";
            }

            }
        System.out.print(result);
        }

    }

