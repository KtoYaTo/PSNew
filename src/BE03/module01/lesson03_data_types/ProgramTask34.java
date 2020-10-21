package BE03.module01.lesson03_data_types;

/**
 * 4. Task for the long data type:
 *         Print to the console the maximum value that can be of type long. Answer the question, where such data type can be used?
 *
 *         An example of the class name for this assignment is presented below:
 */

public class ProgramTask34 {
    public static void main(String[] args) {
        //9223372036854775807
        long l = (long) Long.MAX_VALUE; // 64 bit - 8 byte  = 64 разрядное целое число
        System.out.println(l);
    }
}