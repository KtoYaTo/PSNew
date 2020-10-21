package BE03.module01.lesson03_data_types;

/**
 * 3. Task for the int data type:
 * Write a class that assigns the value 1200 to x, and then displays: in the first line: this value; in the second line: the square of this value; in the third line: the cube of this value. The result should be with a int data type.
 * <p>
 * An example of the class name for this assignment is presented below:
 */

public class ProgramTask33 {
    public static short x = 1200; // 16 bit - 2 byte  = -32_768..32_767

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println((int) Math.pow(x, i)); // int 32 bit - 4 byte  = -2_147_438_648...2_147_438_647
        }
    }
}