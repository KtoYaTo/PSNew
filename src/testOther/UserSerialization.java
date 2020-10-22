package testOther;

import java.io.Serializable;

/**
 * Static variable not serializable before static variable it one variable for all with this class;
 * Object nested variable are saved in file
 * If add "transient" then varable can get null, and transient not can use for "hasCode" and "equals".
 * If Class not can implements Serializable then user transient.
 * extends Object very good Serializable for save, but if not Serial
 * @see Serializable
 * @author Gavrilov Vasily
 */
public class UserSerialization implements Serializable {
    int level;
    transient int i = 4;
    static int notSerialization;
    UserHandSerializable user;
}
