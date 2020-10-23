package BE03.module01.lesson04_operators;

/**
 * 5. Logical operators:
 * Create boolean variables bOne and bTwo. Set the values, bOne is true, bTwo is false. Display the result of all logical operations on the screen.
 * && || ! ^
 * & | ! ^
 * Change bTwo to true. Display the result again. What type do logical operators return? What is the difference between the logical operator NOT (!) And the rest? What's the difference between shorthand and regular boolean operators? (Write in the comments) Is the following example valid? If so, what would be the result:
 * a. true || false
 * b. false && true
 * c. !true || 1 >= 0
 * d. false && 5
 * e. true &&! false
 * f. true ^! true
 * i. 1> = 1 || false
 * g. true && 5 - 5
 */
public class ProgramTask45 {
    public static void main(String[] args) {
        // operator NOT (!) reverses result if we have true, then we get false. And true -> false
        // &, | - acts on the check for each comparison field
        // &&, || - This is a lightweight comparison. acts on the check by the first comparison field, if no further is needed, then it does not check.
        boolean bOne = true;
        boolean bTwo = false;
        System.out.println("------true false-----");
        System.out.println(bOne && bTwo); // false
        System.out.println(bOne || bTwo); // true
        System.out.println(!bOne); // false
        System.out.println(bOne ^ bTwo); // true

        System.out.println(bOne & bTwo); // false
        System.out.println(bOne | bTwo); // true
        System.out.println(!bTwo); // true
        System.out.println("------true true-----");
        bTwo = true;
        System.out.println(bOne && bTwo); // true
        System.out.println(bOne || bTwo); // true
        System.out.println(!bOne); // false
        System.out.println(bOne ^ bTwo); // false

        System.out.println(bOne & bTwo); // true
        System.out.println(bOne | bTwo); // true
        System.out.println(!bTwo); // false
        System.out.println("------Test-----");
        /*
         * a. true || false         = true
         * b. false && true         = false
         * c. !true || 1 >= 0       = true
         * d. false && 5            = Error
         * e. true &&! false        = true
         * f. true ^! true          = true
         * i. 1> = 1 || false       = Error must be >=, then we get true
         * g. true && 5 - 5         = Error with && must be true or false
         */

    }
}
