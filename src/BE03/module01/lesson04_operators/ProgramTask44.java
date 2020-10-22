package BE03.module01.lesson04_operators;

/**
 * 4. Comparison operators:
 * Create variables a and b. Set the variable a = 3, b = 5. Display the result of each comparison operator.
 *
 * < >= <= == !=
 *
 * public class ProgramTask44 {
 *    public static void main(String[] args) {
 *       int a = 3;
 *       int b = 5;
 *       System.out.println (a > b);
 *    }
 * }
 * Set the value of the variable a = 5, display the results on the screen. Write in the comments what has changed, why? What data type does the comparison operator return? Write the result of the work
 *
 * a != b
 * into a variable and display it on the screen.
 */
public class ProgramTask44 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println (a > b); // false 3 > 5
        a = 5;
        System.out.println(a > b); // false, because 5 not more 5
        System.out.println(a == b); // true, because 5 equally 5
        System.out.println(a >= b); // true, because 5 equally 5
        a = 3;
        System.out.println(a <= b); // true, because 3 less 5
        System.out.println(a != b); // true, because 3 not equal 5
    }
}
