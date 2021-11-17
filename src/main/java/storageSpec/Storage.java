package storageSpec;

import java.util.ArrayList;
import java.util.Collection;

public class Storage {

    private String storageName;
    private String storageID;
    private AbstractUser currentUser;
    private String rootLocation;// lokacija na racunaru(ili google drajvu) gde se nalazi direktorijum koji predstavlja ovo skladiste
    private Collection<AbstractUser> users;
    private int storageSize;
    private Collection<String> forbiddenExtensions;

    public Storage(String storageName, AbstractUser cu, String rootLocation, String storageID) {
        this.storageName = storageName;
        this.currentUser = cu;
        this.rootLocation = rootLocation;
        this.users = new ArrayList<>();
        this.storageID = storageID;
    }

    public void addUser(AbstractUser user){ this.users.add(user);}
    public void removeUser(AbstractUser user){ this.users.remove(user);}

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
}
