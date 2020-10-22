package BE03.module01.lesson04_operators;

/**
 * Create a variable a and assign it the value 10, then use the following operators to change the value of the variable: "+=" "-=" "*=" "/=" "%="
 * An example of the class name for this assignment is presented below:
 * Add 3
 * Subtract 7
 * Multiply by 4
 * Divide by 8
 * Get the remainder of division by 2.
 * After each operation, display the variable a on the screen.
 *
 * @author Gavrilov Vasily
 */
public class ProgramTask42 {
    public static void main(String[] args) {
        int a = 10;
        a += 3; // Add 3
        System.out.println(a);
        a -= 7; // Subtract 7
        System.out.println(a);
        a *= 4; // Multiply by 4
        System.out.println(a);
        a /= 8; // Divide by 8
        System.out.println(a);
        a %= 2; // Get the remainder of division by 2.
        System.out.println(a);
    }
}
