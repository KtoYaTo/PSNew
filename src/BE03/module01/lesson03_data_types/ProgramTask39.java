package BE03.module01.lesson03_data_types;

/**
 * 9. Difference between primitive and reference data types.
 * Show the differences between reference and primitive data types using any program as an example. (in a program)
 * <p>
 * What is stored on stack, heap for primitive and reference data types? (please answer to the question in the comments to the program)
 * <p>
 * Wrapper classes for primitive data types how much memory is occupied? (please answer to the question in the comments to the program) idea ce
 */

public class ProgramTask39 {
    public static void main(String[] args) {
        //Примитивные типы данных не имеют объектов и хранятся в памяти STACK

        // Целочисленные
        byte b = 8;  // 8 bit - 1 byte     = -128...127
        short sh = 16;// 16 bit - 2 byte   = -32_768..32_767
        int a = 32;  // 32 bit - 4 byte    = -2_147_438_648...2_147_438_647
        long l = 64L; // 64 bit - 8 byte   = 64 разрядное целое число
        //Вещественные
        float f = 32.0f;// 32 bit - 4 byte = 0.37e-038 ... 3.4e+038
        double d = 64.0;// 64 bit - 8 byte = 1.7e-308 ... 1.7e+308

        char c = 'D'; // 16 bit - 2 byte      = 'A', 'V' - хранит один знак
        boolean bool = true; //8 bit - 2 byte = "true" or "false"


        // Reference - Ссылочные типы данных
        // String, Byte,  Short, Integer, Long, Double, Float, Boolean, Character, Boolean - это классы все классы содержат используют примитивные данные и хранят такое же количество данных.
        // кроме стринг где строка может хранить бесконечное текстовых данных.
        // string, string1, short1 - это ссылка на объект храниться в STACK и содержат в себе различные методы класса
        // "Текст" - это объект который храниться в памяти HEAP
        String string = "Текст";
        String string1 = new String("Текст"); // Равнозначно с предыдущей записью!
        // Нельзя сравнивать string и string1 через = или == т.к. это ссылки на раные объекты, для этого используется метод класса equals
        System.out.println(string == string1); // false
        String string2 = string1;
        System.out.println(string2 == string1); // true т.к. ссылки указывают на один и тот же объект в памяти

        Byte byte1 = 127;
        System.out.println(byte1.toString());

        Short short1 = 16;
        short1.intValue();//Преобразовали в int

        Integer integer = 32;
        System.out.println(integer.equals(a)); // true - равны числа

        Long long1 = 231231L;
        System.out.println(long1.hashCode()); // получили цифровой хэшкод ссылки на объект получается путем сравнения переменных в классе

        Double double1 = 64.0;
        Float float1 = 32.0F;
        System.out.println(float1.doubleValue()); // Преобразовали в double

        Boolean boolean1 = true;
        System.out.println(boolean1.equals(bool));

        Character char1 = 'A';
        System.out.println(char1.toString());

    }
}
