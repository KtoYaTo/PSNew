package testOther;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * We save and reed object with variavble and object in  bytes file
 * @see transient
 * @see FileOutputStream for write in file
 * @see ObjectOutputStream for write in file
 * @see FileInputStream for read from file
 * @see ObjectInputStream for read from file
 */
public class SerFileSave {
    public static void main(String[] args) throws Exception {
        UserSerialization user = new UserSerialization();
        user.level = 55;
        user.notSerialization = 51;
        UserHandSerializable userHO = new UserHandSerializable();
        userHO.level = 3;
        user.user = userHO;
        /*
         FileOutputStream — запись байтов в файл, является одной из реализаций абстрактного класса OutputStream
         ему можно как путь так и File передать
         */
        FileOutputStream fileOutputStream = new FileOutputStream("temp/user_object.tmp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        // не делаем objectOutputStream.flush();
        objectOutputStream.close();
        /*
        FileInputStream назначение противоположное — чтение байтов из файла. Так же как FileOutputStream наследует OutputStream, этот класс происходит от абстрактного класса InputStream.
         */
        FileInputStream fileInputStream = new FileInputStream("temp/user_object.tmp");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserSerialization newUser = (UserSerialization) objectInputStream.readObject();
        System.out.println(newUser.level);
        System.out.println(user.user.level);
    }
}
