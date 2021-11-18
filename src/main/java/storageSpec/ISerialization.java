package storageSpec;

import storageSpec.AbstractUser;

import java.util.List;

public interface ISerialization {
    public void saveUserData(String filePath, AbstractUser user, boolean append);
    public List<UserData> readSavedUsers(String filePath);
    public void saveStorageData(String filePath, Storage storage);
    public StorageData readStorageData(String filePath);
}
