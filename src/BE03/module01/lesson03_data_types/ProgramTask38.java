package BE03.module01.lesson03_data_types;

/**
 * 8. Convertation.
 * Convert the decimal number 123 to a number system: binary, octal, hexadecimal. For example:
 */

public class ProgramTask38 {
    public static void main(String... args) {
        // 123/2 = 61 (1)
        // 61/2 = 30 (1)
        // 30/2 = 15 (0)
        // 15/2 = 7 (1)
        // 7/2  = 3 (1)
        // 3/2 = 1 (1)
        // 1/2 = 0 (1)
        int num123Binary = 0b1111011;// Двоичная системе счисления
        System.out.println(num123Binary);

        // 123/8 = 15 (3)
        // 15/8 = 1 (7)
        // 1/8 = 0 (1)
        int num123Octal = 0173;// Восьмеричная система счисления
        System.out.println(num123Octal);

        // 123/16 = 7(11)
        // 7/16 = 0(7)
        int num123Hexadecimal = 0x7B;// Шестнадцатеричная система счисления
        System.out.println(num123Hexadecimal);

        // остаток 10 это A
        // остаток 11 это B
        // остаток 12 это C
        // остаток 13 это D
        // остаток 14 это E
        // остаток 15 это F
    }
}
