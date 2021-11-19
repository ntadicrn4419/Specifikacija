package storageSpec;

import storageSpec.AbstractUser;

import java.util.List;
import java.util.Map;
/**
 * Defines methods needed for storage and user serialization
 */
public interface ISerialization {
    public void saveUserData(String filePath, String userName, String password, Map<String, Privilege>storagesAndPrivileges, boolean append);
    public List<UserData> readSavedUsers(String filePath);
    public void saveStorageData(String filePath, Storage storage);
    public StorageData readStorageData(String filePath);
}
