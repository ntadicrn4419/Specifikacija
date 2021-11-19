package storageSpec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Storage {
    /**
     * Defines name of the storage.
     * */
    private String storageName;
    /**
     * Defines unique storage id
     * */
    private String storageID;
    /**
     * Defines user that is currently working on this storage.
     * */
    private AbstractUser currentUser;
    /**
     * Defines root location of storage.
     * */
    private String rootLocation;// lokacija na racunaru(ili google drajvu) gde se nalazi direktorijum koji predstavlja ovo skladiste
    /**
     * Defines collection of users that have access to this storage.
     * */
    private Collection<AbstractUser> users;
    /**
     * Defines size of storage in bytes.
     * */
    private int storageSize;
    /**
     * Defines which file extensions are forbidden in storage.
     * */
    private Collection<String> forbiddenExtensions;
    /**
     * Defines maximum number of children in directory. Key in map is directory id.
     * */
    private Map<String, Integer> dirsMaxChildrenCount;

    /**Constructs storage with fields.
     * @param storageName
     * @param cu
     * @param rootLocation
     * @param storageID
     */
    public Storage(String storageName, AbstractUser cu, String rootLocation, String storageID) {
        this.storageName = storageName;
        this.currentUser = cu;
        this.rootLocation = rootLocation;
        this.users = new ArrayList<>();
        this.storageID = storageID;
    }

    /**
     * Adds user in collection of users.
     * @param user
     */
    public void addUser(AbstractUser user){ this.users.add(user);}
    /**
     * Removes users from collection users.
     * @param user
     */
    public void removeUser(AbstractUser user){ this.users.remove(user);}

    /**
     * Getters and setters.
     */

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStorageID() {
        return storageID;
    }

    public void setStorageID(String storageID) {
        this.storageID = storageID;
    }

    public AbstractUser getCurrentUser() {
        return this.currentUser;
    }

    public void setCurrentUser(AbstractUser user) {
        this.currentUser = user;
    }

    public String getRootLocation() {
        return rootLocation;
    }

    public void setRootLocation(String rootLocation) {
        this.rootLocation = rootLocation;
    }

    public Collection<AbstractUser> getUsers() {
        return users;
    }

    public void setUsers(Collection<AbstractUser> users) {
        this.users = users;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public Collection<String> getForbiddenExtensions() {
        return forbiddenExtensions;
    }

    public void setForbiddenExtensions(Collection<String> forbiddenExtensions) {
        this.forbiddenExtensions = forbiddenExtensions;
    }

    public Map<String, Integer> getDirsMaxChildrenCount() {
        return dirsMaxChildrenCount;
    }

    public void setDirsMaxChildrenCount(Map<String, Integer> dirsMaxChildrenCount) {
        this.dirsMaxChildrenCount = dirsMaxChildrenCount;
    }
}
