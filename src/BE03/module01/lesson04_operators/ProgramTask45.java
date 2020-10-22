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
        // Write down here the answer to the question.
        boolean bOe = true;
        boolean bTwo = false;
        System.out.println(bOe && bTwo); // false -
        System.out.println(bOe || bTwo); // true -
        System.out.println(!bOe); // false -
        System.out.println(bOe ^ bTwo); //

        System.out.println(bOe & bTwo); //
        System.out.println(bOe | bTwo); //
        System.out.println(!bTwo);
        System.out.println(bOe ^ bTwo);
    }
}
