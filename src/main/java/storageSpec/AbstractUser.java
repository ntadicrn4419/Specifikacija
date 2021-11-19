package storageSpec;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractUser {
    /***
     * Username of user.
     */
    private String userName;
    /**
     * Password of user.
     *  */
    private String password;
    /**
     *Storage that is operated on.
     * */
    private transient Storage currentActiveStorage;
    /**
     * Key of the map is id of storage. Value of the map is privilege that this user has for storage with this id.
     * */
    private Map<String, Privilege> storagesAndPrivileges;// spisak skladista kojima user ima pristup i nivo pristupa za svako skladiste
    /**
     * Constructs empty user
     */
    public AbstractUser() {

    }
    /**
     * Method checks if storage with given storageNameAndPath exists.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param storageNameAndPath
     * @return
     */
    public abstract boolean storageExists(String storageNameAndPath);
    /**
     * Creates folder which represents storage root folder with given name on given location.
     * User who called method(with following username and password) is admin of storage.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param storageNameAndPath
     * @param username
     * @param password
     * @return
     */
    public abstract int initStorage(String storageNameAndPath, String username, String password);
    /**
     * Logs in user data and storage data.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param storageNameAndPath
     * @param username
     * @param password
     * @return
     */
    public abstract int logIn(String storageNameAndPath, String username, String password);
    /**
     * Creates directory with given dirName on following path
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param dirName
     * @param path
     * @return
     */
    public abstract int createDir(String dirName, String path);
    /**
     * Creates directory with dirName.Inside that directory, creates multiple directories(numberOfDirs) with given namePrefix
     * and counter number-> e.g. name prefix = "dir" and numberOfDirs = 3 -> creates dir1, dir2, dir3
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param dirName
     * @param path
     * @param namePrefix
     * @param numberOfFiles
     * @return
     */
    public abstract int createDir(String dirName, String path, String namePrefix, int numberOfFiles);
    /**
     * Creates file with fileName, on given path. File type e.g. .txt , .png ...
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param fileName
     * @param path
     * @param fileType
     * @return
     */
    public abstract int createFile(String fileName, String path, String fileType);
    /**
     * Uploads file with fileName from path to location whereToUpload. File type e.g. .txt , .png ...
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param fileName
     * @param path
     * @param whereToUpload
     * @param fileType
     * @return
     */
    public abstract int uploadExistingFile(String fileName, String path, String whereToUpload, String fileType);
    /**
     * Moves multiple files with given filePaths to location whereToMove
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param filePaths
     * @param whereToMove
     * @return
     */
    public abstract int move(Collection<String> files, String path);
    /**
     * Moves file with given filePath to location whereToMove
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param filePath
     * @param whereToMove
     * @return
     */
    public abstract int move(String filePath, String whereToMove);
    /**
     * Deletes file or folder with given path.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param path
     * @return
     */
    public abstract int delete(String path);
    /**
     *  Downloads file or folder with given path to location whereToDownload
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param path
     * @param whereToDownload
     * @return
     */
    public abstract int download(String path, String whereToDownload);
    /**
     * Returns paths of files in given directory with path: dirPath
     * @param dirPath
     * @return
     */
    public abstract Collection<String> searchFilesInDir(String dirPath);
    /**
     * Returns paths of folders in given directory with path: dirPath
     * @param dirPath
     * @return
     */
    public abstract Collection<String> searchDirsInDir(String dirPath);
    /**
     * Returns paths of found files or folders with fileName in storage
     * @param fileName
     * @return
     */
    public abstract Collection<String> searchByName(String fileName);
    /**
     * Returns paths of found files with extension in given directory with dirPath
     * @param extension
     * @param dirPath
     * @return
     */
    public abstract Collection<String> searchByExtension(String extension,String dirPath);
    /**
     * Returns paths of found files in directory with dirPath sorted by name alphabetically
     * @param dir
     * @return
     */
    public abstract Collection<String> getFilesInDirSortedByName(String dir);
    /**
     * Returns String which represents date when file or folder with given path has been modified
     * @param path
     * @return
     */
    public abstract String getModificationDate(String path);
    /**
     * Returns String which represents date when file or folder with given path has been created
     * @param path
     * @return
     */
    public abstract String getCreationDate(String path);
    /**
     * Returns paths of files created between start and end Date
     * @param start
     * @param end
     * @return
     */
    public abstract Collection<String> searchByDateCreationRange(Date start, Date end);//za celo skladiste
    /**
     * Returns paths of files created between start and end Date in directory with given dirPath
     * @param start
     * @param end
     * @param dirPath
     * @return
     */
    public abstract Collection<String> searchFilesInDirByDateCreationRange(Date start, Date end, String dirPath);

    /**
     * ADMIN OPERATIONS
     */

    /**
     * Sets size of storage in bytes.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param bytes
     * @return
     */
    public abstract int setStorageSize(int bytes);
    /**
     * Defines which file extensions are forbidden in storage.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param extensions
     * @return
     */
    public abstract int setForbiddenExtensions(Collection<String> extensions);
    /**
     * Defines maximum number of children in directory with given dirPath.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param number
     * @param dirPath
     * @return
     */
    public abstract int setMaxFileNumberInDir(int number, String dirPath);
    /**
     * Adds user with given username, password to storage. User has given level of privilege.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param userName
     * @param password
     * @param privilege
     * @return
     */
    public abstract int addUser(String userName, String password, Privilege privilege);
    /**
     * Removes user with given username from storage.
     * Returns 0 if error occurred.
     * Returns 1 if success.
     * @param userName
     * @return
     */
    public abstract int removeUser(String userName);
    /**
     * Getters and setters.
     * */
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, Privilege> getStoragesAndPrivileges() {
        return storagesAndPrivileges;
    }
    public void addStorage(String storageId, Privilege privilege){
        this.storagesAndPrivileges.put(storageId, privilege);
    }
    public void removeStorage(String storageId){
        this.storagesAndPrivileges.remove(storageId);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void initStoragesAndPrivileges(Map<String, Privilege> map) {
        this.storagesAndPrivileges = map;
    }

    public Storage getCurrentActiveStorage() {
        return currentActiveStorage;
    }

    public void setCurrentActiveStorage(Storage currentActiveStorage) {
        this.currentActiveStorage = currentActiveStorage;
    }
    public void setStoragesAndPrivileges(Map<String, Privilege> storagesAndPrivileges) {
        this.storagesAndPrivileges = storagesAndPrivileges;
    }
}
