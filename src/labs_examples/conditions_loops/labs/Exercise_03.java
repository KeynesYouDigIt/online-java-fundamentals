package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number");
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("January");
                main(args);
            case 2:
                System.out.println("February");
                main(args);
            case 3:
                System.out.println("March");
                main(args);
            case 4:
                System.out.println("April");
                main(args);
            case 5:
                System.out.println("May");
                main(args);
            case 6:
                System.out.println("June");
                main(args);
            case 7:
                System.out.println("July");
                main(args);
            case 8:
                System.out.println("August");
                main(args);
            case 9:
                System.out.println("September");
                main(args);
            case 10:
                System.out.println("October");
                main(args);
            case 11:
                System.out.println("November");
                main(args);
            case 12:
                System.out.println("December");
                main(args);
            default:
                System.out.println("other");
                main(args);

        }
    }
}
