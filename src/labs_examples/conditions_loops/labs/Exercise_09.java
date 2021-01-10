package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for(String arg: args) {
            if("STAHP".equals(arg)){
                System.out.println("BROKEN");
                break;
            }
            continue;
        }
        System.out.println("END PROGRAM");
    }
}
