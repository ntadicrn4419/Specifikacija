package storageSpec;

public class UserManager {
    private static AbstractUser user;

    public static void registerUser(AbstractUser userImp){
        user = userImp;
    }
    public static AbstractUser getUser(String userName, String password){
        user.setUserName(userName);
        user.setPassword(password);
        return user;
    }
}
