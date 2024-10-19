/**Write a program that outputs a number pyramid like the one below, going on forever (until you press
 Ctrl-C to stop the program).
 1
 22
 333
 4444
 55555
 666666
 7777777
 ...
*/


 package src;
public class NumberPyramids_A {
    public static void main(String[] args) {
        int number = 1; // Start with number 1

        // Loop that prints the pyramid and stops at number 9
        while (number <= 9) {
            // Print the current number 'number' times
            for (int i = 0; i < number; i++) {
                System.out.print(number);
            }
            System.out.println(); // Move to the next line after each row

            number++;
        }
    }
}

