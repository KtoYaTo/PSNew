package BE03.module01.lesson03_data_types;

/**
 * 7. Task for all data types:
 * Below are the lines of the code. Mark those that will be compiled without errors.
 *
 *  Right work:
 *         a. int x = 'r'
 *        b. char x = 123;
 *        e. double x = 0x123D;
 *        f. int x = 0x123F;
 *        h. short x = 7;
 *        j. double x = 9;
 *        l. int x = 5;
 */

class ProgramTask37 {
    double x1 = 0x123D;
    int x2 = 0x123F;
    short x3 = 7;
    double x4 = 9;
    int x5 = 5;
    static int x6 = 'r';
    static char c = 123;

    public static void main(String[] args) {
        System.out.println(x6); // 114
        System.out.println(c); // "}"
    }
}