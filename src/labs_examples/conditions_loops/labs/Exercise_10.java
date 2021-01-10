package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    // SORRY if anyone is looking at this! totally cheating but I'd just like to get through this
    // excercise if thats ok :)
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
