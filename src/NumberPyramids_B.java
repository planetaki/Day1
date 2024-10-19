/**Write a program that reads a number between 1 and 25, and then outputs a number pyramid like the
 one below (the example is for number 8) with that number of levels. Notice that you must write the
 right number of spaces at each level so that the pyramid is properly aligned to the right.
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 6 6 6 6 6 6
 7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8

 */
package src;

import java.util.Scanner;

public class NumberPyramids_B {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 25: ");
        int levels = scanner.nextInt();

        // Validate that the input is within the range
        if (levels < 1 || levels > 25) {
            System.out.println("Invalid input. Please enter a number between 1 and 25.");
            return; // Exit the program if the input is out of range
        }

        // Outer loop for each level
        for (int i = 1; i <= levels; i++) {
            // Print spaces to align the pyramid to the right
            for (int j = 0; j < (levels - i); j++) {
                System.out.print(" ");
            }

            // Print the current number 'i' times, separated by spaces
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");  // Add space after each number
            }
            System.out.println();  // Move to the next line
                }
            }
        }

