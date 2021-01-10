package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.print("Please enter your number");
        // 3) assign input to variable as int
        int number = scanner.nextInt();
        // 4) write completed code here
        if(number>=1 && number<8) {
            if(number==1) {
                System.out.println("Monday");
                main(args);
            } else if (number==2) {
                System.out.println("Tuesday");
                main(args);
            } else if (number==3) {
                System.out.println("Wednesday");
                main(args);
            } else if (number==4) {
                System.out.println("Thursday");
                main(args);
            } else if (number==5) {
                System.out.println("Friday");
                main(args);
            } else if (number==6) {
                System.out.println("Saturday");
                main(args);
            } else if (number==7) {
                System.out.println("Sunday");
                main(args);
            }
        } else {
            System.out.println("Other");
            main(args);
        }

    }
}
