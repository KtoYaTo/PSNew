package testOther;

/**
 * @author Gavrilov Vasily
 */

public class StringBildering {
    public static void main(String[] args) {
        String s = new String("Hi");
        s.contains("ad");
        System.out.println(s);
        //String менять нельзя. Для этого есть StringBuilder, StringBuffer
        //Test write StringBuilder StringBuilder StringBuilder
        StringBuilder sBilderTest = new StringBuilder("Hi");
        sBilderTest.append(" Vasily");
        sBilderTest.insert(0, " - ");
        System.out.println(sBilderTest);

        StringBuffer sBufferTest = new StringBuffer("Now");
        sBufferTest.append(" new day!"); // Add in sBufferTest
        sBufferTest.delete(4, 8); // Delete from 4 to 8 sumbols
        System.out.println(sBufferTest); // out command line sBufferTest

    }
}
