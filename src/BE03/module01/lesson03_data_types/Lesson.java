package BE03.module01.lesson03_data_types;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Примитивные данные
 * Целочисленные
 * int b = 32 // bit - 4 byte  = -128...127
 * short s = 16 bit - 2 byte
 * byte b = 8 bit - 1 byte
 * long l = 64 bit - 8 byte
 * Вещественные данные
 * double d = 64.0 //64 bit - 8 byte по умолчанию с точкой читается
 * float f = 32.0f //
 * char c = 'g' //2 byte
 * boolean b = true //2 byte
 * <p>
 * Двоичная система исчисления начинается с 0b
 * Восьмеричная система исчисления начинается с 0 (ноль!)
 * Шестнадцетиричная система исчисления начианется с 0x
 * }
 * }
 */
public class Lesson {
    public static void main(String[] args) {
        //new Lesson().primitiveData();
        new Lesson().referenceData();
    }

    private void primitiveData() {
        /**
         * Примитивные данные
         */

        // Целочисленные
        byte b = 8;  //  8 bit - 1 byte  = -128...127
        short s = 16;// 16 bit - 2 byte  = -32_768..32_767
        int i = 32;  // 32 bit - 4 byte  = -2_147_438_648...2_147_438_647
        long l = 64L; // 64 bit - 8 byte  = 64 разрядное целое число

        // Вещественные
        float f = 32.0f; // 0.37e-038 ...3.4e+038
        double d = 64.0; // 1.7e-308 ... 1.7e+308    64 bit - 8 byte по умолчанию с точкой читается
        char c = 'g'; //16 bit - 2 byte   символ в кодировке Unicode
        boolean bool = true; //8 bit - 2 byte

        // Двоичная запись числа
        int num = 0b1100;
        //System.out.println(num);// число 12

        // Переводим 15 число в двоичное
        // 15/2 = 7 ( в остатке 1 )
        // 7/2  = 3 ( в остатке 1 )
        // 3/2  = 1 ( в остатке 1 )
        // 1/2  = 0 ( в остатке 1 )
        // Записываем в обратном порядке 0b0011
        System.out.println(0b1111);

        //Восьмеричная система исчисления i = 010; будет 8

        //Переводим 375 в восьмеричную систему исчисления
        // 375/8 = 46 (7)
        // 46/8 = 5 (6)
        // 5/8 = 0 (5)
        // будет 0567
        System.out.println(0567);

        // Переводим 375 в шестнадцетиричную систему исчисления
        // 375/16 = 23 (7)
        // 23/16 = 1 (7)
        // 1/16 = 0 (1)
        // 0x177 получается! работает ура! понял)
        System.out.println(0x177);

        // Переводим 111 в шестнадцетиричную систему исчисления
        // 111/16 = 6 (15)
        // 6/16 = 0 (6)
        // Если остаток 10 то A
        // Если остаток 11 то B
        // Если остаток 12 то C
        // 13 - D
        // 14 - E
        // 15 - F
        // 0x177 получается! работает ура! понял)

        System.out.println(0x6F);
    }

    private void referenceData() {
        // Класс обёртка над примитивными типами данных
        // String - это класс
        // "Hello" - это объект
        // s - это ссылка на объект который храниться в памяти
        //STACK - s храниться , ссылка на оъект
        //HEAP - храниться объект "Hello"
        // У них есть методы, а у примитивных нет методов
        String s = "Hello";
        String s1 = new String("Hello");
        System.out.println(s1);

        int i = 10;
        //STACK - примичивные сразу хранит 10
        Integer integer = 10;
        System.out.println(integer.equals(i));

        Byte b = 2;
        b.equals(2);

        Short aS = 12;
        Long l = 1L;
        Float fl= 9.9f;
        Double dub  = 0.2;
        Boolean bo = true;
        Character character = 'a';

    }
}
