package testOther;
// Error для JVM !!! для ПО
// implements Serializible как метка ничего не содержит
// Проверяемые компилятор подсказывает что нужно проверить try
/* checked exception
Throwable
Exception
IOException
SQLException
BrokenBarrierException
 */
// Не проверяемые
/*
unckecked
Error
ThreadDeath
VirtualMachineError
IOError
OutOfMemoryError
StackOverflowError
RuntimeException
NullPointerException
ArifmeticException
 */
public class ExceptionTest {
    public static void main(String[] args) throws Exception { // автоматом сюда провреку тоже надо включить
        new ExceptionTest().someMethod1();
        System.out.println("after method");
    }
    private void someMethod1() throws Exception{
        System.out.println("Exception");
        throw new Exception();
    }
    private void someMethod(){ // сам метод выбрасывает исключения точный участок логирования
        try {
            System.out.println("try");
            Object o = null;
            throw new MyException();
            //o.hashCode();
            //throw new Error()

        } catch(MyException e){
            System.out.println("MyException");
        } catch(Error e){
            System.out.println("error");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("catch");
            e.printStackTrace(); // метод логирования выбрасывает в какой строчке кода выбрасывается исключение.
        } catch(ArrayIndexOutOfBoundsException e){
            //все кетчи должны иди по иерархии
        } catch(RuntimeException e){

        }finally {
            //для закрытия баз данных
            System.out.println("start while true");
            //while (true){}
            //System.out.println("before exit");
            //System.exit(0);
            //System.out.println("finally");
        }
    }
}
