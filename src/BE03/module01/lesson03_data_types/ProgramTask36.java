package BE03.module01.lesson03_data_types;

/**
 * 6. Task for the char data type:
 * Write a class which displays the character in the first line “+”, In the second - the sign “!”, In the third - the sign “?”.
 * <p>
 * An example of the class name for this assignment is presented below:
 */
public class ProgramTask36 {
    static char[] c = {'+', '!', '?'};

    public static void main(String[] args) {
        // 1 values in char  16 bit - 2 byte  Unicode
        for (char i : c) {
            System.out.println(i);
        }
    }
}
