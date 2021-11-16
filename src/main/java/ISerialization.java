import storageSpec.AbstractUser;

import java.util.List;

public interface ISerialization {
    public void saveUserData(String filePath, AbstractUser user);
    public List<Object> readSavedUsers(String filePath);
}
