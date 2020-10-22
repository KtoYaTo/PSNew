package BE03.module01.lesson04_operators;

/**
 * 1. Math operators:
 * Create variables and assign values ​​where:
 * a is the sum of 10 and 2
 * b is the sum of a and 5
 * c - subtract a from b, add 1 to the result
 * d - multiply a, b and c *
 * e - divide d by 8
 * f - get the remainder from dividing e by 30
 * i - change the sign of the variable f
 * Display all variables.
 * An example of the class name for this assignment is presented below:
 */

public class ProgramTask41 {
    public static void main(String[] args) {
        int a = 10 + 2; // a is the sum of 10 and 2
        int b = a + 5; // b is the sum of a and b
        int c = a - b + 1; // subtract a from b, add 1 to the result
        int d = a * b * c; // multiply a, b and c
        int e = d / 8; // devide d by 8
        int f = e % 30; // get ramainder from dividing e by 30
        int i = -f; // change the sing of the variable f
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(i);
    }
}
