package BE03.module01.lesson03_data_types;

/**
 * 1. Task for the byte data type:
 * Write a fragment of the class (group of commands) that will assign the first value: ​​127, and the second: 255, and then the third variable will receive a value equal to the substraction of the values ​​of the two variables. The result should be with a byte data type.
 * An example of the class name for this assignment is presented below:
 * public class ProgramTask31 {
 * public static void main(String[] args) {
 * // Write down here (in the comment to the program) how many
 * // values ​​the byte data type stores and how much memory it takes.
 */
public class ProgramTask31 {
    public static void main(String[] args) {
        //Переменные числовые i,j,k,n,m
        byte i = 127; // 8 bit - 1 byte    -128...127
        short j = 255; // 16 bit - 2 byte  -32768 ... 32767
        byte k = (byte) (i - j);
        System.out.println(k);
    }
}
