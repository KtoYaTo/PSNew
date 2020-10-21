package BE03.module01.lesson03_data_types;

/**
 * 2. Task for the short data type:
 * Write a fragment of the class (group of commands) that will assign the values ​​-32768 and 32768 to two variables, and then the third variable will receive a value equal to the sum of the values ​​of the two variables. The result should be with a short data type.
 *
 * An example of the class name for this assignment is presented below:
 */

public class ProgramTask32 {
    public static void main(String[] args) {
        // Write down here (in the comment to the program) how many
        // values ​​the short data type stores and how much memory it takes.
        short i = -32768;       // 16 bit - 2 byte  = -32_768..32_767
        int j = 32768;          // 32 bit - 4 byte  = -2_147_438_648...2_147_438_647
        byte k = (byte) (i+j);  //  8 bit - 1 byte  = -128...127
        System.out.println(k);
    }
}