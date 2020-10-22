package BE03.module01.lesson04_operators;

/**
 * 3. Increment and decrement operators:
 * Create variable a and b. Set the variable a to 0, b value 5. Then:
 * <p>
 * Using the increment operator, increase the variable a.
 * Using the decrement operator, decrease the variable b.
 * Display the variables on the screen.
 * Assign the following expression to variable a:
 * a = --b;
 * and display the variables on the screen.
 * <p>
 * Assign the following expression to variable a:
 * a = b--;
 * and display a and b on the screen. Write in the comments what happened, why? Write what pre-increment and post-increment are, as well as pre-decrement and post-decrement.
 * <p>
 * An example of the class name for this assignment is presented below:
 * <p>
 * public class ProgramTask43 {
 * public static void main(String[] args) {
 * int a = 0;
 * int b = 5;
 * ...
 * }
 * }
 */
public class ProgramTask43 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        a = --b; // pre-increment. here first step b = b - 1, and then a = b - 1;
        new ProgramTask43().printString(a, b);
        a = b--; // post-increment. here first step a = b, and then b = b - 1;
        new ProgramTask43().printString(a, b);
    }

    /**
     * Display the variable a on the screen for a and b
     * @param a it integer
     * @param b it integer
     */
    public static void printString(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}

