package storageSpec;

import storageSpec.AbstractUser;

import java.util.Collection;
import java.util.List;
import java.util.Map;
/**
 * Defines methods needed for storage and user serialization
 */
public interface ISerialization {
    /**
     * Saves Users data(userName, password, storagesAndPrivileges) in file with filePath either append existing file
     * or override existing
     * @param filePath
     * @param userName
     * @param password
     * @param storagesAndPrivileges
     * @param append
     */
    public void saveUserData(String filePath, String userName, String password, Map<String, Privilege>storagesAndPrivileges, boolean append);

    /**
     * Parses data in file with filePath and returns List<UserData> containing all users saved in file
     * @param filePath
     * @return
     */
    public List<UserData> readSavedUsers(String filePath);

    /**
     * Saves Users data: userName, password, storagesAndPrivileges in file with filePath
     * @param filePath
     * @param storage
     */
    public void saveStorageData(String filePath, Storage storage);
    /**
     * Parses data in file with filePath and returns StorageData
     * @param filePath
     * @return
     */
    public StorageData readStorageData(String filePath);
}
