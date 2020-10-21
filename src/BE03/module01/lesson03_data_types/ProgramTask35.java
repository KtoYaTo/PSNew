package BE03.module01.lesson03_data_types;

/**
 * 5. Task for the float and double data types:
 * Given a floating-point number "A", which stores 1245.554 kilograms of apples and a double number "B", stores 256.3785 kilograms of apples. Print the fractional part of the multiplication of these two numbers.
 * <p>
 * An example of the class name for this assignment is presented below:
 */
public class ProgramTask35 {
    static float a = 1245.554f;
    static double b = 256.3785;

    public static void main(String[] args) {
        // Вещественные
        //float 32.0f; from 0.37e-038 to 3.4e+038
        //double 64.0; from 1.7e-308 to 1.7e+308    64 bit - 8 byte по умолчанию с точкой читается
        double i = a * b;
        i = i % 1;
        System.out.println(i);
    }
}