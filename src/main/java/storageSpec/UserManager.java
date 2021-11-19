package storageSpec;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * Class that registrates and saves object of class AbstractUser and object of class which implements ISerialization
 */
public class UserManager {
    /**
     * Instance of AbstractUser which will be registered and getted.
     */
    private static AbstractUser user;
    /**
     * Instance of ISerialzation which will be registered and getted.
     */
    private static ISerialization userSerializator;
    /**
     * Registrates user -> save users to field of class
     * @param userImp
     */
    public static void registerUser(AbstractUser userImp){
        user = userImp;
    }
    /**
     * Registrates serializator -> save serializator to field of class
     * @param is
     */
    public static void registerUserSerializator(ISerialization is){
        userSerializator = is;
    }
    /**
     * Gets object of class which implements ISerialization
     */
    public static ISerialization getUserSerializator(){
        return userSerializator;
    }
    /**
     * Gets object of class which extends class AbstractUser
     */
    public static AbstractUser getUser(){
        return user;
    }

}
