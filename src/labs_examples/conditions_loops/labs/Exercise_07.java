package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        String vowels = "aeiou";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word");
        String entry = scanner.nextLine();
        char[] entryArr = entry.toCharArray();
        for(char c: entryArr) {
            int vowel_pos = vowels.indexOf(c);
            if (vowel_pos > -1) {
                System.out.println(entry + "has a vowel!");
                System.out.println(vowels.charAt(vowel_pos));
                main(args);
            }
            continue;
        }
        System.out.println("didnt find any vowels");
        main(args);
    }
}
