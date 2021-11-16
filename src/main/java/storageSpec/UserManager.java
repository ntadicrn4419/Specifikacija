package storageSpec;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    private static AbstractUser user;
    private static ISerialization userSerializator;
    public static void registerUser(AbstractUser userImp){
        user = userImp;
    }
    public static void registerUserSerializator(ISerialization is){
        userSerializator = is;
    }
    public static ISerialization getUserSerializator(){
        return userSerializator;
    }
    public static AbstractUser getUser(String userName, String password){
        user.setUserName(userName);
        user.setPassword(password);
        return user;
    }

}
