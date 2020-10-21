package testOther;

/**
 * With no arguments, -enableassertions or -ea enables assertions
 * По умолчанию отключены проверки.
 * В IJ IDEA Configuration: OV options: need write -ea
 *
 * Exception in thread "main" java.lang.AssertionError
 * 	at test.Assertions.assertStart(Assertions.java:14)
 * 	at test.Assertions.main(Assertions.java:10)
 *
 * 	https://docs.oracle.com/javase/7/docs/technotes/tools/windows/java.html
 */
public class Assertions {
    public static void main(String[] args) {
        new Assertions().assertStart(-5);
    }

    private void assertStart(int i) {
        assert  (i > 0); // выведет ошибку если при компиляции будет указан -ea
    }
}
