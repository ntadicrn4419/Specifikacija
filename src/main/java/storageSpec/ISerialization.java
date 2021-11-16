package storageSpec;

import storageSpec.AbstractUser;

import java.util.List;

public interface ISerialization {
    public void saveUserData(String filePath, AbstractUser user);
    public List<UserData> readSavedUsers(String filePath);
}