package testOther;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        /*
         RuntimeException это ошибки такие как деление на 0/ Они unchekedthrows IOException - это с файлом работаем
         chekedможно в методе строке указатьTrowable - чекед , глава иерархии ошибокthrows new Throuble();Error() обрабатывает системные ошибки свет и тп. нам не надо на него проверять
         Указывается в методе если нужно чтобы пользователь при использовании обработал на ошибки! throws RuntimeException)

         // checked проверяются мы должны их проверять.
         // throw new Trowable();
         // throw new Exception();
         // throw new IOException();
         // unchecked не проверяются компилятором, это не достататки программиста
         // throw new Error();
         // throw new RuntimeException();
         try{могут быть вложены}
         catch{} много быть
         в конце finally всегда выполняется.
         */
        try{
            new TryCatch().zeroError(0);
        }catch(RuntimeException e){

        }finally{
            System.out.println("ok!");
        }
        System.out.println("zeroError");
        try {
            try {
                new TryCatch();
            } finally {
                System.out.println("new TryCatch!");
            }
            int i = 5 / 0;
            System.out.println("try");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            //Выполняется всегда ! Даже если был return выше!!!
            System.out.println("finally");
        }
    }

    private void zeroError(int i) throws RuntimeException {
        i = 5 / 0;
    }
}
