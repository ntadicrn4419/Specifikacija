package storageSpec;

import java.util.Collection;
import java.util.Date;
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
     * @param storageNameAndPath
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract boolean storageExists(String storageNameAndPath);
    /**
     * Creates folder which represents storage root folder with given name on given location.
     * User who called method(with following username and password) is admin of storage.
     * @param storageNameAndPath
     * @param username
     * @param password
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int initStorage(String storageNameAndPath, String username, String password);
    /**
     * Logs in user data and storage data.
     * @param storageNameAndPath
     * @param username
     * @param password
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int logIn(String storageNameAndPath, String username, String password);
    /**
     * Creates directory with given dirName on following path
     * @param dirName
     * @param path
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int createDir(String dirName, String path);
    /**
     * Creates directory with dirName.Inside that directory, creates multiple directories(numberOfDirs) with given namePrefix
     * and counter number, e.g. name prefix = "dir" and numberOfDirs = 3 creates dir1, dir2, dir3
     * @param dirName
     * @param path
     * @param namePrefix
     * @param numberOfFiles
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int createDir(String dirName, String path, String namePrefix, int numberOfFiles);
    /**
     * Creates file with fileName, on given path. File type e.g. .txt , .png ...
     * @param fileName
     * @param path
     * @param fileType
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int createFile(String fileName, String path, String fileType);
    /**
     * Uploads file with fileName from path to location whereToUpload. File type e.g. .txt , .png ...
     * @param fileName
     * @param path
     * @param whereToUpload
     * @param fileType
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int uploadExistingFile(String fileName, String path, String whereToUpload, String fileType);
    /**
     * Moves multiple files with given filePaths to location whereToMove
     * @param files
     * @param path
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int move(Collection<String> files, String path);
    /**
     * Moves file with given filePath to location whereToMove
     * @param filePath
     * @param whereToMove
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int move(String filePath, String whereToMove);
    /**
     * Deletes file or folder with given path.
     * @param path
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int delete(String path);
    /**
     *  Downloads file or folder with given path to location whereToDownload.
     * @param path
     * @param whereToDownload
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int download(String path, String whereToDownload);
    /**
     * @param dirPath
     * @return Returns paths of files in given directory with path: dirPath
     */
    public abstract Collection<String> searchFilesInDir(String dirPath);
    /**
     * @param dirPath
     * @return Returns paths of folders in given directory with path: dirPath
     */
    public abstract Collection<String> searchDirsInDir(String dirPath);
    /**
     * @param fileName
     * @return Returns paths of found files or folders with fileName in storage
     */
    public abstract Collection<String> searchByName(String fileName);
    /**
     * @param extension
     * @param dirPath
     * @return Returns paths of found files with extension in given directory with dirPath
     */
    public abstract Collection<String> searchByExtension(String extension,String dirPath);
    /**
     * @param dir
     * @return Returns paths of found files in directory with dirPath sorted by name alphabetically
     */
    public abstract Collection<String> getFilesInDirSortedByName(String dir);
    /**
     * @param path
     * @return Returns String which represents date when file or folder with given path has been modified
     */
    public abstract String getModificationDate(String path);
    /**
     * @param path
     * @return Returns String which represents date when file or folder with given path has been created
     */
    public abstract String getCreationDate(String path);
    /**
     * @param start
     * @param end
     * @return Returns paths of files created between start and end Date
     */
    public abstract Collection<String> searchByDateCreationRange(Date start, Date end);//za celo skladiste
    /**
     * @param start
     * @param end
     * @param dirPath
     * @return Returns paths of files created between start and end Date in directory with given dirPath
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
     * @param extensions
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int setForbiddenExtensions(Collection<String> extensions);
    /**
     * Defines maximum number of children in directory with given dirPath.
     * @param number
     * @param dirPath
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int setMaxFileNumberInDir(int number, String dirPath);
    /**
     * Adds user with given username, password to storage. User has given level of privilege.
     * @param userName
     * @param password
     * @param privilege
     * @return Returns 0 if error occurred. Returns 1 if success.
     */
    public abstract int addUser(String userName, String password, Privilege privilege);
    /**
     * Removes user with given username from storage.
     * @param userName
     * @return Returns 0 if error occurred. Returns 1 if success.
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
